package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cuentas;

public interface Repository 
	extends JpaRepository<Cuentas, Long>{}
