import java.util.ArrayList;

public class ArrayListAdapter implements ListaInteiros{
    private ArrayList<Integer> lista;

    public ArrayListAdapter(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public int pega(int i) {
        return lista.get(i);
    }

    public void adicionaFinal(int adicionar) {
        lista.add(adicionar);
    }

    public void adicionaInicio(int adicionar) {
        lista.addFirst(adicionar);
    }

    public int tamanho() {
        return lista.size();
    }

    public void imprimir() {
        for (int i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
