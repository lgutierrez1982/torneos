import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.cpt.torneo.dao.JuegoDao;
import com.cpt.torneo.entities.Juego;

public class JuegoDaoImpl implements JuegoDao {

	
	//@PersistenceContext(unitName="Torneos")  //esto es con JTA
	//EntityManager em;
			
	private EntityManager em = Persistence.createEntityManagerFactory("Torneos").createEntityManager();;
	//private EntityTransaction tx = em.getTransaction();
	
	@SuppressWarnings("unchecked")
	public List<Juego> getJuegosAll() {
		return em.createNamedQuery("Persona.findAll").getResultList();
	}

	public Juego getJuegoById(int id) {
		return em.find(Juego.class, id);
	}

	public void insertarJuegos(Juego juegos) {
		em.persist(juegos);

	}

}
