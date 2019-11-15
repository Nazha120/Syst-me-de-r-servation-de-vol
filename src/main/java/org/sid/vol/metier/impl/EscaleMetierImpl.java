package org.sid.vol.metier.impl;

import java.util.List;
import org.sid.vol.dao.IEscaleDao;
import org.sid.vol.entities.Escale;
import org.sid.vol.metier.IEscaleMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class EscaleMetierImpl implements IEscaleMetier {
	
	private IEscaleDao dao;
	
	
	public void setDao(IEscaleDao dao) {
		this.dao = dao;
	}

	@Override
	public Escale save(Escale entity) {
		return dao.save(entity);
	}


	@Override
	public Escale update(Escale entity) {
		return dao.update(entity);
	}


	@Override
	public List<Escale> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<Escale> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public Escale getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public Escale findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public Escale findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
