package com.example.demo.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.IPropietarioRepo;
import com.example.demo.banco.repository.modelo.Propietario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		iPropietarioRepo.eliminar(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		iPropietarioRepo.actualizar(propietario);
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		iPropietarioRepo.insertar(propietario);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return iPropietarioRepo.buscarTodos();
	}

	@Override
	public Propietario buscar(Integer id) {
		// TODO Auto-generated method stub
		return iPropietarioRepo.buscar(id);
	}

}
