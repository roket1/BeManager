package it.begear.service;

import it.begear.dao.UtenteDao;
import it.begear.model.Utente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	private UtenteDao utenteDAO;

	public void addUser(Utente utente) {

		utenteDAO.addUser(utente);
	}

	public void updateUser(Utente utente) {
		utenteDAO.updateUser(utente);
	}

	public Utente getUser(int id) {
		return utenteDAO.getUser(id);
	}

	public void deleteUser(int id) {
		utenteDAO.deleteUser(id);
	}

	public List<Utente> getUsers() {
		return utenteDAO.getUsers();
	}

	@Override
	public List<Utente> findByExample(Utente utentedatrovare) {

		return utenteDAO.findByExample(utentedatrovare);
	}

	@Override
	public boolean isEmpty(List<Utente> list) {

		return utenteDAO.isEmpty(list);
	}

}