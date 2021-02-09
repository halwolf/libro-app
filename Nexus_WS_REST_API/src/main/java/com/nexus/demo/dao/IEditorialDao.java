package com.nexus.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nexus.demo.entity.EditorialEntity;

public interface IEditorialDao extends MongoRepository<EditorialEntity, String> {
	
	@Query("{ 'nombreEditorial' : ?0 }")
	List<EditorialEntity> findByNombreEditorial(String nombreEditorial);
	

}
