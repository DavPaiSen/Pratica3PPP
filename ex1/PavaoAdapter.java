public class PavaoAdapter implements Ave{
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    public void emitirSom() {
        pavao.cantar();
    }

    public void voar() {
        //nao faz nada, pavao nao voa
    }
}
