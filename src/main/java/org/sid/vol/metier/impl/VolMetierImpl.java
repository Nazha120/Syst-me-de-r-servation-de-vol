package org.sid.vol.metier.impl;

import java.util.List;
import org.sid.vol.dao.IVolDao;
import org.sid.vol.entities.Vol;
import org.sid.vol.metier.IVolMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class VolMetierImpl implements IVolMetier {
	
	private IVolDao dao;
	
	
	public void setDao(IVolDao dao) {
		this.dao = dao;
	}

	@Override
	public Vol save(Vol entity) {
		return dao.save(entity);
	}


	@Override
	public Vol update(Vol entity) {
		return dao.update(entity);
	}


	@Override
	public List<Vol> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<Vol> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public Vol getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public Vol findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public Vol findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
