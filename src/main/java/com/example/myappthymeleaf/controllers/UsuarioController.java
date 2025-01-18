package com.example.myappthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.myappthymeleaf.model.Usuario;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class UsuarioController {

    // Exibe o formulário de cadastro (GET)
    @GetMapping("/cadastro")
    public String exibirFormulario(Model model) {
        // Cria um objeto 'usuario' vazio e adiciona ao modelo
        model.addAttribute("usuario", new Usuario());
        return "usuario"; // Nome da view (formularioCadastro.html)
    }

    // Processa o envio do formulário (POST)
    @PostMapping("/salvar")
    public String salvarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, 
                                 BindingResult bindingResult) {
        // Se houver erros de validação, retorna para o formulário com os erros
        if (bindingResult.hasErrors()) {
            return "usuario"; // Volta para o formulário de cadastro
        }

        // Aqui você pode salvar o usuário no banco de dados
        // Exemplo: usuarioRepository.save(usuario);

        // Caso contrário, redireciona para uma página de sucesso ou outra view
        return "redirect:/sucesso";
    }

    // Exibe uma página de sucesso após o envio do formulário (GET)
    @GetMapping("/sucesso")
    public String sucesso() {
        return "sucesso"; // Nome da view de sucesso (sucesso.html)
    }
}
