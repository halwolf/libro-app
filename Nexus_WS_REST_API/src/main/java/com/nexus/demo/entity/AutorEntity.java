package com.nexus.demo.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "autores")
@JsonPropertyOrder({ "idAutor", "titulo", "genero", "numPaginas", "editorial", "autor" })
public class AutorEntity {

	@Id
	@NotNull
	private String idAutor;
	@NotNull
	private String nombreCompleto;
	private String fechaNacimiento;
	private String ciudadProveniencia;
	private String correoElectronico;

	public String getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(String idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public final String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public final void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudadProveniencia() {
		return ciudadProveniencia;
	}

	public void setCiudadProveniencia(String ciudadProveniencia) {
		this.ciudadProveniencia = ciudadProveniencia;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "AutorEntity [idAutor=" + idAutor + ", nombreCompleto=" + nombreCompleto + ", fechaNacimiento="
				+ fechaNacimiento + ", ciudadProveniencia=" + ciudadProveniencia + ", correoElectronico="
				+ correoElectronico + "]";
	}

}
