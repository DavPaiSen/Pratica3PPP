package ex2;

public class CalculadoraBinaria {
    String somar (String x, String y) {
        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);
        return Integer.toBinaryString(n1 + n2);
    }

    String subtrair (String x, String y) {
        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);
        return Integer.toBinaryString(n1 - n2);
    }
}
