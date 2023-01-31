package pilha;

public class Pilha {
    private static class NO {
        private int dado;
        private NO proximo;
    }

    private NO topo;
    private int size;

    public void push(int novoDado) {
        NO novo = new NO();
        novo.dado = novoDado;
        novo.proximo = topo;
        topo = novo;
        size++;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        return size;
    }

    public void pop() {
        topo = topo.proximo;
        size--;
    }

    public int top() {
        return topo.dado;
    }
}


