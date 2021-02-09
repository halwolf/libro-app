package com.nexus.demo.exceptions;

public class ValidationException extends Exception{
	
	private static final long serialVersionUID = 4961291826177451208L;

	public ValidationException(String message) {
		super(message);
	}

}
