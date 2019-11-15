package org.sid.vol.metier.impl;

import java.util.List;
import org.sid.vol.dao.IVilleDao;
import org.sid.vol.entities.Ville;
import org.sid.vol.metier.IVilleMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class VilleMetierImpl implements IVilleMetier {
	
	private IVilleDao dao;
	
	
	public void setDao(IVilleDao dao) {
		this.dao = dao;
	}

	@Override
	public Ville save(Ville entity) {
		return dao.save(entity);
	}


	@Override
	public Ville update(Ville entity) {
		return dao.update(entity);
	}


	@Override
	public List<Ville> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<Ville> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public Ville getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public Ville findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public Ville findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
