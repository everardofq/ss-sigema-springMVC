package com.sigema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public ModelAndView student(){
		ModelAndView mav = new ModelAndView("student","command",new Student());
		return mav;	
	}
	
	@RequestMapping(value="/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model){
		
		model.addAttribute("nombre", student.getNombre());
		model.addAttribute("edad", student.getEdad());
		model.addAttribute("id", student.getId());
		
		return "result";
	}
}
