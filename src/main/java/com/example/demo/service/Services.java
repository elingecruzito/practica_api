package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cuentas;
import com.example.demo.repository.Repository;

@Service
public class Services {
	
	@Autowired
	private Repository repository;
	
	public Cuentas create(Cuentas model) {
		return repository.save(model);
	}
	
	public List<Cuentas> findAll(){
		return repository.findAll();
	}
	
	public void delete(Long id_cuenta) {
		repository.deleteById(id_cuenta);
	}
	
	public Optional<Cuentas> findById(Long id_cuenta){
		return repository.findById(id_cuenta);
	}

}
