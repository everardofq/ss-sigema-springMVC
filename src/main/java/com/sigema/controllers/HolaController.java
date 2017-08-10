package com.sigema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {

	@RequestMapping("irHola")//peticion que se declaro en el archivo principal.jsp
	public ModelAndView redireccion(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hola");//pagina .jsp que se le devolvera al usuario
		
		return mav;
	}
//	@RequestMapping("login")
//	public ModelAndView redirect()
//	{
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("login");//pagina .jsp que se le devolvera al usuario
//		
//		return mav;
//	}
}
