package com.cpt.torneo.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.cpt.torneo.entities.Persona;

@Stateless
public class PersonaDaoImpl implements PersonaDao {

	
	//@PersistenceContext(unitName="Torneos")  //esto es con JTA
	//EntityManager em;
		
	private EntityManager em = Persistence.createEntityManagerFactory("Torneos").createEntityManager();;
	//private EntityTransaction tx = em.getTransaction();
	
	@SuppressWarnings("unchecked")
	public List<Persona> getPersonaAll() {
		return em.createNamedQuery("Persona.findAll").getResultList();
	}

	public Persona getPersonaById(int idPersona) {
		return em.find(Persona.class, idPersona);
	}

	public void insertPersona(Persona persona) {
		em.persist(persona);

	}

}
