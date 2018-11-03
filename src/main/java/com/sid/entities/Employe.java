package com.sid.entities;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;





@Entity
public class Employe extends User  {

	
	private Float salaire;
	
	
	public Boolean anciennete;
	
	@ManyToOne()
	
	private TypePoste typePoste;
	
	public Employe() {
		
	}
	
	public Employe(int cin, String nom_e, String prenom_e, String adresse_e, int tel_e,  Float salaire,
			Date date_naissance_e, Boolean type_user) {
		super();
		this.cin = cin;
		this.nom = nom_e;
		this.prenom = prenom_e;
		this.adresse = adresse_e;
		this.tel = tel_e;
		
		this.salaire = salaire;
		this.dateNais = date_naissance_e;
	
		
	}

	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin= cin;
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
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	public Float getSalaire() {
		return salaire;
	}
	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}
	public Date getDateNais() {
		return dateNais;
	}
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String Mdp) {
		this.mdp=Mdp;
	}
	public Boolean getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(Boolean anciennete) {
		this.anciennete = anciennete;
	}
	

	@Override
	public String toString() {
		return "\"Employe\" :{\"cin_e\":" + cin + ", \"nom_e\":\"" + nom + "\", \"prenom_e\":\"" + prenom + "\", \"adresse_e\":\"" + adresse
				+ "\", \"tel_e\":\"" + tel + "\", \"salaire\":" + salaire + ", \"date_naissance_e\":\""
				+ dateNais + "\", \"anciennete\":" + anciennete + "}";
	}

	public TypePoste getTypePoste() {
		return typePoste;
	}

	public void setTypePoste(TypePoste typePoste) {
		this.typePoste = typePoste;
	}



	
	
}
