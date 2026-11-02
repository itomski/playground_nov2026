package de.lubowiecki;

import java.util.Date;

public class Struktur {

    public static /* Das ist ja was */ void main(String[] /* Was ist das? */ args) {

        // Klasse = Bauplan = Beschreibt, welche Informationen und Fähigkeiten jedes Objekt später haben wird
        // Instanz/Objekt = Ein konkreter Vertreter einer Klasse
        Person p1 = new Person();
        Person p2 = new Person();
        p1.vorname = "Peter";
        p1.nachname = "Parker";
        p2.vorname = "Bruce";
        p2.nachname = "Banner";

        Date heute = new Date(); // End-of-Line
        System.out.println(heute);

        /* Multiline...
        Das ist das
        Haus von Nikigraus
        */

        add(10, 22);

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
