package com.nexus.demo.exceptions;

public class DataException extends Exception {

	private static final long serialVersionUID = 4961291826177451208L;

	private final String type;

	public DataException(String message, String type) {
		super(message);
		this.type = type;
	}

	public final String getType() {
		return type;
	}

}
