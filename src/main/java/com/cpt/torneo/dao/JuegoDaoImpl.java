package com.cpt.torneo.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.cpt.torneo.entities.Juego;

@Stateless
public class JuegoDaoImpl implements JuegoDao {

	private EntityManager em = Persistence.createEntityManagerFactory("Torneos").createEntityManager();
	
	
	@SuppressWarnings("unchecked")
	public List<Juego> getJuegosAll() {
		return em.createNamedQuery("Juego.findAll").getResultList();
	}

	public Juego getJuegoById(int id) {
		return em.find(Juego.class, id);
	}

	public void insertarJuegos(Juego juego) {
		em.persist(juego);

	}

}
