package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Utente;

public interface UtenteDAO {
	
	public void addTeam(Utente utente);
	public void updateTeam(Utente utente);
	public Utente getTeam(int id);
	public void deleteTeam(int id);
	public List<Utente> getTeams();

}
