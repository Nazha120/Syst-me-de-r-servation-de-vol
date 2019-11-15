package org.sid.vol.metier.impl;

import java.util.List;
import org.sid.vol.dao.IPassagerDao;
import org.sid.vol.entities.Passager;
import org.sid.vol.metier.IPassagerMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class PassagerMetierImpl implements IPassagerMetier {
	
	private IPassagerDao dao;
	
	
	public void setDao(IPassagerDao dao) {
		this.dao = dao;
	}

	@Override
	public Passager save(Passager entity) {
		return dao.save(entity);
	}


	@Override
	public Passager update(Passager entity) {
		return dao.update(entity);
	}


	@Override
	public List<Passager> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<Passager> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public Passager getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public Passager findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public Passager findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
