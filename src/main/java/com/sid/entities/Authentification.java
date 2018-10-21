package com.sid.entities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sid.dao.EmployeRepository;

public class Authentification {
	public Employe employe;
	public boolean found;
	EmployeRepository e;
	
	public Authentification(String login,String pass) {
		employe = e.auth(login, pass);
		if(employe!=null)
			found=true;
		else
			found=false;
		
	}
	@Override
	public String toString() {
		return "Authentification [employe=" + employe + ", found=" + found +" ]";
	}
	
	
}
