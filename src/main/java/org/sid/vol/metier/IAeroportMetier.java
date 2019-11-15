package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.Aeroport;


public interface IAeroportMetier {
	
    public Aeroport save(Aeroport entity);
	
	public Aeroport update(Aeroport entity);
	
	public List<Aeroport> selectAll();
	
	public List<Aeroport> selectAll(String sortField,String sort);
	
	public Aeroport getById(Long id);
	
	public void remove(Long id);
	
	public Aeroport findOne(String paramName , Object paramValue);
	
	public Aeroport findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
