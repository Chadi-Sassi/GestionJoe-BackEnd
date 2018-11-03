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
public class MiniProjetApplication {

	@Autowired
	EmployeRepository employeRepository;
	public static void main(String[] args) {
		SpringApplication.run(MiniProjetApplication.class, args);
	}

	
}
