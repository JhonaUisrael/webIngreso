package com.example.webIngreso.Util;

import java.util.List;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJson<T>{

	private final Class<T> objectType;
	private final ObjectMapper mapper;

	
	public ConvertJson(Class<T> objectType ) {
		this.objectType=objectType;
		this.mapper= new ObjectMapper();
	}
	
	

	public List<T> ConvertJsonToArray(String jsonPath) {
		
		try {
			JavaType type= mapper.getTypeFactory().constructCollectionType(List.class, objectType);
			return mapper.readValue(jsonPath, type);
		} catch (Exception e) {
			throw new RuntimeException("Error "+e.getMessage());
		}
	}
}
