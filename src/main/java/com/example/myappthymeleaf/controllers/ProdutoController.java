package com.example.myappthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.myappthymeleaf.model.Produto;

@Controller
public class ProdutoController {

    @GetMapping("/produto/{id}")
    public String exibirProduto(@PathVariable Long id, Model model) {
        // Aqui, você poderia buscar o produto por ID no banco de dados
        Produto produto = new Produto(id, "Produto Exemplo", "Descrição do produto", 99.99);

        // Passa o produto para o modelo e define o conteúdo específico
        model.addAttribute("produto", produto);
        model.addAttribute("bodyContent", "produto/index");  // A página de produto será renderizada aqui
        return "index";  // Retorna o layout base, que incluirá o conteúdo do produto
    }
}
