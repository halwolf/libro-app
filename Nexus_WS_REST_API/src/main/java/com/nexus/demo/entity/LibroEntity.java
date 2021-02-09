package com.nexus.demo.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "libro")
@JsonPropertyOrder({ "idLibro", "titulo", "anio", "genero", "numPaginas", "autor" })
public class LibroEntity {

	@Id
	@NotNull
	private String idLibro;
	@NotNull
	private String titulo;
	private String anio;
	@NotNull
	private String genero;
	@NotNull
	private int numPaginas;
	private String editorial;
	@NotNull
	private String autor;

	public String getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(String idLibro) {
		this.idLibro = idLibro;
	}

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

	@Override
	public String toString() {
		return "LibroEntity [idLibro=" + idLibro + ", titulo=" + titulo + ", anio=" + anio + ", genero=" + genero
				+ ", numPaginas=" + numPaginas + ", editorial=" + editorial + ", autor=" + autor + "]";
	}

}
