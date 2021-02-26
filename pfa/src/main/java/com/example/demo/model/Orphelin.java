package com.example.demo.model;

import java.util.Date;

public class Orphelin extends Personne {
   private int sexe;
   private String situationConjugale;
   private boolean etudie;
   private boolean parraine;
   public Orphelin() {
	   super();
	   // TODO Auto-generated constructor stub
   }
   public Orphelin(long id, int cIN, int numDossier, Date dateOuvertureDossier, String nom, String prenom,
		   Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String typeTravaille,
		   String situationTravaille, float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire,
		   String typeCouvertureSociale, float coutMedicaments) {
	   super(cIN, numDossier, dateOuvertureDossier, nom, prenom, dateDeNaissance, numTel, adresse, niveauScolaire,
			   typeTravaille, situationTravaille, revenueMonsuel, montantAideMonsuelle, siutationSanitaire,
			   typeCouvertureSociale, coutMedicaments);
	   // TODO Auto-generated constructor stub
   }
   
public Orphelin(long id, int cIN, int numDossier, Date dateOuvertureDossier, String nom, String prenom,
		   Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String typeTravaille,
		   String situationTravaille, float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire,
		   String typeCouvertureSociale, float coutMedicaments,int sexe, String situationConjugale, boolean etudie, boolean parraine) {
	super(cIN, numDossier, dateOuvertureDossier, nom, prenom, dateDeNaissance, numTel, adresse, niveauScolaire,
			   typeTravaille, situationTravaille, revenueMonsuel, montantAideMonsuelle, siutationSanitaire,
			   typeCouvertureSociale, coutMedicaments);
	this.sexe = sexe;
	this.situationConjugale = situationConjugale;
	this.etudie = etudie;
	this.parraine = parraine;
}
public int getSexe() {
	return sexe;
}
public void setSexe(int sexe) {
	this.sexe = sexe;
}
public String getSituationConjugale() {
	return situationConjugale;
}
public void setSituationConjugale(String situationConjugale) {
	this.situationConjugale = situationConjugale;
}
public boolean isEtudie() {
	return etudie;
}
public void setEtudie(boolean etudie) {
	this.etudie = etudie;
}
public boolean isParraine() {
	return parraine;
}
public void setParraine(boolean parraine) {
	this.parraine = parraine;
}
   
   

}
