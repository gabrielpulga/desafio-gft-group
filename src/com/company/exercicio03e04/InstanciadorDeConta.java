package com.company.exercicio03e04;

public class InstanciadorDeConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Numero Da Conta", "Titular Da Conta", 10000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Numero Da Conta", "Titular Da Conta", 10000);

        System.out.println("Rendimento da conta corrente : " + contaCorrente.rendimento());
        System.out.println("Imposto sobre rendimento da conta corrente : " + contaCorrente.calculoDeImpostoSobreRendimento());
        System.out.println("Rendimento da conta poupança : " + contaPoupanca.rendimento());
        System.out.println("Imposto sobre rendimento da conta poupança : " + contaPoupanca.calculoDeImpostoSobreRendimento());
    }
}
