package com.company.exercicio01;

class numerosImparesEmUmIntervalo {
    public static void numerosImparesEmUmIntervalo(int numeroInicial, int numeroFinal) {
        if ((numeroInicial < 0) || (numeroInicial > numeroFinal)) {
            System.out.println("Por favor forneça um numero inicial maior do que zero e um número final maior que o inicial.");
        } else {
            for (int i = numeroInicial; i <= numeroFinal; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        numerosImparesEmUmIntervalo(2,13);
    }
}
