package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bolsadeideas.springboot.web.app.model.Usuario;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.index.perfil}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.index.listar}")
	private String textoListado;
	
	
	//@RequestMapping(value="/index", method=RequestMethod.GET)
	//@GetMapping(value="/index")
	//@GetMapping("/index")
	  @GetMapping({"/index", "/", "/home"})
	 public String index(Model model) {
		  //Model model
		 // ModelMap model
		  //Map<String, Object> map
		  //model.addAttribute("titulo","Hola Spring Framework con model!");		
		  //map.put("titulo","Hola Spring Framework con Map!");	
		 // mv.addObject("titulo","Hola Spring Framework con ModelAndView!");	
		 // mv.setViewName("index");
		  model.addAttribute("titulo", textoIndex);	
		//  return mv;
		return "index";
	}
	  @RequestMapping("/perfil")
	  public String perfil(Model model) {
		  
		  Usuario usuario = new Usuario();
		  usuario.setNombre("Joel");
		  usuario.setApellido("Guerrero");
		  usuario.setEmail("joelg104@hotmail.com");
		  
		  model.addAttribute("usuario", usuario );
		 // model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre() + " " + usuario.getApellido()));	
		  model.addAttribute("titulo",textoPerfil.concat(usuario.getNombre() + " " + usuario.getApellido()));	
		  return "perfil";
		  
	  }
	  @RequestMapping("/listar")
	  public String listar(Model model) {
		 // List<Usuario> usuarios = new ArrayList<>();
		/*  List<Usuario> usuarios = Arrays.asList(
				        new Usuario("Joel","Guerrero", "jguerrero10@hotmail.com"),
				        new Usuario("Jose","Guevara", "jguevara@hotmail.com"),
				        new Usuario("Luis","Robinson", "lrobinson@outlook.com"),
		        new Usuario("Tornado","Roe", "roe@outlook.com"));	*/	
		  
		/*  usuarios.add(new Usuario("Jose","Guevara", "jguevara@hotmail.com"));
		  usuarios.add(new Usuario("Luis","Robinson", "lrobinson@outlook.com"));*/
		 // model.addAttribute("titulo", "Listado de usuarios" );
		 // model.addAttribute("usuarios", usuarios);
		  model.addAttribute("titulo", textoListado );
		  return "listar";
	  }
	  @ModelAttribute("usuarios")
	  public  List<Usuario> poblarUsuarios(){
		  List<Usuario> usuarios = Arrays.asList(
			        new Usuario("Joel","Guerrero", "jguerrero10@hotmail.com"),
			        new Usuario("Jose","Guevara", "jguevara@hotmail.com"),
			        new Usuario("Luis","Robinson", "lrobinson@outlook.com"),
			        new Usuario("Tornado","Roe", "roe@outlook.com"));
		  
		  return usuarios;	  
	  }

}
