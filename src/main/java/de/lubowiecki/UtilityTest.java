package de.lubowiecki;

import java.util.Arrays;
import java.util.Objects;

public class UtilityTest {

    public static void main(String[] args) {

        // Hilfsklassen
        // Bieten statische Methoden und Konstanten an

        Pkw p1 = new Pkw();
        p1.setKennzeichen("HH:AB123");
        p1.setBaujahr(2016);
        p1.setMarke("VW");
        p1.setModell("Polo");
        p1 = null;

        System.out.println(p1);
        System.out.println(Objects.toString(p1, "Nicht definiert!"));

        // Konstruktor der Util-Klassen sollte privat sein - kann nicht verwendet werden
        // d.h. Util-Klassen werden nicht instanziert
        // Objects util1 = new Objects(); // Error

        // Arrays, Collections, Objects, FXCollections, Math

        int[] arr1 = new int[100];
        Arrays.fill(arr1, 10); // Füllt das Arrays mit dem neuen default-Wert
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[100];
        Arrays.fill(arr2, 10);
        arr2[15] = 100;
        System.out.println(arr1 == arr2); // Ist es das gleiche Objekt auf dem Heap?
        System.out.println(arr1.equals(arr2)); // Von Object geerbt
        System.out.println(Arrays.equals(arr1, arr2)); // Hat es den gleichen Inhalt?

        System.out.println();

        arr2 = new int[]{7, 22, 100, 8, -10, 18, -8, 125};
        // Vor binarySearch muss die Sammlung sortiert sein
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int idx = Arrays.binarySearch(arr2, 200);
        System.out.println(idx);

        arr2 = Arrays.copyOf(arr2, 20); // Erzeugt eine vergrößerte Kopie
        System.out.println(Arrays.toString(arr2));

        System.out.println();

        // LIFO = last in, first out -> Stack
        // FIFO = first in, first out -> Warteschlange/Queue

        // Collections - Utility-Klasse für Datenstrukturen/Collections

        System.out.println(Math.PI);
        System.out.println(Math.pow(5,2));
        System.out.println(Math.sqrt(25));
    }
}
