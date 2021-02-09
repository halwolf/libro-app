package com.nexus.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexus.demo.commons.Commons;
import com.nexus.demo.dao.IEditorialDao;
import com.nexus.demo.dto.EditorialDto;
import com.nexus.demo.entity.EditorialEntity;
import com.nexus.demo.service.IEditorialService;

@Service
public class EditorialService implements IEditorialService {
	
	@Autowired
	IEditorialDao editorialDao;
	
	@Override
	public String saveEditorial(EditorialDto editorialDto) {
		
		EditorialEntity entity = Commons.convertEditDtoToEntity(editorialDto);
		editorialDao.save(entity);
		
		return entity.getIdEditorial();
	}
	
	@Override
	public boolean existByNombreEditorial(String nombreEditorial) {
		List<EditorialEntity> entityList = editorialDao.findByNombreEditorial(nombreEditorial);
		return !entityList.isEmpty();
	}

}
