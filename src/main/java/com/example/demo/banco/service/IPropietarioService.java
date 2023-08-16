package com.example.demo.banco.service;

import java.util.List;

import com.example.demo.banco.repository.modelo.Propietario;

public interface IPropietarioService {

	
	public void  eliminar(Integer id);
	public void actualizar(Propietario propietario);
	public void insertar(Propietario propietario);
	public List<Propietario> buscarTodos();
		
}
