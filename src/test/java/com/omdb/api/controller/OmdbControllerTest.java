package com.omdb.api.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import com.omdb.api.OmDbApiApplication;
import com.omdb.api.entity.MovieDetails;

@SpringBootTest(classes = OmDbApiApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class OmdbControllerTest {
	
	String URL="omdb/moviedetail/tt4853102";
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	//@Test
	void testSearchByText() {
		fail("Not yet implemented");
	}

	@Test
	void testSearchById() {
		HttpEntity requestEntity;
		assertNotNull(
                this.restTemplate
                    .exchange("http://localhost:" + port + URL, HttpMethod.GET, requestEntity, MediaType.APPLICATION_JSON_VALUE));
                    //("http://localhost:" + port + URL, MovieDetails.class));
	}

	//@Test
	void testSearchMovieDetailsByTitle() {
		fail("Not yet implemented");
	}

}
