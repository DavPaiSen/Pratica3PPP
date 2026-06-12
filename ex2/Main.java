package ex2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadoraCompleta = new CalculadoraAdapter(new CalculadoraBinaria());
        System.out.println("1 + 1 = " + calculadoraCompleta.somar(1, 1));
        System.out.println("1 - 1 = " + calculadoraCompleta.subtrair(1, 1));
        System.out.println("2 X 2 = " + calculadoraCompleta.multiplicar(2, 2));
    }
}
