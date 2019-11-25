package com.omdb.api.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Rating {
	@JsonProperty("Source")
    private String Value;
    @JsonProperty("Value")
    private String Source;

    @Override
    public String toString() {
        return "Rating{" +
                "Value='" + Value + '\'' +
                ", Source='" + Source + '\'' +
                '}';
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return Objects.equals(Value, rating.Value) &&
                Objects.equals(Source, rating.Source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Value, Source);
    }

    public Rating() {
    }
	

}
