package com.example.demo.banco.repository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.banco.repository.modelo.Propietario;
import com.example.demo.banco.service.IPropietarioService;

@Controller//el controller redirecciona la nombre de la vista
@RequestMapping("/propietarios")
public class PropietarioController {

	@Autowired
	private IPropietarioService iPropietarioService;
	
	@GetMapping("/buscar")     //verbo http
	public String buscartodos(Model model) {
		List<Propietario> propietarios= iPropietarioService.buscarTodos();
		model.addAttribute("propietarios", propietarios);
		
		
		return "vistaListaPropietarios";
		
	}
	
	
	
	
	
	
	
}
