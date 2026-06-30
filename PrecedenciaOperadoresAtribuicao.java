
  


  public class PrecedenciaOperadoresAtribuicao {
	public static void main(String[] args) {

        var numero = 5;

        var resultado1 = ++numero;
        var resultado2 = numero++;
        var resultado3 = --numero;
        var resultado4 = numero--;

        System.out.println("Numero = " + numero);
        System.out.println("Resultado 1 = " + resultado1);
        System.out.println("Resultado 2 = " + resultado2);
        System.out.println("Resultado 3 = " + resultado3);
        System.out.println("Resultado 4 = " + resultado4);
    }
}