package com.cpt.torneo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries( { @NamedQuery(name = "Juego.findAll", query="SELECT j FROM Juego j ORDER BY j.idJuego")})
@Table(name="juegos")
@XmlRootElement // se agrega para poder realizar @Produces("application/xml") mostrar como XML
public class Juego {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_juegos")
	private int idJuego;
	
	@Column(nullable= false, length=50)
	private String nombre;
	
	@Column(nullable= false, length=50)
	private String categoria;

	public Juego() {}

	public Juego(int idJuego) {
		this.idJuego = idJuego;
	}

	public Juego(String nombre, String categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public int getIdJuegos() {
		return idJuego;
	}

	public void setIdJuegos(int idJuegos) {
		this.idJuego = idJuegos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Juegos [idJuegos=" + idJuego + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}
	
	
	
	
	
	
	
	

}
