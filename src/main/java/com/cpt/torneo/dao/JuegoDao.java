package com.cpt.torneo.dao;

import java.util.List;

import com.cpt.torneo.entities.Juego;

public interface JuegoDao {
	
	public List<Juego> getJuegosAll();
	
	public Juego getJuegoById(int id);
	
	public void insertarJuegos(Juego juego);

}
