import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    //nao eh o exemplo mais util pois todas essas listas ja implementam a interface List, mas vamos fingir que cada uma tem um metodo diferente que precisa de um adaptador
    public static void main(String[] args) {
        ArrayList<ListaInteiros> lista = new ArrayList<ListaInteiros>(); //lista de listas
        lista.add(new ArrayListAdapter(new ArrayList<Integer>()));
        lista.add(new LinkedListAdapter(new LinkedList<Integer>()));
        lista.add(new VectorAdapter(new Vector<Integer>()));
        for (ListaInteiros listaInteiro : lista) {
            for (int i = 0; i < 11; i++) {
                listaInteiro.adicionaFinal(i);
            }
            for (int i = -1; i > -11; i--) {
                listaInteiro.adicionaInicio(i);
            }
        }

        for (ListaInteiros listaInteiros : lista) {
            listaInteiros.imprimir();
        }
    }
}
