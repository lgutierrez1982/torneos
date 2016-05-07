package com.cpt.torneo.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.cpt.torneo.dao.JuegoDao;
import com.cpt.torneo.entities.Juego;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Stateless
@Path("/juego")
public class JuegoRS {
	
	@EJB
	private JuegoDao juegoDao;
	
	@GET
	@Produces("application/xml")
	public List<Juego> getListarJuegos(){
		return juegoDao.getJuegosAll();
	}
	
	@GET
	@Produces("application/xml")
	@Path("{id}")
	public String getJuegoById(@PathParam("id") int id) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		
    	Juego juego = juegoDao.getJuegoById(id);
    	
    	String jsonInString = mapper.writeValueAsString(juego);
		
		return jsonInString;
	}
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public void insertarJuego(Juego juego) throws JsonProcessingException {
		juegoDao.insertarJuegos(juego);
	}

}
