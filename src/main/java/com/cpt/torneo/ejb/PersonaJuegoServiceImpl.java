package com.cpt.torneo.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.cpt.torneo.dao.PersonaJuegoDao;
import com.cpt.torneo.entities.PersonaJuegos;

@Stateless
public class PersonaJuegoServiceImpl implements PersonaJuegoService {

	@EJB
	private PersonaJuegoDao personajuegoDao;
	
	public List<PersonaJuegos> getPersonaJuegosAll() {
		return personajuegoDao.getPersonaJuegoAll();
	}

	public PersonaJuegos getPersonaJuegoById(int id) {
		return personajuegoDao.getPersonaJuegoById(id);
	}

	public PersonaJuegos getJuegoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertPersonaJuegos(PersonaJuegos personajuego) {
		// TODO Auto-generated method stub

	}

}
