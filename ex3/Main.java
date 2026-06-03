import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ListaInteiros> lista = new ArrayList<ListaInteiros>();
        lista.add(new ArrayListAdapter(new ArrayList<Integer>()));
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
