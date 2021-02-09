package com.nexus.demo.service;

import java.util.List;

import com.nexus.demo.dto.LibroDto;

public interface ILibroService {
	
	public String saveLibro(LibroDto libroDto);
	
	public List<LibroDto> getLibros();
	
}
