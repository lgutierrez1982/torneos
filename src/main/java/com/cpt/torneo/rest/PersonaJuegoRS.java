package com.cpt.torneo.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.cpt.torneo.dao.PersonaJuegoDao;
import com.cpt.torneo.entities.PersonaJuegos;

@Stateless
@Path("/personajuego")
public class PersonaJuegoRS {
	
	@EJB
	private PersonaJuegoDao personajuegoDao;
	
	@GET
	@Produces("application/xml")
	public List<PersonaJuegos> getListarPersonaJuegos(){
		return personajuegoDao.getPersonaJuegoAll();
	}
	
	@GET
	@Produces("application/xml")
	@Path("{id}")
	public PersonaJuegos getPersonaJuegoById(@PathParam("id") int id){
		return personajuegoDao.getPersonaJuegoById(id);
	}
	
	

}
