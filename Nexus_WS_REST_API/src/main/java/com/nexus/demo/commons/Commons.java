package com.nexus.demo.commons;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.nexus.demo.constans.Constants;
import com.nexus.demo.dto.AutorDto;
import com.nexus.demo.dto.EditorialDto;
import com.nexus.demo.dto.LibroDto;
import com.nexus.demo.entity.AutorEntity;
import com.nexus.demo.entity.EditorialEntity;
import com.nexus.demo.entity.LibroEntity;
import com.nexus.demo.exceptions.DataException;
import com.nexus.demo.exceptions.ValidationException;
import com.nexus.response.Response;

public class Commons {

	private static Validator validator;

	private Commons() {
	}

	public static List<String> getViolations(Object data) {
		loadValidator();
		List<String> result = new ArrayList<>();
		Set<ConstraintViolation<Object>> violations = validator.validate(data);

		for (ConstraintViolation<Object> violation : violations) {
			result.add(violation.getMessage());
		}

		return result;
	}

	public static void loadValidator() {
		if (validator == null) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			validator = factory.getValidator();
		}
	}

	public static String getListAsString(List<String> list) {
		return String.join(",", list);
	}

	public static String generateUUID() {
		return UUID.randomUUID().toString();
	}

	public static void getExceptionMessage(Exception ex, Response res) {
		res.setStatus(Constants.STATUS_FAIL);
		if (ex instanceof ValidationException) {
			res.setDescripcion(String.format(Constants.ERROR_VALIDATE_REQ_DATA, ex.getMessage()));
		} else if (ex instanceof DataException) {
			if((((DataException) ex).getType()).equals(Constants.TYPE_AUTOR)) {
				res.setDescripcion(String.format(Constants.ERROR_AUTOR_NOT_FOUND, ex.getMessage()));
			}else if((((DataException) ex).getType()).equals(Constants.TYPE_EDITORIAL)){
				res.setDescripcion(String.format(Constants.ERROR_EDITORIAL_NOT_FOUND, ex.getMessage()));
			}
		} else {
			res.setDescripcion(String.format(Constants.ERROR_GENERIC, ex.getMessage()));
		}
	}

	public static void getCreateRegister(String id, Response res) {
		res.setStatus(Constants.STATUS_OK);
		res.setDescripcion(String.format(Constants.REGISTER_CREATED, id));
	}
	
	public static void getStatusOk(Response res) {
		res.setStatus(Constants.STATUS_OK);
		res.setDescripcion(Constants.TRANSACTION_OK);
	}

	public static EditorialEntity convertEditDtoToEntity(EditorialDto editDto) {

		EditorialEntity entity = new EditorialEntity();
		entity.setCorreoElectronico(editDto.getCorreoElectronico());
		entity.setDirCorrespEditorial(editDto.getDirCorrespEditorial());
		entity.setIdEditorial(generateUUID());
		entity.setMaxLibrosReg(editDto.getMaxLibrosReg());
		entity.setNombreEditorial(editDto.getNombreEditorial());
		entity.setTelefono(editDto.getTelefono());

		return entity;

	}

	public static AutorEntity convertAutorDtoToToEntity(AutorDto autorDto) {

		AutorEntity entity = new AutorEntity();
		entity.setCiudadProveniencia(autorDto.getCiudadProveniencia());
		entity.setCorreoElectronico(autorDto.getCorreoElectronico());
		entity.setFechaNacimiento(autorDto.getFechaNacimiento());
		entity.setIdAutor(generateUUID());
		entity.setNombreCompleto(autorDto.getNombreCompleto());
		return entity;

	}

	public static LibroEntity convertLibroDtoToToEntity(LibroDto libroDto) {

		LibroEntity entity = new LibroEntity();
		entity.setAnio(libroDto.getAnio());
		entity.setAutor(libroDto.getAutor());
		entity.setEditorial(libroDto.getEditorial());
		entity.setGenero(libroDto.getGenero());
		entity.setIdLibro(generateUUID());
		entity.setNumPaginas(libroDto.getNumPaginas());
		entity.setTitulo(libroDto.getTitulo());
		return entity;

	}
	
	public static LibroDto convertLibroEntityToDto(LibroEntity entity) {

		LibroDto dto = new LibroDto();
		dto.setAnio(entity.getAnio());
		dto.setAutor(entity.getAutor());
		dto.setEditorial(entity.getEditorial());
		dto.setGenero(entity.getGenero());
		dto.setNumPaginas(entity.getNumPaginas());
		dto.setTitulo(entity.getTitulo());
		return dto;

	}

}
