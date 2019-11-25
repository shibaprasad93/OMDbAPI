package com.omdb.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omdb.api.entity.SearchResult;
import com.omdb.api.repository.SearchResultRepository;

@Service
public class SearchResultService {
	@Autowired
	private SearchResultRepository searchResultRepository;

	public Optional<SearchResult> searchByMoviesId(String id) {
		return searchResultRepository.findById(id);
	}

	public List<SearchResult> searchMoviesByTitle(String title) {
		return searchResultRepository.findAll();
	}


}