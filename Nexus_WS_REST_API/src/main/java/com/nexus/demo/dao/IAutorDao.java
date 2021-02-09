package com.nexus.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nexus.demo.entity.AutorEntity;

public interface IAutorDao extends MongoRepository<AutorEntity, String> {
	
	@Query("{ 'nombreCompleto' : ?0 }")
	List<AutorEntity> findByNombreCompleto(String nombreCompleto);
	
}
