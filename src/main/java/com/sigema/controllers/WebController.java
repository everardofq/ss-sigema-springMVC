package com.sigema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	   public String index() {
		   return "index";//retorna la vista index.jsp
	   }
	   
	   @RequestMapping(value = "/redirect" , method = RequestMethod.GET)
	   public String redirect() {
	      return "redirect:finalPage";
	   }
	   
	   @RequestMapping(value = "/finalPage" , method = RequestMethod.GET)
	   public String finalPage() {
	      return "final";
	   }
	   
	   @RequestMapping(value = "/logIn" , method = RequestMethod.GET)
	   public String login() {
		   
	      return "redirect:finalPage";
	   }
}
