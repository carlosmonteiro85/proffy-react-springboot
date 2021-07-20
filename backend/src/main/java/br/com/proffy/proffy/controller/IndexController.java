package br.com.proffy.proffy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proffy")
public class IndexController {

	@RequestMapping("/")
	public String pagina1() {
		return "index";
	}
	
	@RequestMapping("/study")
	public String pagina2() {
		return "study";
	}
	
	@RequestMapping("/give-classes")
	public String pagina3() {
		return "give-classes";
	}
}
