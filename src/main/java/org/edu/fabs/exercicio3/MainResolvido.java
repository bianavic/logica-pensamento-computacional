package org.edu.fabs.exercicio3;

import java.util.Scanner;

public class MainResolvido {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        int saque = saldoTotal - valorSaque;

        if (saque > 0) {
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saque);
        } else if (saque <= 0) {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }

    }

}
