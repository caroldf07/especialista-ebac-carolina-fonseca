package listaEncadeada;

public class ListaEncadeada {

    private static class NO {
        private int dado;
        private NO proximo;
    }

    private NO inicio;
    private NO fim;
    private int size;

    public void push(int novoDado) {
        NO novo = new NO();
        novo.dado = novoDado;
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            novo.proximo = null;
        } else {
            fim.proximo = novo;
            fim = novo;
            fim.proximo = null;
        }
        size++;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return this.size;
    }

    public void remove(int posicao) {
        if (inicio == null || this.size < posicao) {
            throw new IndexOutOfBoundsException("O tamanho da lista é menor do que a posição " +
                    "informada ou a lista está vazia.");
        } else {
            NO auxiliar = inicio;

            if (posicao == 0) {
                inicio = auxiliar.proximo;
                size--;
                return;
            }

            for (int i = 0; auxiliar != null && i < posicao - 1; i++) {
                auxiliar = auxiliar.proximo;
            }

            NO proximo = auxiliar.proximo.proximo;
            auxiliar.proximo = proximo;
            size--;
        }
    }
}
