package com.nexus.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.demo.commons.Commons;
import com.nexus.demo.constans.Constants;
import com.nexus.demo.dto.AutorDto;
import com.nexus.demo.exceptions.ValidationException;
import com.nexus.demo.service.IAutorService;
import com.nexus.response.Response;

@RestController
@RequestMapping(Constants.WS_AUTOR_PATH)
public class AutorController {
	
	@Autowired
	IAutorService autorService;
	
	 @PostMapping(Constants.WS_METHOD_ADD)
	 public Response addAutor(@RequestBody AutorDto autorDto) {
		 Response response = new Response();
		 try {
			 
			 List<String> violations = Commons.getViolations(autorDto);
			 if(!violations.isEmpty()) {
				 throw new ValidationException(Commons.getListAsString(violations));
			 }
			 
			 String id = autorService.saveAutor(autorDto);
			 Commons.getCreateRegister(id, response);
			 
			 return response;
		 }catch(Exception ex) {
			 Commons.getExceptionMessage(ex, response);
			 return response;
		 }
		 
	 }

}
