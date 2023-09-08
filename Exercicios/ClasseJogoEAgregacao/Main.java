package ClasseJogoEAgregacao;

/*Classe Jogo e Agregação: Crie uma classe Jogo que represente um jogo de tabuleiro.
A classe deve conter objetos de outras classes, como Tabuleiro, Jogadores e Peças.
Use a agregação para modelar essas relações.*/
public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        jogo.adicionarJogadores(1,"Joao","Cavalo","azul",0);
        jogo.adicionarJogadores(2,"Bruno","Asno","verde",0);
        jogo.adicionarJogadores(3,"Roger","Mula","vermelho",0);
        jogo.adicionarJogadores(4,"Miguel","Burro","cinza",0);

        jogo.Rodada();
    }
}
// TABULEIRO DE 10 CASAS;