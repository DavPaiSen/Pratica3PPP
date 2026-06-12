package ex4;

//PROXY

public class ListaInteirosProxy implements Lista{ //supondo que eu nao quero deixar elementos negativos entrarem na minha lista, esse proxy age como um firewall bloqueando tais elementos
    private ListaInteiros lista;

    public ListaInteirosProxy(ListaInteiros lista) {
        this.lista = lista;
    }

    public int pega(int i) {
        return lista.pega(i);
    }

    public void adicionaFinal(int adicionar) {
        if (adicionar >= 0) {
            lista.adicionaFinal(adicionar);
        }
    }

    public void adicionaInicio(int adicionar) {
        if (adicionar >= 0) {
            lista.adicionaInicio(adicionar);
        }
    }

    public int tamanho() {
        return lista.tamanho();
    }

    public void imprimir() {
        lista.imprimir();
    }    
}
