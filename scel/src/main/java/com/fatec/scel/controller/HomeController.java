package com.fatec.scel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "/menu";
	}

	@GetMapping("/usuario/cadastrar")
	public String cadastrarUsuario() {
		return "/cadastrarUsuario";
	}

	@GetMapping("/livro/cadastrar")
	public String cadastrarLivro() {
		return "/cadastrarLivro";
	}
}