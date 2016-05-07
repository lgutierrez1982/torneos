package com.cpt.torneo.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.cpt.torneo.entities.PersonaJuegos;

@Stateless
public class PersonaJuegoDaoImpl implements PersonaJuegoDao {

	private EntityManager em = Persistence.createEntityManagerFactory("Torneos").createEntityManager();
	
	@SuppressWarnings("unchecked")
	public List<PersonaJuegos> getPersonaJuegoAll() {
		return em.createNamedQuery("PersonaJuegos.findAll").getResultList();
	}

	public PersonaJuegos getPersonaJuegoById(int id) {
		return em.find(PersonaJuegos.class, id);
	}

	public void insertarPersonaJuego(PersonaJuegos personajuego) {
		em.persist(personajuego);
}

}
