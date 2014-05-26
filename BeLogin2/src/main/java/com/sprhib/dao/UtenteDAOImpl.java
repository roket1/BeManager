package com.sprhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhib.model.Utente;

@Repository
public class UtenteDAOImpl implements UtenteDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addTeam(Utente utente) {
		getCurrentSession().save(utente);
	}

	public void updateTeam(Utente utente) {
		Utente teamToUpdate = getTeam(utente.getId());
		teamToUpdate.setName(utente.getName());
		teamToUpdate.setRating(utente.getRating());
		getCurrentSession().update(teamToUpdate);
		
	}

	public Utente getTeam(int id) {
		Utente utente = (Utente) getCurrentSession().get(Utente.class, id);
		return utente;
	}

	public void deleteTeam(int id) {
		Utente utente = getTeam(id);
		if (utente != null)
			getCurrentSession().delete(utente);
	}

	@SuppressWarnings("unchecked")
	public List<Utente> getTeams() {
		return getCurrentSession().createQuery("from Utente").list();
	}

}
