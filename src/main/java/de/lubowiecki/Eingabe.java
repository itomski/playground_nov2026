package de.lubowiecki;

import java.util.Scanner;

public class Eingabe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // System.out = Ausgabestrom -> Console
        // System.in = Eingabestrom -> Console

        System.out.print("Zahl 1: "); // Ausgabe OHNE Zeilenumbruch
        int zahl1 = input.nextInt(); // Wartet auf die Eingabe
        System.out.println("Das ist deine Eingabe: " + zahl1); // Ausgabe mit Zeilenumbruch

    }
}
