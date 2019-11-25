package com.omdb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.omdb.api.entity.SearchResponse;

@Repository
public interface SearchResponseRepository extends MongoRepository<SearchResponse, String> {

}
