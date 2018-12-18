package com.bolsadeovejos.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	@GetMapping("/pindex")
	public String index(Model model) {
		model.addAttribute("titulo", "JKDSJLKDJKLFDJKLDFSLK");
		return "index"; 
	}
	
	

}
