package com.cpt.torneo.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



import com.cpt.torneo.dao.PersonaDao;
import com.cpt.torneo.entities.Persona;

@Stateless
@Path("/persona")
public class PersonaRS {
	
	@EJB
	private PersonaDao personaDao;
	
	@GET
	@Produces("application/xml")
	public List<Persona> getListarPersona(){
		return personaDao.getPersonaAll();
	}
	
	@GET
	@Produces("application/xml")
	@Path("{id}")
	public Persona getPersonaById(@PathParam("id") int id){
		return personaDao.getPersonaById(id);
	}
	
	@POST
	@Produces("application/json")
	public void insertarPersona(Persona persona){
		personaDao.insertPersona(persona);
	}
	
	
	
	

}
