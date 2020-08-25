package com.company.exercicio03e04;

public class ContaPoupanca extends Conta implements Imposto {

    public ContaPoupanca(String numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento() {
        return (getSaldo() * 0.05);
    }

    public double calculoDeImpostoSobreRendimento() {
        return Imposto.calcularImposto(getSaldo() * 0.05, 0.10);
    }
}
