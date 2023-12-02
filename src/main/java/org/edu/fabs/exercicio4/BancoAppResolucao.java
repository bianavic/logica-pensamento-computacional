package org.edu.fabs.exercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoAppResolucao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        for(int i = 0; i < periodo; i++) {
            // valorFinal = valorInicial *=  Math.pow(1 + taxaJuros, i);
            valorFinal = (valorInicial * (Math.pow((1 + taxaJuros), periodo)) - valorInicial) + valorInicial;
        }

        DecimalFormat df = new DecimalFormat("#####.00");
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal).replace(",", "."));

        scanner.close();
    }
}
