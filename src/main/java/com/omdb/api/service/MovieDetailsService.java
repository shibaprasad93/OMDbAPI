package com.omdb.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.omdb.api.entity.MovieDetails;
import com.omdb.api.repository.MovieDetailsRepository;

@Service
public class MovieDetailsService {

	@Autowired
	private MovieDetailsRepository movieDetailsRepository;

	public Optional<MovieDetails> searchById(String id) {
		return movieDetailsRepository.findById(id);
	}

	@Cacheable("list")
	public List<MovieDetails> searchMovieDetailsByTitle(String title) {
		System.out.println("MovieDetailsService.searchMovieDetailsByTitle()****from db");
		return movieDetailsRepository.findAll();
		}
	
	
	
	

}
