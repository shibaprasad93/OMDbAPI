package com.omdb.api.entity;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document("MovieDetails")
public class MovieDetails {
	@JsonProperty("Title")
	private String Title;
	@JsonProperty("Year")
	private String Year;
	@JsonProperty("Rated")
	private String Rated;
	@JsonProperty("Released")
	private String Released;
	@JsonProperty("Runtime")
	private String Runtime;
	@JsonProperty("Genre")
	private String Genre;
	@JsonProperty("Director")
	private String Director;
	@JsonProperty("Writer")
	private String Writer;
	@JsonProperty("Actors")
	private String Actors;
	@JsonProperty("Plot")
	private String Plot;
	@JsonProperty("Language")
	private String Language;
	@JsonProperty("Country")
	private String Country;
	@JsonProperty("Awards")
	private String Awards;
	@JsonProperty("Poster")
	private String Poster;
	@JsonProperty("Ratings")
	ArrayList<Rating> Ratings;
	@JsonProperty("Metascore")
	private String Metascore;
	@JsonProperty("imdbRating")
	private String imdbRating;
	@JsonProperty("imdbVotes")
	private String imdbVotes;
	@Id
	@MongoId
	@JsonProperty("imdbID")
	private String imdbID;
	@JsonProperty("Type")
	private String Type;
	@JsonProperty("DVD")
	private String DVD;
	@JsonProperty("BoxOffice")
	private String BoxOffice;
	@JsonProperty("Production")
	private String Production;
	@JsonProperty("Website")
	private String Website;
	@JsonProperty("Response")
	private String Response;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getRated() {
		return Rated;
	}

	public void setRated(String rated) {
		Rated = rated;
	}

	public String getReleased() {
		return Released;
	}

	public void setReleased(String released) {
		Released = released;
	}

	public String getRuntime() {
		return Runtime;
	}

	public void setRuntime(String runtime) {
		Runtime = runtime;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public String getActors() {
		return Actors;
	}

	public void setActors(String actors) {
		Actors = actors;
	}

	public String getPlot() {
		return Plot;
	}

	public void setPlot(String plot) {
		Plot = plot;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getAwards() {
		return Awards;
	}

	public void setAwards(String awards) {
		Awards = awards;
	}

	public String getPoster() {
		return Poster;
	}

	public void setPoster(String poster) {
		Poster = poster;
	}

	public ArrayList<Rating> getRatings() {
		return Ratings;
	}

	public void setRatings(ArrayList<Rating> ratings) {
		Ratings = ratings;
	}

	public String getMetascore() {
		return Metascore;
	}

	public void setMetascore(String metascore) {
		Metascore = metascore;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDVD() {
		return DVD;
	}

	public void setDVD(String dVD) {
		DVD = dVD;
	}

	public String getBoxOffice() {
		return BoxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		BoxOffice = boxOffice;
	}

	public String getProduction() {
		return Production;
	}

	public void setProduction(String production) {
		Production = production;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getResponse() {
		return Response;
	}

	public void setResponse(String response) {
		Response = response;
	}

	@Override
	public String toString() {
		return "MovieDetails [Title=" + Title + ", Year=" + Year + ", Rated=" + Rated + ", Released=" + Released
				+ ", Runtime=" + Runtime + ", Genre=" + Genre + ", Director=" + Director + ", Writer=" + Writer
				+ ", Actors=" + Actors + ", Plot=" + Plot + ", Language=" + Language + ", Country=" + Country
				+ ", Awards=" + Awards + ", Poster=" + Poster + ", Ratings=" + Ratings + ", Metascore=" + Metascore
				+ ", imdbRating=" + imdbRating + ", imdbVotes=" + imdbVotes + ", imdbID=" + imdbID + ", Type=" + Type
				+ ", DVD=" + DVD + ", BoxOffice=" + BoxOffice + ", Production=" + Production + ", Website=" + Website
				+ ", Response=" + Response + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Actors == null) ? 0 : Actors.hashCode());
		result = prime * result + ((Awards == null) ? 0 : Awards.hashCode());
		result = prime * result + ((BoxOffice == null) ? 0 : BoxOffice.hashCode());
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result + ((DVD == null) ? 0 : DVD.hashCode());
		result = prime * result + ((Director == null) ? 0 : Director.hashCode());
		result = prime * result + ((Genre == null) ? 0 : Genre.hashCode());
		result = prime * result + ((Language == null) ? 0 : Language.hashCode());
		result = prime * result + ((Metascore == null) ? 0 : Metascore.hashCode());
		result = prime * result + ((Plot == null) ? 0 : Plot.hashCode());
		result = prime * result + ((Poster == null) ? 0 : Poster.hashCode());
		result = prime * result + ((Production == null) ? 0 : Production.hashCode());
		result = prime * result + ((Rated == null) ? 0 : Rated.hashCode());
		result = prime * result + ((Ratings == null) ? 0 : Ratings.hashCode());
		result = prime * result + ((Released == null) ? 0 : Released.hashCode());
		result = prime * result + ((Response == null) ? 0 : Response.hashCode());
		result = prime * result + ((Runtime == null) ? 0 : Runtime.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result + ((Website == null) ? 0 : Website.hashCode());
		result = prime * result + ((Writer == null) ? 0 : Writer.hashCode());
		result = prime * result + ((Year == null) ? 0 : Year.hashCode());
		result = prime * result + ((imdbID == null) ? 0 : imdbID.hashCode());
		result = prime * result + ((imdbRating == null) ? 0 : imdbRating.hashCode());
		result = prime * result + ((imdbVotes == null) ? 0 : imdbVotes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (Actors == null) {
			if (other.Actors != null)
				return false;
		} else if (!Actors.equals(other.Actors))
			return false;
		if (Awards == null) {
			if (other.Awards != null)
				return false;
		} else if (!Awards.equals(other.Awards))
			return false;
		if (BoxOffice == null) {
			if (other.BoxOffice != null)
				return false;
		} else if (!BoxOffice.equals(other.BoxOffice))
			return false;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (DVD == null) {
			if (other.DVD != null)
				return false;
		} else if (!DVD.equals(other.DVD))
			return false;
		if (Director == null) {
			if (other.Director != null)
				return false;
		} else if (!Director.equals(other.Director))
			return false;
		if (Genre == null) {
			if (other.Genre != null)
				return false;
		} else if (!Genre.equals(other.Genre))
			return false;
		if (Language == null) {
			if (other.Language != null)
				return false;
		} else if (!Language.equals(other.Language))
			return false;
		if (Metascore == null) {
			if (other.Metascore != null)
				return false;
		} else if (!Metascore.equals(other.Metascore))
			return false;
		if (Plot == null) {
			if (other.Plot != null)
				return false;
		} else if (!Plot.equals(other.Plot))
			return false;
		if (Poster == null) {
			if (other.Poster != null)
				return false;
		} else if (!Poster.equals(other.Poster))
			return false;
		if (Production == null) {
			if (other.Production != null)
				return false;
		} else if (!Production.equals(other.Production))
			return false;
		if (Rated == null) {
			if (other.Rated != null)
				return false;
		} else if (!Rated.equals(other.Rated))
			return false;
		if (Ratings == null) {
			if (other.Ratings != null)
				return false;
		} else if (!Ratings.equals(other.Ratings))
			return false;
		if (Released == null) {
			if (other.Released != null)
				return false;
		} else if (!Released.equals(other.Released))
			return false;
		if (Response == null) {
			if (other.Response != null)
				return false;
		} else if (!Response.equals(other.Response))
			return false;
		if (Runtime == null) {
			if (other.Runtime != null)
				return false;
		} else if (!Runtime.equals(other.Runtime))
			return false;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (Website == null) {
			if (other.Website != null)
				return false;
		} else if (!Website.equals(other.Website))
			return false;
		if (Writer == null) {
			if (other.Writer != null)
				return false;
		} else if (!Writer.equals(other.Writer))
			return false;
		if (Year == null) {
			if (other.Year != null)
				return false;
		} else if (!Year.equals(other.Year))
			return false;
		if (imdbID == null) {
			if (other.imdbID != null)
				return false;
		} else if (!imdbID.equals(other.imdbID))
			return false;
		if (imdbRating == null) {
			if (other.imdbRating != null)
				return false;
		} else if (!imdbRating.equals(other.imdbRating))
			return false;
		if (imdbVotes == null) {
			if (other.imdbVotes != null)
				return false;
		} else if (!imdbVotes.equals(other.imdbVotes))
			return false;
		return true;
	}

	public MovieDetails() {
	}

}
