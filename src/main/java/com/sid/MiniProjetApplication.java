package com.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sid.dao.EmployeRepository;
import com.sid.entities.Employe;

@SpringBootApplication
public class MiniProjetApplication implements CommandLineRunner {

	@Autowired
	EmployeRepository employeRepository;
	public static void main(String[] args) {
		SpringApplication.run(MiniProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
		employeRepository.save(new Employe(1236,"azda","test","tunis",234103,
				"ensss",(float) 23.2,dt.parse("09/08/1985"),true));
	}
}
