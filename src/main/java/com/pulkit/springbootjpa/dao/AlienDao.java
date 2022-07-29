package com.pulkit.springbootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.pulkit.springbootjpa.model.Alien;

// CrudRepository contains all CRUD method
public interface AlienDao extends CrudRepository<Alien, Integer> {
	
}
