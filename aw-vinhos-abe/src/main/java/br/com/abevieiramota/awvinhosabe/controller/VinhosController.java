package br.com.abevieiramota.awvinhosabe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.abevieiramota.awvinhosabe.model.Vinho;
import br.com.abevieiramota.awvinhosabe.model.Vinho.Tipo;

@Controller
public class VinhosController {

	@GetMapping("/vinho/novo")
	public String novo(Model model) {
		model.addAttribute(new Vinho());
		model.addAttribute("tipos", Tipo.values());
		
		return "vinho/cadastro-vinho";
	}

	@PostMapping("/vinho/novo")
	public String salvar(Vinho vinho) {
		// salvar no banco de dados
		return null;
	}
}
