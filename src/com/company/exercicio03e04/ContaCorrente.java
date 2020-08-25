package com.company.exercicio03e04;

public class ContaCorrente extends Conta implements Imposto {

    public ContaCorrente(String numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento() {
        return (getSaldo() * 0.03);
    }

    public double calculoDeImpostoSobreRendimento() {
        return Imposto.calcularImposto(getSaldo() * 0.03, 0.25);
    }
}
