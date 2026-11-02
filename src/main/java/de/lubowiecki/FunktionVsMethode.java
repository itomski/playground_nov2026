package de.lubowiecki;

public class FunktionVsMethode {

    public static void main(String[] args) {

        String name = "Peter";
        System.out.println("Hallo " + name);

        greet("Peter"); // Aufruf
        greet("Bruce"); // Aufruf
        greet("Toni"); // Aufruf
        greet("Natasha"); // Aufruf

        add(10, 15);
        add(11, 7);
        add(10, 2);
        add(18, 215);
        add(-22, 163);
    }

    // Methode
    // In Java gibt es NUR Methoden
    // Methode gehört zu einer Klasse
    // Funktion ist frei definiert
    // In Java gibt es KEINE Funktionen
    // void = Die Methode gibt NICHTS zurück
    private static void greet(String name) { // Deklaration
        System.out.println("Hallo " + name);
    }

    private static void add(int a, int b) { // Deklaration
        System.out.println("Addition: " + (a + b));
    }
}
