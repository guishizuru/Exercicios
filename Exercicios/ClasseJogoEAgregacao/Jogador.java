package ClasseJogoEAgregacao;

public class Jogador {

    private int id;
    private String nome;
    private Pecas pecaEscolhida;
    private Pecas cor;
    private int posicao;
    public Jogador(int id, String nome , Pecas pecaEscolhida, Pecas cor, int posicao){
        this.id = id;
        this.nome = nome;
        this.pecaEscolhida = pecaEscolhida;
        this.cor = cor;
        this.posicao = posicao;


    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Pecas getCor() {
        return cor;
    }

    public void setPecaEscolhida(Pecas pecaEscolhida) {
        this.pecaEscolhida = pecaEscolhida;
    }

    public Pecas getPecaEscolhida() {
        return pecaEscolhida;
    }
}
