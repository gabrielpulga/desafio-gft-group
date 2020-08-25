package com.company.exercício02;

public class InstanciadorDePessoas {
    public static void InstanciarEImprimirPessoaNaTela() {
        Pessoa pessoa = new Pessoa("Gabriel Pulga", "Rua Capitao Souza Franco", "45999211629");
        System.out.println(pessoa);
    }

    public static void main(String[] args) {
        InstanciarEImprimirPessoaNaTela();
    }
}