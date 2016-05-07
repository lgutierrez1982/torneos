package com.cpt.torneo.ejb;

import java.util.List;

import javax.ejb.Local;

import com.cpt.torneo.entities.Juego;


@Local
public interface JuegosService {
	
	public List<Juego> getJuegoAll();
	
	public Juego getJuegoById(int id);
	
	public void insertJuego(Juego juego);
	
}
