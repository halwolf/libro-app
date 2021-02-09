package com.nexus.demo.constans;

public class Constants {

	public static final String WS_EDITORIAL_PATH = "/editorial";
	public static final String WS_LIBRO_PATH = "/libro";
	public static final String WS_AUTOR_PATH = "/autor";
	
	public static final String WS_METHOD_ADD = "/add";
	
	public static final String STATUS_OK = "SUCCESS";
	public static final String STATUS_FAIL = "ERROR";

	public static final String REGEX_DATE = "^\\d{4}-\\d{2}-\\d{2}$";
	public static final String REGEX_ONLY_NUMBERS = "^[0-9]*$";
	
	public static final String PATTERN_DATE = "yyyy-MM-dd";
	
	public static final String ERROR_VALIDATE_REQ_DATA = "Informacion incorrecta en el ingreso de datos: %s";
	public static final String ERROR_GENERIC = "Error reportado en la aplicacion: %s";
	public static final String ERROR_AUTOR_NOT_FOUND = "Autor no encontrado: %s";
	public static final String ERROR_EDITORIAL_NOT_FOUND = "Editorial no encontrada: %s";
	
	
	public static final String REGISTER_CREATED = "Registro creado, id: %s";
	public static final String TRANSACTION_OK = "Transaccion realizada correctamente";
	
	public static final String TYPE_AUTOR = "AUTOR";
	public static final String TYPE_EDITORIAL = "EDITORIAL";
	
	private Constants() {
	}

}
