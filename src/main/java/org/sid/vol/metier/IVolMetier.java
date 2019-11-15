package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.Vol;


public interface IVolMetier {
	
    public Vol save(Vol entity);
	
	public Vol update(Vol entity);
	
	public List<Vol> selectAll();
	
	public List<Vol> selectAll(String sortField,String sort);
	
	public Vol getById(Long id);
	
	public void remove(Long id);
	
	public Vol findOne(String paramName , Object paramValue);
	
	public Vol findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
