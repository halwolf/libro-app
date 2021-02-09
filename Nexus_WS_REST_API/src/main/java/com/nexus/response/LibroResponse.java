package com.nexus.response;

import java.util.List;

import com.nexus.demo.dto.LibroDto;

public class LibroResponse extends Response {
	
	List<LibroDto> libros;

	public final List<LibroDto> getLibros() {
		return libros;
	}

	public final void setLibros(List<LibroDto> libros) {
		this.libros = libros;
	}

}
