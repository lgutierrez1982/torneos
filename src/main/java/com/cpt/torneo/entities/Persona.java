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
@NamedQueries( { @NamedQuery(name = "Persona.findAll", query="SELECT p FROM Persona p ORDER BY p.idPersona")})
@Table(name="persona")
@XmlRootElement // se agrega para poder realizar @Produces("application/xml") mostrar como XML
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto incrementable
	@Column(name="id_persona")
	private int idPersona;
	
	
	@Column(nullable=false, length=50)
	private String nombre;
	
	@Column(nullable=false, length=50)
	private String nick;
	
	@Column(nullable=false, length=50)
	private String categoria;

	public Persona() {}

	public Persona(int idpersona) {
		this.idPersona = idpersona;
	}

	public Persona(String nombre, String nick, String categoria) {
		this.nombre = nombre;
		this.nick = nick;
		this.categoria = categoria;
	}

	public int getIdpersona() {
		return idPersona;
	}

	public void setIdpersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Persona [idpersona=" + idPersona + ", nombre=" + nombre + ", nick=" + nick + ", categoria=" + categoria
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
