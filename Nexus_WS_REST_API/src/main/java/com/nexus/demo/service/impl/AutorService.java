package com.nexus.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexus.demo.commons.Commons;
import com.nexus.demo.dao.IAutorDao;
import com.nexus.demo.dto.AutorDto;
import com.nexus.demo.entity.AutorEntity;
import com.nexus.demo.service.IAutorService;

@Service
public class AutorService implements IAutorService {
	
	@Autowired
	IAutorDao autorDao;
	
	@Override
	public String saveAutor(AutorDto autorDto) {
		AutorEntity entity = Commons.convertAutorDtoToToEntity(autorDto);
		autorDao.save(entity);
		
		return entity.getIdAutor();
	}
	
	@Override
	public boolean existByNombreCompleto(String nombreCompleto) {
		List<AutorEntity> entityList = autorDao.findByNombreCompleto(nombreCompleto);
		return !entityList.isEmpty();
	}

}
