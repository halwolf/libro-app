package com.nexus.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.demo.commons.Commons;
import com.nexus.demo.constans.Constants;
import com.nexus.demo.dto.LibroDto;
import com.nexus.demo.exceptions.DataException;
import com.nexus.demo.exceptions.ValidationException;
import com.nexus.demo.service.IAutorService;
import com.nexus.demo.service.IEditorialService;
import com.nexus.demo.service.ILibroService;
import com.nexus.response.LibroResponse;
import com.nexus.response.Response;

@RestController
@RequestMapping(Constants.WS_LIBRO_PATH)
public class LibroController {
	
	@Autowired
	ILibroService libroService;
	@Autowired
	IAutorService autorService;
	@Autowired
	IEditorialService editorialService;
	
	@GetMapping
	public LibroResponse getData() {
		LibroResponse response = new LibroResponse();
		 try {
			 
			 
			 List<LibroDto> libros = libroService.getLibros();
			 response.setLibros(libros);
			 
			 Commons.getStatusOk(response);
			 
			 return response;
		 }catch(Exception ex) {
			 Commons.getExceptionMessage(ex, response);
			 return response;
		 }
	}
	

	@PostMapping(Constants.WS_METHOD_ADD)
	 public Response addAutor(@RequestBody LibroDto libroDto) {
		 Response response = new Response();
		 try {
			 
			 List<String> violations = Commons.getViolations(libroDto);
			 if(!violations.isEmpty()) {
				 throw new ValidationException(Commons.getListAsString(violations));
			 }
			 
			 if(!autorService.existByNombreCompleto(libroDto.getAutor())){
				 throw new DataException(libroDto.getAutor(), Constants.TYPE_AUTOR);
			 }
			 
			 if(!editorialService.existByNombreEditorial(libroDto.getEditorial())) {
				 throw new DataException(libroDto.getEditorial(), Constants.TYPE_EDITORIAL);
			 }
			 
			 
			 String id = libroService.saveLibro(libroDto);
			 Commons.getCreateRegister(id, response);
			 
			 return response;
		 }catch(Exception ex) {
			 Commons.getExceptionMessage(ex, response);
			 return response;
		 }
		 
	 }
	

}
