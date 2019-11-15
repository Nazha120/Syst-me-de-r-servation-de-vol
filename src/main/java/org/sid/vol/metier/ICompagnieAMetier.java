package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.CompagnieA;


public interface ICompagnieAMetier {
	
    public CompagnieA save(CompagnieA entity);
	
	public CompagnieA update(CompagnieA entity);
	
	public List<CompagnieA> selectAll();
	
	public List<CompagnieA> selectAll(String sortField,String sort);
	
	public CompagnieA getById(Long id);
	
	public void remove(Long id);
	
	public CompagnieA findOne(String paramName , Object paramValue);
	
	public CompagnieA findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
