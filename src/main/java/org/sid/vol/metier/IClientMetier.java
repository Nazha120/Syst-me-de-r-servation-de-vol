package org.sid.vol.metier;

import java.util.List;
import org.sid.vol.entities.Client;


public interface IClientMetier {
	
    public Client save(Client entity);
	
	public Client update(Client entity);
	
	public List<Client> selectAll();
	
	public List<Client> selectAll(String sortField,String sort);
	
	public Client getById(Long id);
	
	public void remove(Long id);
	
	public Client findOne(String paramName , Object paramValue);
	
	public Client findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	
}
