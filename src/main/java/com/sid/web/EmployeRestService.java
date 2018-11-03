package com.sid.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.dao.EmployeRepository;

import com.sid.entities.Employe;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeRestService {

	@Autowired
	private EmployeRepository employeRepository;
	
	@RequestMapping(value="/Employes",method=RequestMethod.GET)
	public List<Employe> getEmployes(){
		return employeRepository.findAll();
	}
	
	
	@RequestMapping(value="/Employes/{e}",method=RequestMethod.GET)
	public Employe find(@PathVariable int e) {
		return employeRepository.findById(e).get();
	}
	
	@RequestMapping(value="/Employes",method=RequestMethod.POST)
	public Employe save(@RequestBody Employe e) {
		return employeRepository.save(e);
	}
	
	@RequestMapping(value="/Employes/{e}",method=RequestMethod.DELETE)
	public void supprimer (@PathVariable int e) {
		 employeRepository.deleteById(e); 
		System.out.println("Succes!");
	}
	
	@RequestMapping(value="/Employes/{e}",method=RequestMethod.PUT)
	public Employe update (@PathVariable int e , @RequestBody Employe em) {
		 
		
		return employeRepository.save(em);
	}
	
	
	
	@RequestMapping(value="/Employe/auth",method = RequestMethod.POST,produces  = "application/json")
	public  String  auth(@RequestBody Employe em) {
		
		boolean b = employeRepository.auth(em.login,em.mdp)!=null;
		if(b)
		return "{\"found\":"+b+","+employeRepository.auth(em.login,em.mdp).toString()+"}";
		else
			return "{\"found\":"+b+"}";
	}
	
	
}
