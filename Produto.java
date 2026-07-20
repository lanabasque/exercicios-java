        public class Produto {

            private String nome;
            private double preco;
            private int quantidadeEmEstoque;

            public Produto(String nome, double preco, int quantidadeEmEstoque) {

                this.nome = nome;
                this.preco = preco;
                this.quantidadeEmEstoque = quantidadeEmEstoque;
            }

            public void exibirInformacoes() {

                System.out.println("Nome: " + nome);
                System.out.println("Preco: " + preco);
                System.out.println("Quantidade: " + quantidadeEmEstoque);
            }

        }

        