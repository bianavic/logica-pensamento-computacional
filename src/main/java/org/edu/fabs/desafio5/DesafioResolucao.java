package org.edu.fabs.desafio5;

import java.util.Scanner;

public class DesafioResolucao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
        if (partes.length == 4) {
            // Obtenha os valores diretamente das partes divididas
            String data = partes[0];
            String hora = partes[1];
            String descricao = partes[2];
            double valor = Double.parseDouble(partes[3]);

            Transacao transacao = new Transacao(data, hora, descricao, valor);
            transacao.imprimir();
        } else {
            System.out.println("Entrada inválida. Certifique-se de fornecer os valores corretos.");
        }
    }
}

class TransacaoResolucao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public TransacaoResolucao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }

}