package org.sid.vol.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Escale implements Serializable {
	@Id @GeneratedValue
	private Long idEscale;
	private int heureArivee;
	private int heureDepart;
	
	@ManyToOne
	@JoinColumn(name="idVol")
	private Vol vol;
	
	@ManyToOne
	@JoinColumn(name="idAeroport")
	private Aeroport aeroport;
	
	public Escale() {
		super();
	}
	public Escale(int heureArivee, int heureDepart, Vol vol, Aeroport aeroport) {
		super();
		this.heureArivee = heureArivee;
		this.heureDepart = heureDepart;
		this.vol = vol;
		this.aeroport = aeroport;
	}
	
	public Long getIdEscale() {
		return idEscale;
	}
	public void setIdEscale(Long idEscale) {
		this.idEscale = idEscale;
	}
	public int getHeureArivee() {
		return heureArivee;
	}
	public void setHeureArivee(int heureArivee) {
		this.heureArivee = heureArivee;
	}
	public int getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(int heureDepart) {
		this.heureDepart = heureDepart;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	

}
