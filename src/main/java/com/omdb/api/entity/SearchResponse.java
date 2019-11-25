package com.omdb.api.entity;


import java.util.ArrayList;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document("SearchMovies")
public class SearchResponse {
	 @JsonProperty(value = "Response")
	    private String response;

	    private String totalResults;
	    @JsonProperty(value ="Search")
	    private ArrayList<SearchResult> searchResult;

	    public SearchResponse() {
	    }

	    @Override
	    public String toString() {
	        return "SearchResponse{" +
	                "response='" + response + '\'' +
	                ", totalResults='" + totalResults + '\'' +
	                ", searchResult=" + searchResult +
	                '}';
	    }

	    public String getResponse() {
	        return response;
	    }

	    public void setResponse(String response) {
	        this.response = response;
	    }

	    public String getTotalResults() {
	        return totalResults;
	    }

	    public void setTotalResults(String totalResults) {
	        this.totalResults = totalResults;
	    }

	    public ArrayList<SearchResult> getSearchResult() {
	        return searchResult;
	    }

	    public void setSearchResult(ArrayList<SearchResult> searchResult) {
	        this.searchResult = searchResult;
	    }
}