

    public class VerificacaoDeNotaSimplificada {
        public static void main(String[] args) {
            var nota1 = 7;
            var nota2 = 5;
            int mediaFinal = (nota1 + nota2) / 2;

            if (mediaFinal >= 6) {
            System.out.println("Aprovado!");
        } else {
        	System.out.println("Reprovado!");
        }
    }
}