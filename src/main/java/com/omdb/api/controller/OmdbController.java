package com.omdb.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omdb.api.entity.MovieDetails;
import com.omdb.api.entity.SearchResponse;
import com.omdb.api.entity.SearchResult;
import com.omdb.api.service.MovieDetailsService;
import com.omdb.api.service.SearchResponseService;
import com.omdb.api.service.SearchResultService;

@RestController
@RequestMapping("/omdb")
public class OmdbController {
	//http://www.omdbapi.com/?s=Batman&page=2&apikey=125538ec
	@Autowired
	private SearchResponseService searchResponseService;
	@Autowired
	private MovieDetailsService movieDetailsService;
	@Autowired
	private SearchResultService searchResultService;
	
	@GetMapping("/search/{text}")
    public SearchResponse searchByText(@PathVariable("text") final String searchText) {
        System.out.println("searchText = " + searchText);
        return searchResponseService.searchByText(searchText);
    }
		
	@GetMapping("/moviedetail/{id}")
	public MovieDetails searchById(@PathVariable("id") final String id) {
		System.out.println("searchId"+id);
		return movieDetailsService.searchById(id).orElse(null);
		
	}
	@GetMapping("/movies/{id}")
	public Optional<SearchResult> searchByMoviesId(@PathVariable("id") final String id) {
		return searchResultService.searchByMoviesId(id);
	
	}
	@GetMapping("/moviedetailsbytitle/{title}")
	public List<MovieDetails> searchMovieDetailsByTitle(@PathVariable("title") final String title){
		return movieDetailsService.searchMovieDetailsByTitle(title);
		
	}
	@GetMapping("/moviesbytitle/{title}")
	public List<SearchResult> searchMoviesByText(@PathVariable("title") final String title){
		return searchResultService.searchMoviesByTitle(title);
		
	}
}
