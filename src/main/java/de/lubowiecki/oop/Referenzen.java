package de.lubowiecki.oop;

import de.lubowiecki.Person;

import java.util.ArrayList;
import java.util.List;

public class Referenzen {

    public static void main(String[] args) {

        // Referenztyp und Objekttyp sind gleich
        String s = new String("Hallo");

        // Referenztyp = List
        // Objekttyp = ArrayList
        List<String> namen = new ArrayList<>();

        // Referenztyp kann mit jeder Kindklasse des Referenztyps belegt werden
        Object o = "Moin";
        o = 123;
        o = new int[10];
        o = new ArrayList<>();
        o = new Person();

        // Der Referenztyp entscheidet, was die genutzt werden kann
        // Über eine Referenz vom Typ Object kann man nur Methoden sehen, die in Object deklariert sind
        // Die Methoden werden aber auf dem euchten Obejttyp ausgeführt
        System.out.println(o.toString());

        // Prüft den Objekttyp auf dem Heap
        if(o instanceof Person)
            System.out.println("Ist eine Person");

        if(o instanceof ArrayList)
            System.out.println("Ist eine ArrayList");

        System.out.println();

        // RAW-Typ - Ohne generischen Typ, verwenden wir Object
        List werte = new ArrayList();
        werte.add(100); // Autoboxing von int auf Integer
        werte.add("Hi");
        werte.add(10.5); // Autoboxing von double auf Double
        werte.add('c'); // Autoboxing von char auf Character

        for(Object o1 : werte) {
            // Besondere Methoden der Datentypen sind hier nicht verfügbar
            System.out.println(o1);

            if(o1 instanceof String) {
                String s1 = (String) o1; // Passt der Typ nicht zum Cast gibt es eine ClassCastException
                // Nach dem Casting stehen wieder alle Methoden des Typs zur Verfügung
                System.out.println(s1.toUpperCase());
            }
        }

    }
}
