package com.sigema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/saludo")//archivo.jsp a mapear
public class SaludoController {
	
	@RequestMapping(value = "/getSaludo",method = RequestMethod.GET)//metodo para accesar al atributo
	public String getSaludo(ModelMap model) {
		model.addAttribute("saludo", "Hola mundo CRUEL desde el SaludoController");
		return "saludo";
	}
}
