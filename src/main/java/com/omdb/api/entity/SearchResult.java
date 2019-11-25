package com.omdb.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
@Document("Movies")
public class SearchResult {
	@JsonProperty(value = "Type")
    private String type;
    @JsonProperty(value = "Year")
    private String year;
    @Id
    @JsonProperty(value = "imdbID")
    private String imdbID;
    @JsonProperty(value = "Poster")
    private String poster;
    @JsonProperty(value = "Title")
    private String title;

    public SearchResult() {
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "type='" + type + '\'' +
                ", year='" + year + '\'' +
                ", imdbID='" + imdbID + '\'' +
                ", poster='" + poster + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
