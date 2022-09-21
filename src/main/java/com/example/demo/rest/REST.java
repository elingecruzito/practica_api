package com.example.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cuentas;
import com.example.demo.service.Services;

@RestController
@RequestMapping("/api/cuenta/")
@CrossOrigin(origins = "http://localhost:4200/")
public class REST {
	
	@Autowired
	private Services service;
	
	@PostMapping
	private ResponseEntity<Cuentas> save(@RequestBody Cuentas model){
		Cuentas temp = service.create(model);
		try {
			return ResponseEntity.created(new URI("/api/cuenta/"+temp.getId_cuenta())).body(temp);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping
	private ResponseEntity<List<Cuentas>> all(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@DeleteMapping(path = "/{Id}")
	private ResponseEntity<Void> delete(@PathVariable ("Id") Long id){
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(path = "/{Id}")
	private ResponseEntity<Cuentas> findById(@PathVariable ("Id") Long id){
		return ResponseEntity.of(service.findById(id));
	}
	
}
