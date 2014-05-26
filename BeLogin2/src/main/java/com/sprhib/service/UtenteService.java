package com.sprhib.service;

import java.util.List;

import com.sprhib.model.Utente;

public interface UtenteService {
	
	public void addTeam(Utente utente);
	public void updateTeam(Utente utente);
	public Utente getTeam(int id);
	public void deleteTeam(int id);
	public List<Utente> getTeams();

}
