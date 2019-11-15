package org.sid.vol.metier.impl;

import java.util.List;

import org.sid.vol.dao.IAeroportDao;
import org.sid.vol.entities.Aeroport;
import org.sid.vol.metier.IAeroportMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class AeroportMetierImpl implements IAeroportMetier {
	
	private IAeroportDao dao;
	
	
	public void setDao(IAeroportDao dao) {
		this.dao = dao;
	}

	@Override
	public Aeroport save(Aeroport entity) {
		return dao.save(entity);
	}


	@Override
	public Aeroport update(Aeroport entity) {
		return dao.update(entity);
	}


	@Override
	public List<Aeroport> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<Aeroport> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public Aeroport getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public Aeroport findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public Aeroport findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
