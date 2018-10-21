package com.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employe extends User {

	@Id
	private int cin_e;
	
	private String nom_e;
	private String prenom_e;
	private String adresse_e;
	private int tel_e;
	private String poste_e;
	private Float salaire;
	
	private Date date_naissance_e;
	private Boolean type_user;
	
	public Employe() {
		
	}
	
	public Employe(int cin_e, String nom_e, String prenom_e, String adresse_e, int tel_e, String poste_e, Float salaire,
			Date date_naissance_e, Boolean type_user) {
		super();
		this.cin_e = cin_e;
		this.nom_e = nom_e;
		this.prenom_e = prenom_e;
		this.adresse_e = adresse_e;
		this.tel_e = tel_e;
		this.poste_e = poste_e;
		this.salaire = salaire;
		this.date_naissance_e = date_naissance_e;
		this.type_user = type_user;
		
	}

	public int getCin_e() {
		return cin_e;
	}
	public void setCin_e(int cin_e) {
		this.cin_e = cin_e;
	}
	public String getNom_e() {
		return nom_e;
	}
	public void setNom_e(String nom_e) {
		this.nom_e = nom_e;
	}
	public String getPrenom_e() {
		return prenom_e;
	}
	public void setPrenom_e(String prenom_e) {
		this.prenom_e = prenom_e;
	}
	public int getTel_e() {
		return tel_e;
	}
	public void setTel_e(int tel_e) {
		this.tel_e = tel_e;
	}
	public String getPoste_e() {
		return poste_e;
	}
	public void setPoste_e(String poste_e) {
		this.poste_e = poste_e;
	}
	public Float getSalaire() {
		return salaire;
	}
	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}
	public Date getDate_naissance_e() {
		return date_naissance_e;
	}
	public void setDate_naissance_e(Date date_naissance_e) {
		this.date_naissance_e = date_naissance_e;
	}
	public Boolean getType_user() {
		return type_user;
	}
	public void setType_user(Boolean type_user) {
		this.type_user = type_user;
	}
	public String getAdresse_e() {
		return adresse_e;
	}
	public void setAdresse_e(String adresse_e) {
		this.adresse_e = adresse_e;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}

	@Override
	public String toString() {
		return "\"Employe\" :{\"cin_e\":" + cin_e + ", \"nom_e\":\"" + nom_e + "\", \"prenom_e\":\"" + prenom_e + "\", \"adresse_e\":\"" + adresse_e
				+ "\", \"tel_e\":\"" + tel_e + "\", \"poste_e\":\"" + poste_e + "\", \"salaire\":" + salaire + ", \"date_naissance_e\":\""
				+ date_naissance_e + "\", \"type_user\":" + type_user + "}";
	}
	
	
}
