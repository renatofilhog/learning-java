import classes.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<Integer>();
        numerosInteiros.add(5); numerosInteiros.add(1); numerosInteiros.add(3);
        numerosInteiros.add(4); numerosInteiros.add(6); numerosInteiros.add(8);
        System.out.println("Imprimindo uma lista desordernada!");
        for (int i: numerosInteiros) {
            System.out.print("["+i+"]");
        }
        Collections.sort(numerosInteiros);
        System.out.println("\nImprimindo uma lista ordernada!");
        for (int i: numerosInteiros) {
            System.out.print("["+i+"]");
        }

        List<Titulo> titulos = new ArrayList<Titulo>();
        titulos.add(new Titulo("Harry Potter")); titulos.add(new Titulo("Percy Jackson")); titulos.add(new Titulo("Game of Thrones"));
        titulos.add(new Titulo("Katekyo Hitman Reborn!")); titulos.add(new Titulo("American Horror History")); titulos.add(new Titulo("Friends"));
        System.out.println("Lista de títulos: ");
        for (Titulo x: titulos) {
            System.out.print("["+x+"]");
        }

        System.out.println("\nLista de títulos ordenada: ");
        Collections.sort(titulos);
        for (Titulo x: titulos) {
            System.out.print("["+x+"]");
        }
    }
}