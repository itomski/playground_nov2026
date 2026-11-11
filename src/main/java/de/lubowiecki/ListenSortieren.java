package de.lubowiecki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListenSortieren {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(List.of(5, 7, 22, 18, 1, -5, 19, 1));
        System.out.println(zahlen);
        // Collections ist eine Klasse mit statischen Hilfsmethoden für Datenstrukturen
        Collections.sort(zahlen); // Sortiert die Liste
        System.out.println(zahlen);

        System.out.println();
        List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha", "Toni", "Scott"));
        System.out.println(namen);
        Collections.sort(namen);
        System.out.println(namen);

        /*
        Baue eine Liste von Character (chars) und sortiere sie
        Baue eine Liste von 3 Person-Objekten und sortiere sie
        */

        List<Character> zeichen = new ArrayList<>(List.of('C', 'B', 'G', 'X', 'A'));
        Collections.sort(zeichen);
        System.out.println(zeichen);

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Steve", "Rogers", 85));
        personen.add(new Person("Peter", "Parker", 25));
        personen.add(new Person("Bruce", "Banner", 42));
        Collections.sort(personen);
        System.out.println(personen);


    }
}
