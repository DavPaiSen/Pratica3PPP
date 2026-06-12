package ex2;

public class CalculadoraAdapter implements Calculadora{
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    public int somar(int x, int y) {
        String soma = calculadoraBinaria.somar(Integer.toBinaryString(x), Integer.toBinaryString(y));
        return Integer.parseInt(soma, 2); 
    }

    public int subtrair(int x, int y) {
        String subtracao = calculadoraBinaria.subtrair(Integer.toBinaryString(x), Integer.toBinaryString(y));
        return Integer.parseInt(subtracao, 2);
    }

    public int multiplicar(int x, int y) {
        return x*y;
    }
}
