public class PatoAdapter implements Ave{
    private Pato pato;
    
    public PatoAdapter(Pato pato) {
        this.pato = pato;
    }

    public void voar() {
        pato.voar();
    }

    public void emitirSom() {
        pato.grasnar();
    }
}
