package com.cpt.torneo.ejb;

import java.util.List;

import javax.ejb.Local;

import com.cpt.torneo.entities.Persona;

@Local
public interface PersonaService {
	
	public List<Persona> getPersonaAll();
	
	public Persona getPersonaById(int idPersona);
	
	public void insertPersona(Persona persona); 
	
	

}
