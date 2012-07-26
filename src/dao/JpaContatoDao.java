package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import entidades.Contato;

@Repository
public class JpaContatoDao extends Dao<Contato> implements ContatoDao {
	

	@PersistenceContext
	private EntityManager entityManager;
	
	public JpaContatoDao() {
		super(Contato.class);
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
