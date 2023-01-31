package fila;

public class Fila {

    private static class NO {
        private int dado;
        private NO proximo;
    }

    private NO inicio;
    private NO fim;
    private int size;

    public void enqueue(int novoDado) {
        NO novo = new NO();
        novo.dado = novoDado;
        novo.proximo = inicio;
        if (inicio == null) {
            inicio = novo;
        } else {
            fim.proximo = novo;
        }
        fim = novo;
        size++;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return size;
    }

    public void dequeue() {
        inicio = inicio.proximo;
        size--;
    }

    public int rear() {
        return fim.dado;
    }

    public int front() {
        return inicio.dado;
    }
}
