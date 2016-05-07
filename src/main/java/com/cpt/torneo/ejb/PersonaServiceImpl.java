package com.cpt.torneo.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.cpt.torneo.dao.PersonaDao;
import com.cpt.torneo.entities.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaService {

	@EJB
	private PersonaDao personaDAO;
	
	public List<Persona> getPersonaAll() {
		return personaDAO.getPersonaAll();
	}

	public Persona getPersonaById(int idPersona) {
		return personaDAO.getPersonaById(idPersona);
	}

	public void insertPersona(Persona persona) {
		personaDAO.insertPersona(persona);

	}

}
