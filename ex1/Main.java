import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ave> lista = new ArrayList<Ave>();
        lista.add(new PavaoAdapter(new PavaoAzul()));
        lista.add(new PatoAdapter(new PatoDomestico()));

        for (Ave ave : lista) {
            ave.emitirSom();
            ave.voar();
        }
    }
}
