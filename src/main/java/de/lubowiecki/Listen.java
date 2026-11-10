package de.lubowiecki;

import java.util.ArrayList;

public class Listen {

    public static void main(String[] args) {

        // Generischer Typ ist IMMER komplex
        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(10); // Fügt am Ende der Liste etwas ein
        zahlen.add(15);
        zahlen.add(-7);
        zahlen.add(105);
        zahlen.add(1);

        System.out.println(zahlen.size()); // Anzahl der Elemente
        System.out.println(zahlen);

        System.out.println();
        zahlen.remove(2);
        System.out.println(zahlen.size());
        System.out.println(zahlen);

        System.out.println();
        zahlen.add(2, 20); // Fügt an gewünschter Position ein
        System.out.println(zahlen.size());
        System.out.println(zahlen);

        System.out.println();

        for(int i = 0; i < zahlen.size(); i++) {
            System.out.println(zahlen.get(i)); // Fragt ein Element an gewünschter Position ab
        }

        System.out.println();

        // In i wird der aktuelle Wert abgelegt
        for(int i : zahlen) {
            System.out.println(i);
        }

        System.out.println();

        ArrayList<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        System.out.println(namen);
    }
}
