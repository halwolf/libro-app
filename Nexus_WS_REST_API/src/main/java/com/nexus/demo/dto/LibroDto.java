package com.nexus.demo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class LibroDto {

	@NotEmpty(message = "Titulo es Obligatorio")
	private String titulo;
	private String anio;
	@NotEmpty(message = "Genero es Obligatorio")
	private String genero;
	@Min(value = 1, message = "Numero de paginas no valido")
	private int numPaginas;
	private String editorial;
	@NotEmpty(message = "Autor es Obligatorio")
	private String autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
