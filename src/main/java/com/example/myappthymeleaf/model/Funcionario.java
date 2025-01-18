package com.example.myappthymeleaf.model;

public class Funcionario {
    // Atributos privados
    private String nome;
    private int idade;
    private String cargo;
    private double salario;

    // Construtor padrão
    public Funcionario() {}

    // Construtor com parâmetros
    public Funcionario(String nome, int idade, String cargo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para aumentar o salário
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        }
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }

    public static void main(String[] args) {
        // Criando um objeto Funcionario
        Funcionario funcionario = new Funcionario("Thiago Xavier", 30, "Desenvolvedor", 5000.00);

        // Exibindo informações do funcionário
        funcionario.exibirInformacoes();

        // Aumentando o salário em 10%
        funcionario.aumentarSalario(10.0);

        // Exibindo informações após o aumento
        System.out.println("\nApós aumento:");
        funcionario.exibirInformacoes();
    }
}