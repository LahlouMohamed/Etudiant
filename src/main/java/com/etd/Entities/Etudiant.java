package com.etd.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeE;
	public Long getCodeE() {
		return codeE;
	}
	public void setCodeE(Long codeE) {
		this.codeE = codeE;
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
	public Groupe getGroupe() {
		return Groupe;
	}
	public void setGroupe(Groupe groupe) {
		Groupe = groupe;
	}
	private String nom;
	private String prenom;
	@ManyToOne
	@JoinColumn(name = "codeG")
	private Groupe Groupe;
}
