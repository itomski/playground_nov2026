package de.lubowiecki.collections;

import java.util.HashSet;
import java.util.Set;

public class Mengen {

    public static void main(String[] args) {

        Set<String> namen = new HashSet<>();
        System.out.println(namen.add("Peter"));
        System.out.println(namen.add("Bruce"));
        System.out.println(namen.add("Carol"));
        System.out.println(namen.add("Peter")); // Duplikate sind nicht erlaubt

        System.out.println(namen);

        for(String name : namen) {
            System.out.println(name);
        }

        // Set nutzt keinen Index
        // for-Schleife mit einem Zähler ist bei Sets NICHT verwendbar

        System.out.println();

        namen.forEach(System.out::println);

        if(namen.contains("Carol")) {
            System.out.println("gefunden");
        }

        namen.remove("Peter");
        System.out.println(namen);
    }
}
