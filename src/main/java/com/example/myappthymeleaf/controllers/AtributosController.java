package com.example.myappthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myappthymeleaf.model.Funcionario;

@Controller
public class AtributosController {

	@GetMapping("/buscar")
	@ResponseBody
	public String buscar(@RequestParam("termo") String termo) {
	    // Lógica para buscar com o termo fornecido
		//System.out.println(termo);
	    return "resultados " + termo;
	}

	
    @GetMapping("/formFuncionario")
    public String showForm(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "formFuncionario";
    }
	@PostMapping("/adicionarFuncionario")
	public String adicionarFuncionario(@ModelAttribute("funcionario") Funcionario funcionario) {
	    // Lógica para processar o funcionário
	    return "funcionarioDetalhes";
	}

}
