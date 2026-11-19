package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listen {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add(1, "Natasha");
        namen.remove(0); // An vorgegebener Position entfernen
        namen.remove("Bruce"); // Ein bestimmtes Element entfernen
        namen.set(0, "Scott"); // An vorgegebener Position ersetzen
        namen.add("Toni");
        namen.add("Carol");

        System.out.println(namen);

        System.out.println();

        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        //namen.forEach(e -> System.out.println(e)); // Lambda
        namen.forEach(System.out::println); // Methoden Referenz

        namen = new LinkedList<>(namen); // Ist auch eine Liste
    }
}
