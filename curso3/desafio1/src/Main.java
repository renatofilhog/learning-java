import classes.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Renato", 25));
        pessoas.add(new Pessoa("Dheizi", 28));
        pessoas.add(new Pessoa("Neusa", 29));
        System.out.println("Tamanho da lista pessoas: " + pessoas.size() + " registros.");
        System.out.println("Primeira pessoa da lista: ");
        System.out.println(pessoas.get(0).toString());
        System.out.println("Todas as pessoas");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}