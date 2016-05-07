package com.cpt.torneo.dao;

import java.util.List;

import com.cpt.torneo.entities.Persona;

public interface PersonaDao {
	
	public List<Persona> getPersonaAll();
	
	public Persona getPersonaById(int idPersona);
	
	public void insertPersona(Persona persona);

}
