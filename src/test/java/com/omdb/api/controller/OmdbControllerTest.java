package com.omdb.api.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.MultiValueMap;

import com.omdb.api.util.TestUtil;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class OmdbControllerTest {

	String URL = "/omdb/moviedetail/tt4853102";
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	@Autowired
	private MockMvc mockMvc;



	@Test
	void testSearchById() throws Exception {

		 String result = mockMvc.perform(get(URL).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		 
		Map<String, Object> templateParams = null;
		String expectedOutPut = TestUtil.getTransformedJSON("output/Batman.json", templateParams);
		Assertions.assertNotNull(expectedOutPut);
		JSONAssert.assertEquals(result, expectedOutPut,false);
	}

	private HttpEntity buildHttpEntity(String body) {
		MultiValueMap headers = null;
		HttpEntity httpEntity = new HttpEntity(body, headers);
		return httpEntity;
	}

}