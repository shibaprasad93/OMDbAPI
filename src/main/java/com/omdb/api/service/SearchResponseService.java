package com.omdb.api.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.omdb.api.entity.MovieDetails;
import com.omdb.api.entity.SearchResponse;
import com.omdb.api.entity.SearchResult;
import com.omdb.api.properties.AppProperties;
import com.omdb.api.repository.MovieDetailsRepository;
import com.omdb.api.repository.SearchResponseRepository;
import com.omdb.api.repository.SearchResultRepository;
@Service
public class SearchResponseService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private MovieDetailsRepository movieDetailsRepository;
	@Autowired
	private SearchResponseRepository searchResponseRepository;
	@Autowired
	private SearchResultRepository searchResultRepository;
	@Autowired
	private AppProperties appProp;
	

	public SearchResponse searchByText(String text) {
		//"https://www.omdbapi.com/?s={text}&apikey=125538ec", SearchResponse.class, text
		String url=appProp.getProperties().get("url")+"s="+text+"&apikey="+appProp.getProperties().get("apikey");
		System.out.println(url);
		
		SearchResponse result = restTemplate.getForObject(url, SearchResponse.class, text);
		//System.out.println(result);
		ArrayList<MovieDetails> movieList=new ArrayList<>();
		ArrayList<SearchResult> responce = result.getSearchResult();
		System.out.println("movies"+responce);
		saveSearchResult(responce);
		for (SearchResult searchResult : responce) {
			//"https://www.omdbapi.com/?i={imdbID}&apikey=125538ec", MovieDetails.class, searchResult.getImdbID()
			String url2=appProp.getProperties().get("url")+"i="+"imdbID"+"&apikey="+appProp.getProperties().get("apikey");
			MovieDetails movieDetails = restTemplate.getForObject(url2, MovieDetails.class, searchResult.getImdbID());
			movieList.add(movieDetails);
		}
		 if (!Objects.isNull(movieList)) {
	            saveMovies(movieList);
		 }
		return searchResponseRepository.save(result);
	}

	private Collection<SearchResult> saveSearchResult(ArrayList<SearchResult> responce) {
		return searchResultRepository.saveAll(responce);
		
	}

	public Collection<MovieDetails> saveMovies(ArrayList<MovieDetails> movieList) {
		System.out.println("movieList"+movieList);
		return movieDetailsRepository.saveAll(movieList);
		
		
	}

}
