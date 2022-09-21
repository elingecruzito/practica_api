package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PokemonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/api/pokemon/")
public class PokemonRest {
	
	@Autowired
	private PokemonService service;
	
	@GetMapping("abilities/{name}")
	public String getAbilities(@PathVariable String name) throws JsonMappingException, JsonProcessingException{
		return service.getAbilities(name);
	} 
	
	@GetMapping("baseExp/{name}")
	public Integer getBaseExp(@PathVariable String name) throws JsonMappingException, JsonProcessingException{
		return service.getBaseExp(name);
	} 
	
	@GetMapping("heldItems/{name}")
	public String getHeldItems(@PathVariable String name) throws JsonMappingException, JsonProcessingException{
		return service.getHeldIntems(name);
	} 
	
	@GetMapping("id/{name}")
	public Integer getId(@PathVariable String name) throws JsonMappingException, JsonProcessingException{
		return service.getId(name);
	} 
	
	@GetMapping("name/{name}")
	public String getName(@PathVariable String name) throws JsonMappingException, JsonProcessingException{
		return service.getName(name);
	}
	
	@GetMapping("location/{name}")
	public String getLocation(@PathVariable String name) throws JsonMappingException, JsonProcessingException{
		return service.getLocationArea(name);
	}
}
