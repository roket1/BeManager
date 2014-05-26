package it.begear.service;

import it.begear.dao.UtenteDAO;
import it.begear.model.Utente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamServiceImpl implements UtenteService {
	
	@Autowired
	private UtenteDAO utenteDAO;

	public void addTeam(Utente utente) {
		utenteDAO.addTeam(utente);		
	}

	public void updateTeam(Utente utente) {
		utenteDAO.updateTeam(utente);
	}

	public Utente getTeam(int id) {
		return utenteDAO.getTeam(id);
	}

	public void deleteTeam(int id) {
		utenteDAO.deleteTeam(id);
	}

	public List<Utente> getTeams() {
		return utenteDAO.getTeams();
	}

}
