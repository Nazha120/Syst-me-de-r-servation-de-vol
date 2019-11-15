package org.sid.vol.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CompagnieA implements Serializable {
	@Id @GeneratedValue
	private Long idCompagnieA;
	private String nomCo;
	
	@OneToMany(mappedBy = "compagnieA")
	private List<Vol> vols;

	public CompagnieA() {
		super();
	}

	public CompagnieA(String nomCo) {
		super();
		this.nomCo = nomCo;
	}

	public Long getIdCompagnieA() {
		return idCompagnieA;
	}

	public void setIdCompagnieA(Long idCompagnieA) {
		this.idCompagnieA = idCompagnieA;
	}

	public String getNomCo() {
		return nomCo;
	}

	public void setNomCo(String nomCo) {
		this.nomCo = nomCo;
	}
	

}
