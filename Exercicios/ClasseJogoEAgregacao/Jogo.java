package ClasseJogoEAgregacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {
   private Jogador id;
   private Jogador nome;
   private Jogador posicao;

   private Pecas cor;
   private Pecas pecaEscolhida;
   private Tabuleiro quantidadeDeCasas;
   private  int numeroDeCasas = 0;
   private String guardarJogadorAleatorio;
   private int casasRestantes;
    int contador = 1;
    int guardarValor =0;
    int resultadoDavolta;

   private List<Jogador> listaDeJogadores = new ArrayList<>();
    Random random = new Random();

   public void adicionarJogadores(int id, String nome, String pecaEscolhida, String cor, int posicao){
       Pecas peca = new Pecas(pecaEscolhida, cor);
       Jogador jogadores = new Jogador(id,nome, peca, peca, posicao);
       listaDeJogadores.add(jogadores);
       System.out.printf("Jogador adicionado :" + jogadores.getId() + " - " + jogadores.getNome()+ ", peça escolhida: "
               + peca.getPecaEscolhida() + ", da cor : " + peca.getCor() + "\n");
   }


   public void escolherJogadorParaIniciar(){

       int indiceAleatorio = random.nextInt(listaDeJogadores.size());
      Jogador  jogadorAleatorio = listaDeJogadores.get(indiceAleatorio);
      this.guardarJogadorAleatorio = String.valueOf(jogadorAleatorio);

           System.out.printf("Jogador selecionado para iniciar o jogo é: " + jogadorAleatorio.getNome()+ "\n");
   }
   public int  jogarODado(){
       this.numeroDeCasas= random.nextInt(1,6);

       System.out.println("Jogou o dado - "+ this.numeroDeCasas);
       System.out.println("andou : " + this.numeroDeCasas + " casas\n");
       return this.numeroDeCasas;
   }
   public void numeroDeCasasRestantes(){
       Tabuleiro tabuleiro = new Tabuleiro(10);
       this.casasRestantes = tabuleiro.getQuantidadeDeCasas() - this.numeroDeCasas ;

       System.out.println("Restam " + this.casasRestantes + " casas para terminar o tabuleiro");

   }
   public void Rodada() {
       boolean alguemGanhou = false;
       for (int j = 0; j < 10; j++) {
           System.out.println("RODADA : " + contador);
           System.out.println("================================");
           contador++;
           for (int i = 0; i < listaDeJogadores.size(); i++) {
               Jogador jogadorAtual = listaDeJogadores.get(i);
               System.out.println(jogadorAtual.getNome());
               int resultadoDado = jogarODado();
               jogadorAtual.setPosicao(jogadorAtual.getPosicao() + resultadoDado);

               System.out.println("Posição: " + jogadorAtual.getPosicao());
               System.out.println("============================");

            if (jogadorAtual.getPosicao() >= 10 ){
                System.out.printf("Jogador "+ jogadorAtual.getNome() + "GANHOU !!");
                alguemGanhou = true;
                break;
            }
           } if(alguemGanhou){
               break;
           }
       }
   }


}
