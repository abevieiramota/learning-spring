package br.com.abevieiramota.awvinhosabe.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.abevieiramota.awvinhosabe.model.Vinho;
import br.com.abevieiramota.awvinhosabe.model.Vinho.Tipo;
import br.com.abevieiramota.awvinhosabe.repository.Vinhos;
import br.com.abevieiramota.awvinhosabe.repository.filter.VinhoFilter;

@Controller
@RequestMapping("/vinho")
public class VinhosController {

	@Autowired
	private Vinhos vinhoRepository;

	@GetMapping("/novo")
	public ModelAndView novo(Vinho vinho) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("tipos", Tipo.values());
		mv.setViewName("/vinho/cadastro-vinho");

		return mv;
	}

	@GetMapping("/pesquisar")
	public ModelAndView pesquisar(VinhoFilter vinhoFilter) {

		ModelAndView mv = new ModelAndView("/vinho/pesquisa-vinhos");

		mv.addObject("vinhos", vinhoRepository.findByNomeContainingIgnoreCase(vinhoFilter.getNome()));

		return mv;
	}

	@PostMapping("/novo")
	public ModelAndView salvar(@Valid Vinho vinho, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(vinho);
		}

		vinhoRepository.save(vinho);
		attributes.addFlashAttribute("mensagem", "Vinho salvo com sucesso!");

		return new ModelAndView("redirect:/vinho/novo");
	}
}
