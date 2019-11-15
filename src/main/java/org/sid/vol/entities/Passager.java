package org.sid.vol.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Passager {
	@Id @GeneratedValue
	private Long idPassager;
	private String cin;
	private String nom;
	private String prenom;
	
	public Passager() {
		super();
	}

	public Long getIdPassager() {
		return idPassager;
	}

	public void setIdPassager(Long idPassager) {
		this.idPassager = idPassager;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}
