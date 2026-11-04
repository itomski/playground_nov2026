package de.lubowiecki;

import java.util.Date; // nur die Klasse Date wird importiert
import java.io.*; // Alle Klassn aus dem Package io werden importiert

import static java.lang.Math.E;

public class Struktur {

    public static /* Das ist ja was */ void main(String[] /* Was ist das? */ args) {

        // Klasse = Bauplan = Beschreibt, welche Informationen und Fähigkeiten jedes Objekt später haben wird
        // Instanz/Objekt = Ein konkreter Vertreter einer Klasse
        Person p1 = new Person();
        Person p2 = new Person();
        //p1.vorname = "Peter";
        p1.setVorname("Peter");
        //p1.nachname = "Parker";
        p1.setNachname("Parker");
        //p2.vorname = "Bruce";
        p2.setVorname("Bruce");
        //p2.nachname = "Banner";
        p2.setNachname("Banner");

        Date heute = new Date(); // End-of-Line
        System.out.println(heute);

        /* Multiline...
        Das ist das
        Haus von Nikigraus
        */

        add(10, 22);

        System.out.println(Math.PI);
        System.out.println(Math.pow(5, 2));
        //System.out.println(Math.E);
        System.out.println(E); // Möglich weil E statisch importiert wurde

    }

    /**
     * Addiert zwei Zahlen und gibt die Summe zurück
     * @param a Linker Operand
     * @param b Rechter Operand
     * @return Summe aus a und b
     */
    public static int add(int a, int b) {
        return a + b;
    }
}

//class Thing {
//
//}
