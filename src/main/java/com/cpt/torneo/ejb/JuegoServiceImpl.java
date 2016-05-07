package com.cpt.torneo.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.cpt.torneo.dao.JuegoDao;
import com.cpt.torneo.entities.Juego;

@Stateless
public class JuegoServiceImpl implements JuegosService {

	@EJB
	private JuegoDao juegoDao;
	
	public List<Juego> getJuegoAll() {
		return juegoDao.getJuegosAll();
	}

	public Juego getJuegoById(int id) {
		return juegoDao.getJuegoById(id);
	}

	public void insertJuego(Juego juego) {
		juegoDao.insertarJuegos(juego);

	}

}
