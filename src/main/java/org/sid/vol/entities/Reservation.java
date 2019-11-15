package org.sid.vol.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Reservation implements Serializable{
	@Id @GeneratedValue
	private Long idReservation;
	private int codeRes;
	private String etat;
	
	
	@ManyToOne
	@JoinColumn(name="idVol")
	private Vol vol;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	public Reservation() {
		super();
		
	}
	public Reservation(int codeRes, String etat, Vol vol, Client client) {
		super();
		this.codeRes = codeRes;
		this.etat = etat;
		this.vol = vol;
		this.client = client;
	}
	
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public int getCodeRes() {
		return codeRes;
	}
	public void setCodeRes(int codeRes) {
		this.codeRes = codeRes;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	

}
