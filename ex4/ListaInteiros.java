package ex4;

import java.util.LinkedList;

//OBJETO BASE

public class ListaInteiros implements Lista{
    private LinkedList<Integer> lista;

    public ListaInteiros() {
        lista = new LinkedList<Integer>();
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
