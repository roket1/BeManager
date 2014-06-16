package it.begear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class NoFilterController {

	@RequestMapping(value = "/index.html")
	public ModelAndView mainPage() {

		return new ModelAndView("home");
	}
}
