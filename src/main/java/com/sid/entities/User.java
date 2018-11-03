package com.sid.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;

@Entity

public abstract class User {
	@Id
	@Column(name="cin")
	protected int cin;
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected int tel;
	
	public String login;
	public String mdp;
	protected Date dateNais;

	
	
	
}
