package TerminarMeuBanco;

public class Correntista {
    private String nome;
    private String senha;
    private  int idade;

    public Correntista(String nome, String senha, int idade){
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
