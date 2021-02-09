package com.nexus.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nexus.demo.entity.LibroEntity;

public interface ILibroDao extends MongoRepository<LibroEntity, String> {

	@Query("{ 'titulo' : ?0 }")
	List<LibroEntity> findByTitulo(String titulo);

}
