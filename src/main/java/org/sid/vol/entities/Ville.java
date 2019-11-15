package org.sid.vol.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Ville implements Serializable {
	@Id @GeneratedValue
	private Long idVille;
	private String nomVille;
	private String pays;
	
	@OneToMany(mappedBy = "ville")
	private List<Aeroport> aeroports;
	
	public Ville() {
		super();
		
	}
	public Ville(String nomVille, String pays) {
		super();
		this.nomVille = nomVille;
		this.pays = pays;
	}
	
	public Long getIdVille() {
		return idVille;
	}
	public void setIdVille(Long idVille) {
		this.idVille = idVille;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	

}
