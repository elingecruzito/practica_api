package com.example.demo.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Service
public class PokemonService {
	
	private static final String URL = "https://pokeapi.co/api/v2/pokemon/";
	private static final RestTemplate template = new RestTemplate();
	
	private JsonObject getDataClient(String name) {
		return new Gson().fromJson(template.getForObject(URL.concat(name), String.class), JsonObject.class);
	}
	
	public String getAbilities(String name) {
		return getDataClient(name).getAsJsonArray("abilities").toString();
	}
	
	public Integer getBaseExp(String name) {
		return Integer.parseInt(getDataClient(name).get("base_experience").toString());
	}
	
	public String getHeldIntems(String name) {
		return getDataClient(name).getAsJsonArray("held_items").toString();
	}
	
	public Integer getId(String name) {
		return Integer.parseInt(getDataClient(name).get("id").toString());
	}
	
	public String getName(String name) {
		return getDataClient(name).get("name").toString();
	}
	
	public String getLocationArea(String name) {
		return getDataClient(name).get("location_area_encounters").toString();
	}
	
}
