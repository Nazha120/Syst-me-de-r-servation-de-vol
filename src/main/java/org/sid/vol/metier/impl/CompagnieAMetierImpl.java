package org.sid.vol.metier.impl;

import java.util.List;

import org.sid.vol.dao.ICompagnieADao;
import org.sid.vol.entities.CompagnieA;
import org.sid.vol.metier.ICompagnieAMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class CompagnieAMetierImpl implements ICompagnieAMetier {
	
	private ICompagnieADao dao;
	
	
	public void setDao(ICompagnieADao dao) {
		this.dao = dao;
	}

	@Override
	public CompagnieA save(CompagnieA entity) {
		return dao.save(entity);
	}


	@Override
	public CompagnieA update(CompagnieA entity) {
		return dao.update(entity);
	}


	@Override
	public List<CompagnieA> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<CompagnieA> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public CompagnieA getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public CompagnieA findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public CompagnieA findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
