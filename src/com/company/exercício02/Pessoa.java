package com.company.exercício02;

public class Pessoa {
    // Construtor padrão sem parâmetros
    public Pessoa() {
    }

    // Metodo toString utilizado para poder imprimir o nome da pessoa na tela de forma formatada
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    // Construtor com todos os parâmetros
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    private String nome;
    private String endereco;
    private String telefone;

    // Getters and setters dos atributos nome, endereco e telefone
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
