package it.begear.dao;

import it.begear.model.Utente;

import java.util.List;

public interface UtenteDao {

	public void addUser(Utente utente);

	public void updateUser(Utente utente);

	public Utente getUser(int id);

	public void deleteUser(int id);

	public List<Utente> getUsers();

	public List<Utente> findByExample(Utente utentedatrovare);

	public boolean isEmpty(List<Utente> list);

}
