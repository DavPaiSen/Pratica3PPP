import java.util.Vector;

public class VectorAdapter implements ListaInteiros{
    private Vector<Integer> vetor;
    
    public VectorAdapter(Vector<Integer> vetor) {
        this.vetor = vetor;
    }

    public int pega(int i) {
        return vetor.get(i);
    }

    public void adicionaFinal(int adicionar) {
        vetor.addLast(adicionar);
    }

    public void adicionaInicio(int adicionar) {
        vetor.addFirst(adicionar);

    }
    public int tamanho() {
        return vetor.size();
    }

    public void imprimir() {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
