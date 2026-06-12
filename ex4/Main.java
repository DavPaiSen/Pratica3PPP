package ex4;

//CLIENTE

public class Main {
    public static void main(String[] args) {
        ListaInteiros listaInteiros = new ListaInteiros();
        ListaInteirosProxy proxy = new ListaInteirosProxy(listaInteiros);
        for (int i = -10; i < 11; i++) {
            proxy.adicionaFinal(i);
        }
        proxy.imprimir(); //nao adicionou os elementos negativos na lista
    }
}
