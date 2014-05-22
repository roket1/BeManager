package controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import view.UtentePage;

@Controller
// Abbiamo definito questa classe come un CONTROLLER. Grazie allo scan
// nell'application contest Spring sa che questa classe deve essere trattata
// appunto come Controller
@RequestMapping("/welcome")
// In questo modo mappiamo il metodo sottostante marcato con un altro
// RequestMapping, a questo url così composto
/*
 * NomeProgetto + path definito nel @RequestMapping qui sopra + return del
 * metodo con l'altro @Req. + suffisso (definito nell' appcontext)
 */
/*
 * Che diventa = SpringMVC/welcome/hello.jsp (nel browser scriveremo solo
 * SpringMVC/welcome/. La pagina jsp se la ricava Spring da solo )
 */
/* Questa Classe si occupa di validare i campi inseriti ed effettuare il login */
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	// In questo modo incovhiamo questo metodo appena si fa una GET sull'url
	// SPRINGMVC/welcome/
	public String login(@ModelAttribute UtentePage utente, ModelMap model) {

		model.addAttribute("message", "assafà"); // settiamo un attributo che
													// può essere ricavato nella
													// jsp attraverso il nome
													// dell'attributo
		model.put("utente", utente); // Sto aggiungendo l'oggetto utente
										// (Entity). Quest'oggetto, dopo
										// essere popolato nel form, rimane
										// in vita per tutta la sessione
		return "hello";

	}

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String salvalo(@ModelAttribute UtentePage utente, ModelMap model) {

		
		
		System.out.println("LOOOL");

		return "prova";
	}

}