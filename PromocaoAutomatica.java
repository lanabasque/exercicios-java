
public class PromocaoAutomatica {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        char c = 'A';
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5;

        int resultado = a + b;
        long resultadoLong = d + e;
        float resultadoFloat = d * f;
        double resultadoDouble = d * g;

        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado Long: " + resultadoLong);
        System.out.println("Resultado Float: " + resultadoFloat);
        System.out.println("Resultado Double: " + resultadoDouble);
        System.out.println("Valor do char: " + c);
    }
}