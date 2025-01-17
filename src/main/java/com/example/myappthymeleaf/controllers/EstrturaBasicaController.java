package com.example.myappthymeleaf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.myappthymeleaf.model.Produto;


@Controller
public class EstrturaBasicaController {

    @GetMapping("/estrutura-basica")
    public String listSeedStarters(Model model) {
       
    	List<Produto> lista = new ArrayList<Produto>();
    	lista.add(new Produto("Smartphone", 1000.0));
    	lista.add(new Produto("Notebook", 3000.0));
    	
    	
    	model.addAttribute("produtos",lista);
    	//variável básica
    	model.addAttribute("mensagem", "Bem-vindo, aluno Fiap!");
    	return "index";
    }
}
