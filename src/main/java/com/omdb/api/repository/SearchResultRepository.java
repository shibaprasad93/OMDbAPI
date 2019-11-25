package com.omdb.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.omdb.api.entity.SearchResult;

public interface SearchResultRepository extends MongoRepository<SearchResult, String> {


}
