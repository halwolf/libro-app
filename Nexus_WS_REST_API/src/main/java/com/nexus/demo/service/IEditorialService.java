package com.nexus.demo.service;


import com.nexus.demo.dto.EditorialDto;

public interface IEditorialService {
	
	public String saveEditorial(EditorialDto editorialDto);
	
	public boolean existByNombreEditorial(String nombreEditorial);
	
}
