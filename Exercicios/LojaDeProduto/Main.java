package LojaDeProduto;

import java.util.ArrayList;
import java.util.List;

/*/Classe Loja e Produtos:Crie uma classe Loja que mantenha um inventário de produtos.
Cada produto deve ser uma instância de uma classe Produto com atributos como nome,
preço e quantidade em estoque. Implemente métodos para adicionar produtos ao estoque,
vender produtos e verificar o estoque disponível.*/
public class Main {
    public static void main(String[] args) {

        List<Produto>listaDeProdutos = new ArrayList<>();
        Loja loja = new Loja();

        loja.adicionarproduto(listaDeProdutos,1,"dinossauro azul",10,5);
        loja.adicionarproduto(listaDeProdutos,2,"dinossauro rosa",13,2);
        loja.adicionarproduto(listaDeProdutos,3,"dinossauro verde",12,2);

        loja.verificarProduto(listaDeProdutos,"Barbie");

        loja.venderProduto(listaDeProdutos,"dinossauro azul",1);

    }
}
