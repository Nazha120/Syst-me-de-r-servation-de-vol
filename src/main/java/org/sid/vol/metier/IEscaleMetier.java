package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.Escale;


public interface IEscaleMetier {
	
    public Escale save(Escale entity);
	
	public Escale update(Escale entity);
	
	public List<Escale> selectAll();
	
	public List<Escale> selectAll(String sortField,String sort);
	
	public Escale getById(Long id);
	
	public void remove(Long id);
	
	public Escale findOne(String paramName , Object paramValue);
	
	public Escale findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
