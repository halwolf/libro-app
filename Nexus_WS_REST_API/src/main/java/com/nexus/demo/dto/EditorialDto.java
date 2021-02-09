package com.nexus.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.nexus.demo.constans.Constants;

public class EditorialDto {

	@NotEmpty(message = "Nombre Editorial es Obligatorio")
	private String nombreEditorial;
	@NotEmpty(message = "Direccion Editorial es Obligatorio")
	private String dirCorrespEditorial;
	@Pattern(regexp = Constants.REGEX_ONLY_NUMBERS, message = "Campo telefono solo permite numeros")
	private String telefono;
	@Email
	private String correoElectronico;
	@Min(value = -1, message = "Valor de libros a registrar no permitido")
	private int maxLibrosReg;

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
		return "EditorialDto [nombreEditorial=" + nombreEditorial + ", dirCorrespEditorial=" + dirCorrespEditorial
				+ ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", maxLibrosReg="
				+ maxLibrosReg + "]";
	}

}
