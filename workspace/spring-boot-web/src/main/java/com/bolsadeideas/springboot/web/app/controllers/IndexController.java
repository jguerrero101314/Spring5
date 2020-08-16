package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	//@RequestMapping(value="/index", method=RequestMethod.GET)
	//@GetMapping(value="/index")
	//@GetMapping("/index")
	  @GetMapping({"/index", "/", "/home"})
	 public String index(Model model) {
		  //Model model
		 // ModelMap model
		  //Map<String, Object> map
		  model.addAttribute("titulo","Hola Spring Framework!");		
		  //map.put("titulo","Hola Spring Framework con Map!");	
		 // mv.addObject("titulo","Hola Spring Framework con ModelAndView!");	
		 // mv.setViewName("index");
		  
		//  return mv;
		return "index";
	}

}
