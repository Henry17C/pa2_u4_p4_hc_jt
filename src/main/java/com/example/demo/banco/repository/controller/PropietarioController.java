package com.example.demo.banco.repository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		
		//http://localhost:8080/concensionario/propietarios/buscar
		List<Propietario> propietarios= iPropietarioService.buscarTodos();
		model.addAttribute("propietarios", propietarios);
		
		
		return "vistaListaPropietarios";
		
	}
	
	
	//recibo un dato por la url
	//http://localhost:8080/concensionario/propietarios/buscarPorID/1

	@GetMapping("/buscarPorID/{idProp}")
	public String buscarPorID(@PathVariable("idProp") Integer id, Model model){
		
		Propietario propietario= iPropietarioService.buscar(id);
		model.addAttribute(propietario);
		return "vistaPropietario";
	}
	
	
	//aqui recibo un objeto, mas no recibo un modelo
	@PutMapping("/actualizar/{id}")
	public String actualizarProprietario(@PathVariable("id") Integer integer, Propietario propietario) {
		
		this.iPropietarioService.actualizar(propietario);
		
		return "redirect:/propietarios/buscar";
	}
	
	
	@DeleteMapping("/borrar/{id}")
	public String eliminarPorID(@PathVariable("id")Integer id) {
		this.iPropietarioService.eliminar(id);
		return "redirect:/propietarios/buscar";
	}
	
	
	@GetMapping("/nuevo")
	public String paginaNuevoPropietario(Propietario propietario) {
		
		return "vistaNuevoPropietario";
	}
	
	@PostMapping("/guardar")
	public String guardar(Propietario propietario) {
		this.iPropietarioService.insertar(propietario);
		
		return "redirect:/propietarios/buscar";

	}
	
	
	
}
