package org.sid.vol.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vol implements Serializable{
	@Id @GeneratedValue
	private Long idVol;
	private int codeVol;
	private Date dateDepart;
	private Date dateDarivee;
	private boolean ouvert;
	private float duree;
	
	@ManyToOne
	@JoinColumn(name="idCompagnieA")
	private CompagnieA compagnieA;
	
	@ManyToOne
	@JoinColumn(name="idAeroport")
	private Aeroport aeroport;
	
	@OneToMany(mappedBy = "vol")
	private List<Escale> escales;
	
	@OneToMany(mappedBy = "vol")
	private List<Reservation> reservations;
	
	public Vol() {
		super();
	}
	public Vol(int codeVol, Date dateDepart, Date dateDarivee, boolean ouvert, float duree, CompagnieA compagnieA, Aeroport aeroport) {
		super();
		this.codeVol = codeVol;
		this.dateDepart = dateDepart;
		this.dateDarivee = dateDarivee;
		this.ouvert = ouvert;
		this.duree = duree;
		this.compagnieA = compagnieA;
		this.aeroport = aeroport;
	}
	
	public Long getIdVol() {
		return idVol;
	}
	public void setIdVol(Long idVol) {
		this.idVol = idVol;
	}
	public int getCodeVol() {
		return codeVol;
	}
	public void setCodeVol(int codeVol) {
		this.codeVol = codeVol;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateDarivee() {
		return dateDarivee;
	}
	public void setDateDarivee(Date dateDarivee) {
		this.dateDarivee = dateDarivee;
	}
	public boolean isOuvert() {
		return ouvert;
	}
	public void setOuvert(boolean ouvert) {
		this.ouvert = ouvert;
	}
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public CompagnieA getCompagnieA() {
		return compagnieA;
	}
	public void setCompagnieA(CompagnieA compagnieA) {
		this.compagnieA = compagnieA;
	}
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	

}
