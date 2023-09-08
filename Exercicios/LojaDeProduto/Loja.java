package LojaDeProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    private String nome;
    private int id;
    private Produto produtos;
    private int quantidadeDeProdutos;
    List<Produto> listaDeProdutos = new ArrayList<>();

    public void adicionarproduto(List<Produto> listaDeproduto, int id, String nome, float preco, int quantidadeDeProdutos) {
        Produto produtos = new Produto(id, nome, preco, quantidadeDeProdutos);
        listaDeproduto.add(produtos);
        System.out.println("Produto adicionado: " + produtos.getNome());

    }

    public void venderProduto(List<Produto> listaDeProdutos, String nomeDoProduto, int quantidadeDeCompra) {
        for (Produto produto : listaDeProdutos) {
            if (nomeDoProduto.equals(produto.getNome())) {
                if(quantidadeDeCompra <= produto.getProdutoDisponivel()){
                    produto.setProdutoDisponivel(produto.getProdutoDisponivel() - quantidadeDeCompra);
                    System.out.printf("Compra realizada com sucesso !!"+
                           "\nRestam ainda : " + produto.getProdutoDisponivel() + " produtos do " +  produto.getNome());
                }else{
                    System.out.printf("Quantidade insuficiente em estoque");
                }
                return;
            }
        }
        System.out.printf("produto nao Encontrado");
    }
    public void verificarProduto (List<Produto> listaDeProdutos, String nomeDoProdutoDePesquisa2) {
        for (Produto produto : listaDeProdutos) {
            if (nomeDoProdutoDePesquisa2.equals(produto.getNome()) && produto.getId() > 0) {
            System.out.printf("produto disponivel !");
            } else if (nomeDoProdutoDePesquisa2.equals(produto.getNome()) && produto.getId() == 0) {
            System.out.printf("produto indisponivel !");
            }
        }

    }
}

