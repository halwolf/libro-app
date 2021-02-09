package com.nexus.response;

public class Response {

	private String status;
	private String descripcion;

	public Response() {
		super();
	}

	public final String getStatus() {
		return status;
	}

	public final void setStatus(String status) {
		this.status = status;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", descripcion=" + descripcion + "]";
	}

}
