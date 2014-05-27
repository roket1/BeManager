package it.begear.controller;

import it.begear.model.Utente;
import it.begear.service.UtenteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/utente")
public class UtenteController {

	@Autowired
	private UtenteService utenteService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addTeamPage() {
		ModelAndView modelAndView = new ModelAndView("aggiungi-utenti");
		modelAndView.addObject("utente", new Utente());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addingTeam(@ModelAttribute Utente utente) {

		ModelAndView modelAndView = new ModelAndView("home");
		utenteService.addUser(utente);

		String message = "Utente aggiunto.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	/* Per Default il RequestMethod e' di tipo GET */
	@RequestMapping(value = "/list")
	public ModelAndView listOfTeams() {
		ModelAndView modelAndView = new ModelAndView("lista-utenti");

		List<Utente> utentes = utenteService.getUsers();
		modelAndView.addObject("utentes", utentes);

		return modelAndView;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView viewlog() {
		ModelAndView model = new ModelAndView("login");
		model.addObject("utente", new Utente());
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute Utente utente) {
		ModelAndView model = new ModelAndView("home");
		if (!utenteService.findByExample(utente).isEmpty())
			model.addObject("message", "LOGIN OK");
		else
			model.addObject("message", "LOGIN FAIL");

		return model;

	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editTeamPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("modifica-utenti");
		Utente utente = utenteService.getUser(id);
		modelAndView.addObject("team", utente);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView edditingTeam(@ModelAttribute Utente utente,
			@PathVariable Integer id) {

		ModelAndView modelAndView = new ModelAndView("home");

		utenteService.updateUser(utente);

		String message = "utente modificato.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteTeam(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		utenteService.deleteUser(id);
		String message = "utente cancellato.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
