package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parrain {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	   private long id;
	   private int CIN;
	   private String nom;
	   private String prenom;
	   private int telephone;
	public Parrain() {
		this.nom=null;
		this.CIN=0;
		this.prenom=null;
		this.telephone=0;
	}
	public Parrain(int id, int cIN, String nom, String prenom, int telephone) {
		super();
		this.id = id;
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
		CIN = cIN;
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
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	
	   
	   
	   
}
