

public class Aplicacao {

            public static void main(String[] args) {

                Carro carro1 = new Carro();
                Carro carro2 = new Carro("Toyota", "Corolla");
                Carro carro3 = new Carro("BYD", "Song", 2026);

                carro1.exibirDetalhes();
                carro2.exibirDetalhes();
                carro3.exibirDetalhes();

            }

        }
        