package com.example.myappthymeleaf.controllers;

import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExemploController {

    @GetMapping("/exemplo-model")
    public ModelAndView exemplo() {
        ModelAndView modelAndView = new ModelAndView("exemploView");
        modelAndView.addObject("mensagem", "Olá, Mundo!");
        return modelAndView;
    }
    
    @GetMapping("/exemplo-string")
    public String exemplo(Map<String, Object> model) {
        model.put("mensagem", "Olá, Mundo!");
        return "exemploView";
    }
}