package org.sid.vol.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Aeroport implements Serializable {
	@Id @GeneratedValue
	private Long idAeroport;
	private String nomAero;
	
	@OneToMany(mappedBy = "aeroport")
	private List<Vol> vols;
	
	@OneToMany(mappedBy = "aeroport")
	private List<Escale> escales;
	
	@ManyToOne
	@JoinColumn(name="idVille")
	private Ville ville;

	public Aeroport() {
		super();
		
	}

	public Long getIdAeroport() {
		return idAeroport;
	}

	public void setIdAeroport(Long idAeroport) {
		this.idAeroport = idAeroport;
	}

	public Aeroport(String nomAero) {
		super();
		this.nomAero = nomAero;
	}

	public String getNomAero() {
		return nomAero;
	}

	public void setNomAero(String nomAero) {
		this.nomAero = nomAero;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	

}
