package co.com.tarjeta.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.com.tarjeta.entities.Tarjeta;

@Stateless
public class TarjetaBean {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Tarjeta> buscarTodas() {
		return entityManager.createNamedQuery(Tarjeta.Queries.BUSCAR_TODAS, Tarjeta.class).getResultList();
	}	

}
