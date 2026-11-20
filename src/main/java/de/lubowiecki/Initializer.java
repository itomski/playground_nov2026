package de.lubowiecki;

import java.time.LocalTime;

public class Initializer {

    public static void main(String[] args) {

        Kunde k1 = new Kunde();
        Kunde k2 = new Kunde();


//        int a; // Deklaration ist für den Scope relevant
//
//        {
//            var i = 10;
//            a = 100;
//        }
//        // i ist out of scope
//        System.out.println(a);
    }
}

class Kunde {

    private static final double PI;

    private String vorname = "Unbekannt";
    private String nachname;
    private int j = 200;

    // Statischer Initializer: Wird einmalig beim Laden der Klasse ausgeführt
    static {
        System.out.println("STATIC INITIALIZER");
        // Die einzige Möglichkeit dynamisch statische Konstanten zu initialisieren
        PI = 3.14;
    }

    // Instanz-Initializer
    {
        System.out.println("INITIALIZER1");
        j = 500; // Instanzvariable
        int j = 100; // Lokale Variable: Ist im Initializer deklariert worden
        // Lokale Variablen können Instanz- und Klassenvariablen überlagern

        if(LocalTime.now().isBefore(LocalTime.NOON)) {
            // Verwendung einer Instanzvariable
            nachname = "Unbekannt1";
        }
        else {
            nachname = "Unbekannt2";
        }
    }

    {
        System.out.println("INITIALIZER2");
    }

    public Kunde() {
        // --- Ausführung des INITIALIZERS
        System.out.println("KONSTRUKTOR");
    }
}