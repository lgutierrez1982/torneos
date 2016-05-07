package com.cpt.torneo.ejb;

import java.util.List;

import javax.ejb.Local;

import com.cpt.torneo.entities.PersonaJuegos;

@Local
public interface PersonaJuegoService {

	public List<PersonaJuegos> getPersonaJuegosAll();
	
	public PersonaJuegos getPersonaJuegoById(int i);
	
	public void insertPersonaJuegos(PersonaJuegos personajuego);
}
