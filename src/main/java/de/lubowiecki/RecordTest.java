package de.lubowiecki;

public class RecordTest {

    public static void main(String[] args) {
        // Das Objekt ist IMMUTABLE d.h. nicht änderbar
        Farbe farbe1 = new Farbe(10, 15, 22);
        System.out.println(farbe1.blau());

        Farbe farbe2 = new Farbe(10, 15, 22);

        System.out.println(farbe1 == farbe2); // Ist es das gleiche Objekt auf dem Heap?

        // equals ist automatisch richtig implementiert
        System.out.println(farbe1.equals(farbe2)); // Hat es den gleichen Zustand der Variablen?

        // toString ist automatisch implementiert
        System.out.println(farbe1);

        // DTO - Data Transfer Object
    }
}

record Farbe(int rot, int gruen, int blau) {}
