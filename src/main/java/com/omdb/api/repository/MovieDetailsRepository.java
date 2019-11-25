package com.omdb.api.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.omdb.api.entity.MovieDetails;
@Repository
public interface MovieDetailsRepository extends MongoRepository<MovieDetails, String> {
   List<MovieDetails> findByTitle(String title);
   
	
}
