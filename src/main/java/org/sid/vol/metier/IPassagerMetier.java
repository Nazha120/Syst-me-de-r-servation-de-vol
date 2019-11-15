package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.Passager;


public interface IPassagerMetier {
	
    public Passager save(Passager entity);
	
	public Passager update(Passager entity);
	
	public List<Passager> selectAll();
	
	public List<Passager> selectAll(String sortField,String sort);
	
	public Passager getById(Long id);
	
	public void remove(Long id);
	
	public Passager findOne(String paramName , Object paramValue);
	
	public Passager findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
