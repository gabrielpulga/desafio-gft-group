package com.company.exercicio03e04;

public interface Imposto {
    static double calcularImposto(double rendimento, double porcentagemSobreRendimento) {
        return rendimento*porcentagemSobreRendimento;
    }
}