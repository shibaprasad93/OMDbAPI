package com.omdb.api.util;

import static java.nio.file.Files.readAllBytes;
import static java.util.UUID.randomUUID;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Map;

import org.mvel2.templates.TemplateCompiler;
import org.mvel2.templates.TemplateRuntime;


public class TestUtil {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TestUtil.class);
	 private TestUtil() {}

	  public static String getTransformedJSON(String inputFilePath, Map<String, Object> dynaParams) {
	    return (String)
	        TemplateRuntime.execute(
	            TemplateCompiler.compileTemplate(readFileContent(inputFilePath)), dynaParams);
	  }

	  public static String readFileContent(String inputFilePath) {
	    try {
	      return new String(
	          readAllBytes(Paths.get(ClassLoader.getSystemResource(inputFilePath).toURI())));
	    } catch (URISyntaxException | IOException e) {
	      log.error("Unable to read the classpath Json File: " + inputFilePath, e);
	      throw new RuntimeException(e);
	    }
	  }

	    public static String generateRandomUUID() {
	    return randomUUID().toString();
	    }
}
