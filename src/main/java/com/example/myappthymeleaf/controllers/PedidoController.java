package com.example.myappthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.myappthymeleaf.model.Pedido;
import com.example.myappthymeleaf.model.Produto;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class PedidoController {

    // Lista de produtos (simulando dados vindos de um banco de dados)
    private List<Produto> produtos = Arrays.asList(
        new Produto(1L, "Produto A"),
        new Produto(2L, "Produto B"),
        new Produto(3L, "Produto C")
    );

    // Exibe o formulário com os produtos
    @GetMapping("/pedido")
    public String exibirFormulario(Model model) {
        model.addAttribute("pedido", new Pedido()); // Cria um novo Pedido
        model.addAttribute("produtos", produtos);   // Adiciona a lista de produtos ao modelo
        return "formularioPedido"; // Nome da view (formularioPedido.html)
    }

    // Processa o envio do formulário
    @PostMapping("/salvar-pedido")
    public String salvarPedido(@ModelAttribute Pedido pedido, RedirectAttributes redirectAttributes) {
        // Aqui você pode processar o pedido e salvar no banco de dados
        // Por exemplo: pedidoRepository.save(pedido);

        // Apenas exibe os IDs dos produtos selecionados (para fins de demonstração)
        System.out.println("Produtos selecionados: " + pedido.getProdutosSelecionados());
        
        List<Produto> produtosSelecionados = produtos.stream()
                .filter(produto -> pedido.getProdutosSelecionados().contains(produto.getId()))
                .toList();

     // Adiciona os produtos selecionados ao RedirectAttributes
        	redirectAttributes.addFlashAttribute("produtosSelecionados", produtosSelecionados);

        // Redireciona para uma página de sucesso
        return "redirect:/pedido-sucesso";
    }

    // Exibe uma página de sucesso após salvar o pedido
    @GetMapping("/pedido-sucesso")
    public String sucesso() {
        return "sucesso-pedido"; // Nome da view de sucesso (sucesso.html)
    }
}
