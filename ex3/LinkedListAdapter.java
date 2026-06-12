import java.util.LinkedList;

public class LinkedListAdapter implements ListaInteiros{
    private LinkedList<Integer> lista;

    public LinkedListAdapter(LinkedList<Integer> lista) {
        this.lista = lista;
    }

    public int pega(int i) {
        return lista.get(i);
    }

    public void adicionaFinal(int adicionar) {
        lista.addLast(adicionar);
    }

    public void adicionaInicio(int adicionar) {
        lista.addFirst(adicionar);
    }

    public int tamanho() {
        return lista.size();
    }

    public void imprimir() {
        for (int elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }    
}
