package de.lubowiecki.aufgaben;

import java.util.Scanner;

public class Aufgabe2 {

    /*
    Frage zwei Ganzzahlen von der Konsole ab und führe damit die
    4 Grundrechenoperationen aus. Zeige die Ergebnisse an.
    */

    public static void main(String[] args) {

        var eingabe = new Scanner(System.in);

        System.out.print("Zahl 1: ");
        int z1 = eingabe.nextInt();

        System.out.print("Zahl 2: ");
        int z2 = eingabe.nextInt();

        System.out.println("Division: " + z1 / z2);

        System.out.println();

        System.out.print("Zahl 3: ");
        double z3 = eingabe.nextDouble();

        System.out.print("Zahl 4: ");
        double z4 = eingabe.nextDouble();

        System.out.println("Division: " + z3 / z4);
    }
}
