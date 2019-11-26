package com.omdb.api.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


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
	//@Test
	void testSearchByText() {
		fail("Not yet implemented");
	}

	@Test
	void testSearchById() throws Exception {
//		HttpEntity requestEntity;
//		assertNotNull(
//                this.restTemplate
//                    .exchange("http://localhost:" + port + URL, HttpMethod.GET, requestEntity, MediaType.APPLICATION_JSON_VALUE));
//                    //("http://localhost:" + port + URL, MovieDetails.class));
		String actual="{\r\n" + 
				"  \"language\": \"English\",\r\n" + 
				"  \"runtime\": \"76 min\",\r\n" + 
				"  \"type\": \"movie\",\r\n" + 
				"  \"country\": \"USA\",\r\n" + 
				"  \"year\": \"2016\",\r\n" + 
				"  \"response\": \"True\",\r\n" + 
				"  \"writer\": \"Brian Azzarello, Brian Bolland (based on the graphic novel illustrated by), Bob Kane (Batman created by), Bill Finger (Batman created by)\",\r\n" + 
				"  \"title\": \"Batman: The Killing Joke\",\r\n" + 
				"  \"genre\": \"Animation, Action, Crime, Drama, Thriller\",\r\n" + 
				"  \"rated\": \"R\",\r\n" + 
				"  \"director\": \"Sam Liu\",\r\n" + 
				"  \"released\": \"25 Jul 2016\",\r\n" + 
				"  \"boxOffice\": \"$442,331\",\r\n" + 
				"  \"awards\": \"1 win & 2 nominations.\",\r\n" + 
				"  \"website\": \"N/A\",\r\n" + 
				"  \"metascore\": \"N/A\",\r\n" + 
				"  \"production\": \"The Answer Studio\",\r\n" + 
				"  \"actors\": \"Kevin Conroy, Mark Hamill, Tara Strong, Ray Wise\",\r\n" + 
				"  \"dvd\": \"02 Aug 2016\",\r\n" + 
				"  \"poster\": \"https://m.media-amazon.com/images/M/MV5BMTdjZTliODYtNWExMi00NjQ1LWIzN2MtN2Q5NTg5NTk3NzliL2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg\",\r\n" + 
				"  \"plot\": \"As Batman hunts for the escaped Joker, the Clown Prince of Crime attacks the Gordon family to prove a diabolical point mirroring his own fall into madness.\",\r\n" + 
				"  \"ratings\": [\r\n" + 
				"    {\r\n" + 
				"      \"value\": \"Internet Movie Database\",\r\n" + 
				"      \"source\": \"6.4/10\",\r\n" + 
				"      \"Source\": \"Internet Movie Database\",\r\n" + 
				"      \"Value\": \"6.4/10\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"value\": \"Rotten Tomatoes\",\r\n" + 
				"      \"source\": \"40%\",\r\n" + 
				"      \"Source\": \"Rotten Tomatoes\",\r\n" + 
				"      \"Value\": \"40%\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"Title\": \"Batman: The Killing Joke\",\r\n" + 
				"  \"Year\": \"2016\",\r\n" + 
				"  \"Rated\": \"R\",\r\n" + 
				"  \"Released\": \"25 Jul 2016\",\r\n" + 
				"  \"Runtime\": \"76 min\",\r\n" + 
				"  \"Genre\": \"Animation, Action, Crime, Drama, Thriller\",\r\n" + 
				"  \"Director\": \"Sam Liu\",\r\n" + 
				"  \"Writer\": \"Brian Azzarello, Brian Bolland (based on the graphic novel illustrated by), Bob Kane (Batman created by), Bill Finger (Batman created by)\",\r\n" + 
				"  \"Actors\": \"Kevin Conroy, Mark Hamill, Tara Strong, Ray Wise\",\r\n" + 
				"  \"Plot\": \"As Batman hunts for the escaped Joker, the Clown Prince of Crime attacks the Gordon family to prove a diabolical point mirroring his own fall into madness.\",\r\n" + 
				"  \"Language\": \"English\",\r\n" + 
				"  \"Country\": \"USA\",\r\n" + 
				"  \"Awards\": \"1 win & 2 nominations.\",\r\n" + 
				"  \"Poster\": \"https://m.media-amazon.com/images/M/MV5BMTdjZTliODYtNWExMi00NjQ1LWIzN2MtN2Q5NTg5NTk3NzliL2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg\",\r\n" + 
				"  \"Ratings\": [\r\n" + 
				"    {\r\n" + 
				"      \"value\": \"Internet Movie Database\",\r\n" + 
				"      \"source\": \"6.4/10\",\r\n" + 
				"      \"Source\": \"Internet Movie Database\",\r\n" + 
				"      \"Value\": \"6.4/10\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"value\": \"Rotten Tomatoes\",\r\n" + 
				"      \"source\": \"40%\",\r\n" + 
				"      \"Source\": \"Rotten Tomatoes\",\r\n" + 
				"      \"Value\": \"40%\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"Metascore\": \"N/A\",\r\n" + 
				"  \"imdbRating\": \"6.4\",\r\n" + 
				"  \"imdbVotes\": \"45,001\",\r\n" + 
				"  \"imdbID\": \"tt4853102\",\r\n" + 
				"  \"Type\": \"movie\",\r\n" + 
				"  \"DVD\": \"02 Aug 2016\",\r\n" + 
				"  \"BoxOffice\": \"$442,331\",\r\n" + 
				"  \"Production\": \"The Answer Studio\",\r\n" + 
				"  \"Website\": \"N/A\",\r\n" + 
				"  \"Response\": \"True\"\r\n" + 
				"}";

		 String result = mockMvc.perform(get(URL).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

		JSONAssert.assertEquals(result, actual, false);
	}

	//@Test
	void testSearchMovieDetailsByTitle() {
		
	}

}