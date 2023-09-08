package LojaDeProduto;

public class Produto {
    private  int id;
    private String nome;
    private int ProdutoDisponivel;

    private float preco;

    public Produto(int id, String nome, float preco, int quantidadeDeCompra){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.ProdutoDisponivel = quantidadeDeCompra;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public int getProdutoDisponivel() {
        return ProdutoDisponivel;
    }

    public void setProdutoDisponivel(int produtoDisponivel) {
        this.ProdutoDisponivel = produtoDisponivel;
    }
}
