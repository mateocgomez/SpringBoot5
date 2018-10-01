package com.neolinux.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//identificando que es un controlador
@Controller
public class IndexController {
	
	@Value("${application.controller.titulo}")
	private String titulo;
	
	//Podemos usar RequestMapping o PostMapping dependiento del tipo de API REST que vayamos a consumir 
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", this.titulo);
		return "index";
	}

}
