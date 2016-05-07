package com.cpt.torneo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries( { @NamedQuery(name = "PersonaJuegos.findAll", query="SELECT p FROM PersonaJuegos p ORDER BY p.idPersonaJuego")})
@Table(name="persona_juego")
@XmlRootElement // se agrega para poder realizar @Produces("application/xml") mostrar como XML
public class PersonaJuegos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_persona_juego")
	private int idPersonaJuego;
	
	
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name="id_juego")
	private Juego juegos;

}
