package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.Ville;


public interface IVilleMetier {
	
    public Ville save(Ville entity);
	
	public Ville update(Ville entity);
	
	public List<Ville> selectAll();
	
	public List<Ville> selectAll(String sortField,String sort);
	
	public Ville getById(Long id);
	
	public void remove(Long id);
	
	public Ville findOne(String paramName , Object paramValue);
	
	public Ville findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
