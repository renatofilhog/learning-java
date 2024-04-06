import classes.Produto;
import classes.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setNome("Iphone 11");
        produto1.setPreco(2300);
        produto1.setQuantidade(20);
        produtos.add(produto1);

        Produto produto2 = new Produto();
        produto2.setNome("Xiaomi Mi 9");
        produto2.setPreco(400);
        produto2.setQuantidade(2);
        produtos.add(produto2);

        System.out.println("Tamanho da lista: "+produtos.size());
        System.out.println("Nome produto 1: " + produtos.get(0).getNome());

        System.out.println("Lista de produtos até agora: ");
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }

        produtos.add(new Produto("Dell Vostro",5500, 5));
        produtos.add(new ProdutoPerecivel("Arroz",5.99,20,"01/05/2024"));
        System.out.println("Lista de produtos até agora: ");
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }



    }
}