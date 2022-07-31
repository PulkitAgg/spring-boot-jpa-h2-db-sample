package com.pulkit.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pulkit.springbootjpa.model.Alien;

// CrudRepository contains all CRUD method
public interface AlienDao extends CrudRepository<Alien, Integer> {
	List<Alien> findByTech(String tech); // used naming convention
	
	List<Alien> findByaIdGreaterThan(int id); // used naming convention
	
	@Query("from Alien where tech=?1 order by aName")
	List<Alien> findByTechAndSortOnName(String tech); // used our custom query
}
