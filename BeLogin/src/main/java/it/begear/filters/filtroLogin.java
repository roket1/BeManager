package it.begear.filters;

import it.begear.model.Utente;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class filtroLogin implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Utente user;
		System.out.println("Richiesta Intercettata");
		// Discriminante del filtro
		user = (Utente) request.getSession().getAttribute("user");
		/* se è nullo, l'utente non haeffettuato ancora l'accesso */
		if (user == null) {
			response.sendRedirect("../utente/login.html");
			return false;
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("richiesta intercettata e rimandata");

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("richiesta completata.");

	}

}
