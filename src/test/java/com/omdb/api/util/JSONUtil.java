package com.omdb.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JSONUtil {

	private JSONUtil() {
	}

	public static String toJSONString(Object value) throws InvalidDataException {
		return convertToJson(value, new ObjectMapper().writer());
	}

	public static String toPrettyJSONString(Object value) throws InvalidDataException {
		return convertToJson(value, new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT).writer());
	}

	private static String convertToJson(Object value, ObjectWriter writer) throws InvalidDataException {
		try {
			return writer.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			throw new InvalidDataException();
		}
	}

	public static <T> T fromJSONString(String jsonValue, Class<T> to) throws InvalidDataException {
		return fromJSONString(jsonValue, to, false);
	}

	public static <T> T fromJSONString(String jsonValue, Class<T> to, boolean ignoreUnknown)
			throws InvalidDataException {
		try {
			ObjectMapper mapper = new ObjectMapper();

			if (ignoreUnknown) {
				mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			}
			return mapper.readValue(jsonValue, to);
		} catch (Exception e) {
			throw new InvalidDataException();
		}
	}

	public static <T> T fromJSONString(String jsonValue, TypeReference<T> to) throws InvalidDataException {
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(jsonValue, to);
		} catch (Exception e) {
			throw new InvalidDataException();
		}
	}
}
