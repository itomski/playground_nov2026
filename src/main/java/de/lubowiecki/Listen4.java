package de.lubowiecki;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listen4 {

    public static void main(String[] args) {

        // Referenztyp ist List (links)
        // Objekttyp ist ArrayList (rechts)
        List<Character> zeichen = new ArrayList<>(List.of('A', 'B', 'C'));
        System.out.println(zeichen);

        zeichen = new LinkedList<>(zeichen); // Wechsel von einer ArrayList auf eine LinkedList
        System.out.println(zeichen);

        zeichen = new ArrayList<>(zeichen); // Wechsel von einer LinkedList auf eine ArrayList
        System.out.println(zeichen);




        // var verwendet den genauen Typ der Klasse als Variablentyp
        // Generischer Typ MUSS angegeben werden, sonst ist es Object
        // var ist nicht hilfreich, da wo Referenztyp und Objekttyp nicht gleich sein sollen
        var andereListe = new ArrayList<>();
    }
}
