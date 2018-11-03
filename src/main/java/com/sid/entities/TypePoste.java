package com.sid.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TypePoste {
	@Id
	@GeneratedValue
protected int id;
protected String descp;

@OneToMany()
@JoinColumn(name = "type_poste_id")
protected List<Employe> emp =new ArrayList<>();



public TypePoste() {
	super();
}

public TypePoste(int id, String descp, List<Employe> emp) {
	super();
	this.id = id;
	this.descp = descp;
	this.emp = emp;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDescp() {
	return descp;
}

public void setDescp(String descp) {
	this.descp = descp;
}

public List<Employe> getEmp() {
	return emp;
}

public void setEmp(List<Employe> emp) {
	this.emp = emp;
}

}
