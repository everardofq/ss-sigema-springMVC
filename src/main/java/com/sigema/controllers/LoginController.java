package com.sigema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.sigema.javaClass.Login;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String student(Model model){
		model.addAttribute("login", new Login());
		return "login";	
	}
	
	@RequestMapping(value="/signIn", method = RequestMethod.POST)
	public String singIn(@ModelAttribute("SpringWeb2") Login login, ModelMap model){
		model.addAttribute("user", login.getUser());
		model.addAttribute("password", login.getPassword());
		
		if(login.getUser().equals("ever") && login.getPassword().equals("123"))
		{
			return "welcome";
		}
		return "redirect:login";
	}
	@RequestMapping(value="/signIn", method = RequestMethod.GET)
	public String singInRedirect(){
		return "redirect:login";	
	}
}
