package fr.projet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.model.Commentaire;

@Repository
@Transactional
public class CommentaireDAO extends IDAO<Commentaire> {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Commentaire find(int id) {
		return this.em.find(Commentaire.class, id);
	}

	@Override
	public List<Commentaire> findAll() {
		return this.em.createQuery("SELECT c FROM Commentaire c", Commentaire.class).getResultList();
	}

	@Override
	public Commentaire save(Commentaire object) {
		return this.em.merge(object);
	}

	@Override
	public boolean delete(Commentaire object) {
		try {
			this.em.remove(this.em.merge(object));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
	

}
