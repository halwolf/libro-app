package com.nexus.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexus.demo.commons.Commons;
import com.nexus.demo.dao.ILibroDao;
import com.nexus.demo.dto.LibroDto;
import com.nexus.demo.entity.LibroEntity;
import com.nexus.demo.service.ILibroService;

@Service
public class LibroService implements ILibroService {

	@Autowired
	ILibroDao libroDao;

	@Override
	public String saveLibro(LibroDto libroDto) {
		LibroEntity entity = Commons.convertLibroDtoToToEntity(libroDto);
		libroDao.save(entity);
		return entity.getIdLibro();

	}
	
	@Override
	public List<LibroDto> getLibros() {
		List<LibroDto> resultList = new ArrayList<>();
		List<LibroEntity> libros = libroDao.findAll();
		for(LibroEntity libro: libros) {
			resultList.add(Commons.convertLibroEntityToDto(libro));
		}
		return resultList;
	}

}
