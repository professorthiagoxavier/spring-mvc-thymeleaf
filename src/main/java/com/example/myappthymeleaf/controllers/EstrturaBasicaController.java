package com.example.myappthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstrturaBasicaController {

    @GetMapping("/estrutura-basica")
    public String listSeedStarters(Model model) {
       
    	model.addAttribute("mensagem", "Bem-vindo, aluno Fiap!");
    	return "index";
    }
}
