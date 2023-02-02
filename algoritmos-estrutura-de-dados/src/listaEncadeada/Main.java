package listaEncadeada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int input;
        String LISTA_VAZIA = "A lista está vazia";
        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Inserir item na lista");
            System.out.println("2 - Consultar tamanho da lista");
            System.out.println("3 - Inserir item na lista em determinada posição");
            System.out.println("4 - Remover item da lista");
            System.out.println("5 - Remover item da lista em determinada posição");
            System.out.println("6 - Consultar item em determinada posição na lista");
            System.out.println("7 - Exibir lista completa");
            System.out.println("0 - Sair");

            opcao = entrada.nextInt();

            if (opcao < 0 || opcao > 7) {
                System.out.println("Opção inválida, tente novamente");
            }

            if (opcao == 1) {
                System.out.println("Digite valor inteiro para o dado a ser inserido: ");
                input = entrada.nextInt();
                lista.push(input);
                System.out.println("Número inserido com sucesso");
            }

            if (opcao == 2) {
                if (lista.isEmpty()) System.out.println(LISTA_VAZIA);
                else System.out.println("O tamanho da lista é: " + lista.size());
            }

            if (opcao == 3) {
                if (lista.isEmpty()) System.out.println(LISTA_VAZIA);
                else {
                    System.out.println("Digite valor inteiro para o dado a ser inserido: ");
                    input = entrada.nextInt();
                    System.out.println("Digite a posição que deseja inseri-lo: ");
                    lista.insert(input, entrada.nextInt());
                    System.out.println("Número inserido com sucesso");
                }
            }
            if (opcao == 4) {
                if (lista.isEmpty()) System.out.println(LISTA_VAZIA);
                else {
                    lista.pop();
                    System.out.println("Item removido com sucesso");
                }
            }

            if (opcao == 5) {
                if (lista.isEmpty()) System.out.println(LISTA_VAZIA);
                else {
                    System.out.println("Digite a posição do elemento que deseja remover: ");
                    lista.remove(entrada.nextInt());
                    System.out.println("Item removido com sucesso");
                }
            }

            if (opcao == 6) {
                if (lista.isEmpty()) System.out.println(LISTA_VAZIA);
                else {
                    System.out.println("Digite a posição do elemento que deseja consultar: ");
                    System.out.println("O nó é: " + lista.elementAt(entrada.nextInt()).toString());
                }
            }

            if (opcao == 7) {
                if (lista.isEmpty()) System.out.println(LISTA_VAZIA);
                else {
                    lista.printList();
                }
            }
        } while (opcao != 0);

    }
}
