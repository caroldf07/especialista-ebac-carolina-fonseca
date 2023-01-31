package pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int input;
        String PILHA_VAZIA = "A pilha está vazia";

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Inserir item na pilha");
            System.out.println("2 - Consultar tamanho da pilha");
            System.out.println("3 - Remover item da pilha");
            System.out.println("4 - Consultar item no topo da fila");
            System.out.println("0 - Sair");

            opcao = entrada.nextInt();

            if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida, tente novamente");
            }

            if (opcao == 1) {
                System.out.println("Digite valor inteiro para dado ");
                input = entrada.nextInt();
                pilha.push(input);
                System.out.println("Número inserido com sucesso");
            }

            if (opcao == 2) {
                if (pilha.isEmpty()) System.out.println(PILHA_VAZIA);
                else System.out.println("O tamanho da pilha é: " + pilha.size());
            }

            if (opcao == 3) {
                if (pilha.isEmpty()) System.out.println(PILHA_VAZIA);
                else {
                    pilha.pop();
                    System.out.println("Item removido com sucesso");
                }
            }

            if (opcao == 4) {
                if (pilha.isEmpty()) System.out.println(PILHA_VAZIA);
                else {
                    System.out.println("O item no topo é: " + pilha.top());
                }
            }

        } while (opcao != 0);
    }
}
