package com.example.myappthymeleaf.model;

import java.util.List;

public class Pedido {

    private List<Long> produtosSelecionados; // IDs dos produtos selecionados

    // Getters e Setters
    public List<Long> getProdutosSelecionados() {
        return produtosSelecionados;
    }

    public void setProdutosSelecionados(List<Long> produtosSelecionados) {
        this.produtosSelecionados = produtosSelecionados;
    }
}
