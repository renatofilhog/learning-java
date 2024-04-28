import classes.*;
import classes.interf.Forma;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primeira questão, percorrer um arraylist de strings:");
        List<String> lista = new ArrayList<>();
        lista.add("Primeira String");
        lista.add("Segunda String");
        lista.add("Terceira String");
        lista.add("Quarta String");
        lista.add("Quinta String");
        lista.add("Sexta String");

        System.out.println("Percorrendo a lista: ");
        for(String s : lista) {
            System.out.println(s);
        }

        Animal toto = new Cachorro();

        Produto produtoA = new Produto();
        produtoA.setNome("Computador");
        produtoA.setPreco(2000);

        Produto produtoB = new Produto();
        produtoB.setNome("Mouse");
        produtoB.setPreco(40);

        Produto produtoC = new Produto();
        produtoC.setNome("Teclado");
        produtoC.setPreco(110);

        Produto produtoD = new Produto();
        produtoB.setNome("Monitor");
        produtoB.setPreco(600);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produtoA);
        produtoList.add(produtoB);
        produtoList.add(produtoC);
        produtoList.add(produtoD);

        double allProductPrices = 0;
        for (Produto produto: produtoList) {
            allProductPrices += produto.getPreco();
        }
        System.out.println("Média dos produtos: "+ allProductPrices/produtoList.size());

        List<Forma> formaList = new ArrayList<>();
        formaList.add(new Circulo(10));
        formaList.add(new Circulo(40));
        formaList.add(new Circulo(9.2));
        formaList.add(new Quadrado(4));
        formaList.add(new Quadrado(12.5));
        formaList.add(new Quadrado(8.8));

        for (Forma forma: formaList) {
            String nome;
            if (forma instanceof Quadrado) {
                nome = "quadrado";
            } else {
                nome = "circulo";
            }
            System.out.println("Mostrando a área do: "+nome+": ");
            System.out.println(forma.calcularArea() + " cm");
        }

        System.out.print("Lista de contas: ");
        List<ContaBancaria> contaBancariaList = new ArrayList<>();
        contaBancariaList.add(new ContaBancaria("001", 200));
        contaBancariaList.add(new ContaBancaria("002", 500));
        contaBancariaList.add(new ContaBancaria("003", 100));
        contaBancariaList.add(new ContaBancaria("004", 600));
        contaBancariaList.add(new ContaBancaria("005", 900));
        contaBancariaList.add(new ContaBancaria("006", 800));
        contaBancariaList.add(new ContaBancaria("007", 1200));
        contaBancariaList.add(new ContaBancaria("008", 2200));
        contaBancariaList.add(new ContaBancaria("009", 2400));
        contaBancariaList.add(new ContaBancaria("010", 300));
        System.out.println(contaBancariaList);
        ContaBancaria contaMaiorSaldo = contaBancariaList.getFirst();
        for (ContaBancaria contaBancaria: contaBancariaList) {
            if (contaBancaria.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = contaBancaria;
            }
        }

        System.out.println("Conta de maior saldo é a de número: "+contaMaiorSaldo.getNumeroConta());

    }
}