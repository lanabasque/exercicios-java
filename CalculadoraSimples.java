

public class CalculadoraSimples {
     public static void main(String[] args) {
       int a  = 10;
       int b = 3;
       int resultadoDaSoma = a + b;
       int resultadoDaSubtracao = a - b;
       int resultadoDaMultiplicacao = a * b;
       double resultadoDaDivisao = (double) a / b;
       int resultadoRestoDaDivisao = a % b;
      
      System.out.println("Soma = " + resultadoDaSoma);
      System.out.println("Subtracao = " + resultadoDaSubtracao);
      System.out.println("Multiplicacao = " + resultadoDaMultiplicacao);
      System.out.println("Divisao = " + resultadoDaDivisao);
      System.out.println("Resto da Divisao = " + resultadoRestoDaDivisao);
 }
}