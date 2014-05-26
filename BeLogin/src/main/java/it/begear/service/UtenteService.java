package it.begear.service;

import it.begear.model.Utente;

import java.util.List;

public interface UtenteService {

	public void addTeam(Utente utente);

	public void updateTeam(Utente utente);

	public Utente getTeam(int id);

	public void deleteTeam(int id);

	public List<Utente> getTeams();

}
