package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Propietario;
import com.example.demo.banco.service.IPropietarioService;

@SpringBootApplication
public class Pa2U4P4HcJtApplication implements CommandLineRunner{

	@Autowired
	private IPropietarioService iPropietarioService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U4P4HcJtApplication.class, args);
	
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.err.println(";)");
		
		Propietario propietario= new Propietario();
		
		propietario.setApellido("Torres");
		propietario.setCedula("321");
		propietario.setNombre("Frank");
		
		
		Propietario propietario1= new Propietario();
		
		propietario1.setApellido("Mendez");
		propietario1.setCedula("123");
		propietario1.setNombre("Jose");

	
//	this.iPropietarioService.insertar(propietario1);
//	this.iPropietarioService.insertar(propietario);
	
	
	
	}

}
