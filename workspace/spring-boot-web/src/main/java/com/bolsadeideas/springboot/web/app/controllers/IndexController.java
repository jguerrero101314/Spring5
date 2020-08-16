package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	//@RequestMapping(value="/index", method=RequestMethod.GET)
	//@GetMapping(value="/index")
	//@GetMapping("/index")
	  @GetMapping({"/index", "/", "/home"})
	 public String index() {
		
		return "index";
	}

}
