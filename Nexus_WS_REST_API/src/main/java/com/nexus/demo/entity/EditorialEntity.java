package com.nexus.demo.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "editoriales")
@JsonPropertyOrder({ "idEditorial","nombreEditorial", "direccionCorrespondencia", "telefono", "correoElectronico", "maxLibrosReg" })
public class EditorialEntity {

	@Id
	@NotNull
	private String idEditorial;
	@NotNull
	private String nombreEditorial;
	@NotNull
	private String dirCorrespEditorial;
	@NotNull
	private String telefono;
	private String correoElectronico;
	@NotNull
	private int maxLibrosReg;

	public String getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(String idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getNombreEditorial() {
		return nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	public String getDirCorrespEditorial() {
		return dirCorrespEditorial;
	}

	public void setDirCorrespEditorial(String dirCorrespEditorial) {
		this.dirCorrespEditorial = dirCorrespEditorial;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public int getMaxLibrosReg() {
		return maxLibrosReg;
	}

	public void setMaxLibrosReg(int maxLibrosReg) {
		this.maxLibrosReg = maxLibrosReg;
	}

	@Override
	public String toString() {
		return "EditorialEntity [idEditorial=" + idEditorial + ", nombreEditorial=" + nombreEditorial
				+ ", dirCorrespEditorial=" + dirCorrespEditorial + ", telefono=" + telefono + ", correoElectronico="
				+ correoElectronico + ", maxLibrosReg=" + maxLibrosReg + "]";
	}

}
