package com.omdb.api.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class AppProperties {
	private Map<String, String> properties=new HashMap<>();

	public Map<String, String> getProperties(){
		return properties;
		
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "AppProperties [properties=" + properties + "]";
	}
	

}
