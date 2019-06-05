package com.telesko.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telesko.demo.model.Alien;

// public interface IAlienRepo extends CrudRepository<Alien, Integer>   --> AT THE PLACE OF CrudRepository we can use JPA repository so that we can get List instead of Iterable.

public interface IAlienRepo extends JpaRepository<Alien, Integer> {

	List<Alien> findByTech(String tech); 
	//JPA will internally implement this method protocol is like starts with findBy --- and Tech --> as Property name
	
	List<Alien> findByAidGreaterThan(int aid); // follow the protocol
	
	//user defined complex query using JPQL
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
}
