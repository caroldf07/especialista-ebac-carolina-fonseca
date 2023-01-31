package fila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int input;
        String FILA_VAZIA = "A fila está vazia";

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Inserir item na fila");
            System.out.println("2 - Consultar tamanho da fila");
            System.out.println("3 - Remover item da fila");
            System.out.println("4 - Consultar item no início da fila");
            System.out.println("5 - Consultar item no fim da fila");
            System.out.println("0 - Sair");

            opcao = entrada.nextInt();

            if (opcao < 0 || opcao > 5) {
                System.out.println("Opção inválida, tente novamente");
            }

            if (opcao == 1) {
                System.out.println("Digite valor inteiro para dado ");
                input = entrada.nextInt();
                fila.enqueue(input);
                System.out.println("Número inserido com sucesso");
            }

            if (opcao == 2) {
                if (fila.isEmpty()) System.out.println(FILA_VAZIA);
                else System.out.println("O tamanho da fila é: " + fila.size());
            }

            if (opcao == 3) {
                if (fila.isEmpty()) System.out.println(FILA_VAZIA);
                else {
                    fila.dequeue();
                    System.out.println("Item removido com sucesso");
                }
            }
            if (opcao == 4) {
                if (fila.isEmpty()) System.out.println(FILA_VAZIA);
                else {
                    System.out.println("O item no início da fila é: " + fila.front());
                }
            }

            if (opcao == 5) {
                if (fila.isEmpty()) System.out.println(FILA_VAZIA);
                else {
                    System.out.println("O item no fim é: " + fila.rear());
                }
            }
        } while (opcao != 0);
    }
}
