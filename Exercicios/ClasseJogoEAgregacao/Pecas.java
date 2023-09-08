package ClasseJogoEAgregacao;

public class Pecas {
    private String pecaEscolhida;
    private String cor;

    public Pecas(String pecaEscolhida, String cor){
        this.pecaEscolhida = pecaEscolhida;
        this.cor = cor;

    }

    public String getPecaEscolhida() {
        return pecaEscolhida;
    }

    public void setPecaEscolhida(String pecaEscolhida) {
        this.pecaEscolhida = pecaEscolhida;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
