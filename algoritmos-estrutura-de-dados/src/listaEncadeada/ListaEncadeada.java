package listaEncadeada;

public class ListaEncadeada {

    public static class NO {
        private int dado;
        private NO proximo;
        private NO anterior;

        public NO(int dado, NO proximo, NO anterior) {
            this.dado = dado;
            this.proximo = proximo;
            this.anterior = anterior;
        }

        @Override
        public String toString() {
            return "NO{" +
                    "dado=" + dado +
                    ", proximo=" + proximo +
                    ", anterior=" + anterior +
                    '}';
        }
    }


    private NO inicio;
    private NO fim;
    private int size;

    /*Node(LinkedList.Node<E> prev, E element, LinkedList.Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }*/
    public void push(int novoDado) {
        NO ultimo = fim;
        NO novo = new NO(novoDado, null, ultimo);
        ultimo = novo;
        if (ultimo == null) {
            fim = novo;
        } else {
            ultimo.proximo = novo;
        }
        size++;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return this.size;
    }

    public void insert(int novoDado, int posicao) {

        /*Se a posição for do tamanho da lista, então é para inserir o nó no final dela*/
        if (posicao == size || size() == 0) {
            push(novoDado);
        } else {
            /*Procura-se o nó naquela posição*/
            NO proxNo = elementAt(posicao);
            NO noAnterior = proxNo.proximo;

            /*Criamos o novo nó*/
            NO novoNo = new NO(novoDado, null, noAnterior);

            if (noAnterior == null) {
                inicio = novoNo;
            }
            noAnterior.proximo = proxNo;
            proxNo.anterior = noAnterior;

        }
        size++;
    }

    public NO elementAt(int posicao) {
        NO no = inicio;
        /*Se a posição é menor do que o tamanho, então se trabalha com o início da lista*/
        if (posicao < size) {
            /*Percorre a lista até chegar no i que equivale a posição desejada*/
            for (int i = 0; i <= posicao; i++) {
                no = no.proximo;
            }
        }
        return no;
    }

    public int pop() {
        int dadoRemovido = fim.dado;
        if (fim != null) {
            /*Salva os dados atuais do fim da lista para novas variáveis*/
            NO anterior = fim.anterior;

            /*Limpa o fim atual*/
            fim.anterior = null;
            fim.proximo = null;

            /*Atribui o valor do fim da lista para o anterior ao nó que foi limpo*/
            fim = anterior;

            /*Se o anterior é nulo, logo a lista está vazia*/
            if (anterior == null) {
                inicio = null;
            } else {
                anterior.proximo = null;
            }
            size--;
        }
        return dadoRemovido;
    }

    public void remove(int posicao) {
        NO auxiliar = inicio;
        if (inicio == null || this.size <= posicao || posicao < 0) {
            throw new IndexOutOfBoundsException("O tamanho da lista é menor do que a posição " +
                    "informada ou a lista está vazia.");
        } else if (posicao == size - 1) {
            pop();
        } else if (posicao == 0) {
            inicio = auxiliar.proximo;
            size--;
        } else {
            for (int i = 0; auxiliar != null && i < posicao - 1; i++) {
                auxiliar = auxiliar.proximo;
            }
            NO proximo = auxiliar.proximo.proximo;
            auxiliar.proximo = proximo;
            size--;
        }
    }

    public void printList() {
        NO auxiliar = inicio;

        while (auxiliar != null) {
            System.out.println("dado: " + auxiliar.dado);
            auxiliar = auxiliar.proximo;
        }
    }

}
