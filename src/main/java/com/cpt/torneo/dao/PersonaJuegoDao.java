package com.cpt.torneo.dao;

import java.util.List;

import com.cpt.torneo.entities.PersonaJuegos;

public interface PersonaJuegoDao {
	
	public List<PersonaJuegos> getPersonaJuegoAll();
	
	public PersonaJuegos getPersonaJuegoById(int id);
	
	public void insertarPersonaJuego(PersonaJuegos personajuego);

}
