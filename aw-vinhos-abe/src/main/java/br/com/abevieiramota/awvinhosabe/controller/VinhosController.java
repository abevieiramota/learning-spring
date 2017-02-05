package br.com.abevieiramota.awvinhosabe.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.abevieiramota.awvinhosabe.Vinhos;
import br.com.abevieiramota.awvinhosabe.model.Vinho;
import br.com.abevieiramota.awvinhosabe.model.Vinho.Tipo;

@Controller
public class VinhosController {

	@Autowired
	private Vinhos vinhoRepository;

	@GetMapping("/vinho/novo")
	public ModelAndView novo(Vinho vinho) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("tipos", Tipo.values());
		mv.setViewName("/vinho/cadastro-vinho");

		return mv;
	}

	@PostMapping("/vinho/novo")
	public ModelAndView salvar(@Valid Vinho vinho, BindingResult result) {
		if (result.hasErrors()) {
			return novo(vinho);
		}

		vinhoRepository.save(vinho);

		return new ModelAndView("redirect:/vinho/novo");
	}
}
