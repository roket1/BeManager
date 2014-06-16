package it.begear.controller;

import it.begear.model.Utente;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*
 * Questo path che abbiamo inserito deve corrispondere al path-mapping
 * dell'interceptor
 */
@RequestMapping(value = "filter/")
public class LinkController {

	/**/

	@RequestMapping(value = "/user")
	public ModelAndView mainPage(Utente utente, HttpServletRequest req) {
		System.out.println("Sono entrato dopo prehandle del filtro  ");
		ModelAndView model = new ModelAndView("user");
		/* recupero l'utente salvato in sessione */
		Utente utentecorrente = (Utente) req.getSession().getAttribute("user");
		/*
		 * quando noi popoliamo un ModelAndView, le sue proprietà valgono SOLO
		 * per la pagina jsp che viene passato come argomento
		 */
		model.addObject("username", utentecorrente.getName());
		return model;
	}
}
