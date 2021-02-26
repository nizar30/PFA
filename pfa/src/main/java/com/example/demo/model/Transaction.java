package com.example.demo.model;

import java.util.Date;

public class Transaction {
	   private long idPersonne;
	   private long idParrain;
	   private Date montant;
	   private float date;
	public Transaction() {
		
	}
	public Transaction(long idPersonne, long idParrain, Date montant, float date) {
		this.idPersonne = idPersonne;
		this.idParrain = idParrain;
		this.montant = montant;
		this.date = date;
	}
	public long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public long getIdParrain() {
		return idParrain;
	}
	public void setIdParrain(long idParrain) {
		this.idParrain = idParrain;
	}
	public Date getMontant() {
		return montant;
	}
	public void setMontant(Date montant) {
		this.montant = montant;
	}
	public float getDate() {
		return date;
	}
	public void setDate(float date) {
		this.date = date;
	}
	
	   
	   
	   
	   

	}