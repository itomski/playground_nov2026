package de.lubowiecki;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {

        char[] chars = {'A', 'C', 'X', '#'};
        chars[3] = 'Z';

        String arrStr = Arrays.toString(chars);
        System.out.println(arrStr);

        System.out.println();

        String[] namen = {"Peter", "Bruce", "Carol", "Toni", "Natasha"};
        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        Person[] kundenListe = new Person[10];
        kundenListe[0] = new Person("Peter", "Parker");
        kundenListe[1] = new Person("Bruce", "Banner");
        kundenListe[2] = new Person("Carol", "Denvers");

        for(Person kunde : kundenListe) {
            if(kunde != null)
                System.out.println(kunde);
        }

        System.out.println();

        char[] cArr1 = {'A', 'B', 'C'}; // Mit einem Array-Literal. Nur bei gleichzeitiger Deklaration und Initialisierung
        char[] cArr2; // Reserviert nur den Namen der Variable, es wird KEIN Array gebaut
        // cArr2 = {'A', 'B', 'C'}; // Nachträglich nicht erlaubt!
        cArr2 = new char[]{'A', 'B', 'C'}; // Ok! Nachträglich nur mit new möglich
        cArr2 = new char[5]; // Auch ok!
        // cArr2 = new char[3]{'A', 'B', 'C'}; // Error! Kombi nicht möglich!

        int[] iArr = new int[10]; // 10 ints
        int[][] iArr2d = new int[10][10]; // 10 x 10 ints

    }
}
