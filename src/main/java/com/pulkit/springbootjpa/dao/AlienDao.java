package com.pulkit.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pulkit.springbootjpa.model.Alien;

// CrudRepository contains all CRUD method ( return iterable)
// JpaRepository return list and It has pagination+sorting+ extends CrudRepository

//@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens") - no need to specify controller it will manage by itself
public interface AlienDao extends JpaRepository<Alien, Integer> {
	List<Alien> findByTech(String tech); // used naming convention
	
	List<Alien> findByaIdGreaterThan(int id); // used naming convention
	
	@Query("from Alien where tech=?1 order by aName")
	List<Alien> findByTechAndSortOnName(String tech); // used our custom query
}
