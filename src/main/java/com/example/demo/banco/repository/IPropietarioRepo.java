package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.repository.modelo.Propietario;

public interface IPropietarioRepo {
	
	
	public Propietario buscar ( Integer id);
public void  eliminar(Integer id);
public void actualizar(Propietario propietario);
public void insertar(Propietario propietario);
public List<Propietario> buscarTodos();
	
	
}
