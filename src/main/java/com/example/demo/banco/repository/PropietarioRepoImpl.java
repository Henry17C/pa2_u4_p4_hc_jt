package com.example.demo.banco.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class PropietarioRepoImpl implements IPropietarioRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Propietario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		entityManager.merge(propietario);
	}

	@Override
	//@Transactional(value = TxType.MANDATORY)
	public void insertar(Propietario prop) {
		// TODO Auto-generated method stub
		entityManager.persist(prop);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		
	TypedQuery< Propietario> query= this.entityManager.createQuery("Select p from Propietario p ",Propietario.class );
		return query.getResultList();
	}

}
