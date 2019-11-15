package org.sid.vol.metier.impl;

import java.util.List;
import org.sid.vol.dao.IReservationDao;
import org.sid.vol.entities.Reservation;
import org.sid.vol.metier.IReservationMetier;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class ReservationMetierImpl implements IReservationMetier {
	
	private IReservationDao dao;
	
	
	public void setDao(IReservationDao dao) {
		this.dao = dao;
	}

	@Override
	public Reservation save(Reservation entity) {
		return dao.save(entity);
	}


	@Override
	public Reservation update(Reservation entity) {
		return dao.update(entity);
	}


	@Override
	public List<Reservation> selectAll() {
		return dao.selectAll();
	}


	@Override
	public List<Reservation> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}


	@Override
	public Reservation getById(Long id) {
		return dao.getById(id);
	}


	@Override
	public void remove(Long id) {
     dao.remove(id);		
	}


	@Override
	public Reservation findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}


	@Override
	public Reservation findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		return findCountBy(paramName, paramValue);
	}

	

}
