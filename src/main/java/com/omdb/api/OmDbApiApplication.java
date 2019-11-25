package com.omdb.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class OmDbApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmDbApiApplication.class, args);
	}

}
