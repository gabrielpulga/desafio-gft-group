package com.company.exercicio03e04;

abstract class Conta {
    // Construtor com todos os parâmetros
    public Conta(String numero, String titular, int saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    private String numero;
    private String titular;
    private int saldo;

    // Getters and setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double rendimento() {
        return 0;
    }
}