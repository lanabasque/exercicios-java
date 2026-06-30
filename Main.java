    public class Main {
        public static void main(String[] args) {
            int nivelDeSatisfacao = 7 ;
            String descricao = switch (nivelDeSatisfacao) {
             case 1 -> "Muito Insatisfeito";
             case 2 -> "Insatisfeito";
             case 3 -> "Neutro";
             case 4 -> "Satisfeito";
             case 5 -> "Muito Satisfeito";
             default -> "Opção inválida (deve estar entre 1 e 5)";
            };
            System.out.println(descricao);
        }
    }