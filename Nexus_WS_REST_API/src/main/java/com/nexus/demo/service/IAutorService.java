package com.nexus.demo.service;

import com.nexus.demo.dto.AutorDto;

public interface IAutorService {
	
	public String saveAutor(AutorDto autorDto);
	
	public boolean existByNombreCompleto(String nombreCompleto);
	
}
