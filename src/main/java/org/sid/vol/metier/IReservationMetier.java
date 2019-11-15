package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.Reservation;;


public interface IReservationMetier {
	
    public Reservation save(Reservation entity);
	
	public Reservation update(Reservation entity);
	
	public List<Reservation> selectAll();
	
	public List<Reservation> selectAll(String sortField,String sort);
	
	public Reservation getById(Long id);
	
	public void remove(Long id);
	
	public Reservation findOne(String paramName , Object paramValue);
	
	public Reservation findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
