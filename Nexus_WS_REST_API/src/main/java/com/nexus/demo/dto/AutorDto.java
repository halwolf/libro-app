package com.nexus.demo.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.nexus.demo.constans.Constants;

public class AutorDto {

	@NotEmpty(message = "Nombre Completo es Obligatorio")
	private String nombreCompleto;
	@Pattern(regexp = Constants.REGEX_DATE , message = "Formato de fecha no valido (yyyy-MM-dd)")
	private String fechaNacimiento;
	private String ciudadProveniencia;
	private String correoElectronico;

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
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
		return "AutorDto [nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciudadProveniencia=" + ciudadProveniencia + ", correoElectronico=" + correoElectronico + "]";
	}
	
	

}
