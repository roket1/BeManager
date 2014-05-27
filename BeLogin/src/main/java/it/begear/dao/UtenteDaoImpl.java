package it.begear.dao;

import java.util.List;

import it.begear.model.Utente;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UtenteDaoImpl implements UtenteDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addUser(Utente utente) {
		getCurrentSession().save(utente);
	}

	public void updateUser(Utente utente) {
		Utente teamToUpdate = getUser(utente.getId());
		teamToUpdate.setName(utente.getName());
		teamToUpdate.setRating(utente.getRating());
		getCurrentSession().update(teamToUpdate);

	}

	public Utente getUser(int id) {
		Utente utente = (Utente) getCurrentSession().get(Utente.class, id);
		return utente;
	}

	public void deleteUser(int id) {
		Utente utente = getUser(id);
		if (utente != null)
			getCurrentSession().delete(utente);
	}

	@SuppressWarnings("unchecked")
	public List<Utente> getUsers() {
		return getCurrentSession().createQuery("from Utente").list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Utente> findByExample(Utente utentedatrovare) {
		try {
			List<Utente> results = getCurrentSession()
					.createCriteria(Utente.class)
					.add(Example.create(utentedatrovare)).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public boolean isEmpty(List<Utente> list) {
		if (list.isEmpty())
			return true;
		else
			return false;
	}

}
