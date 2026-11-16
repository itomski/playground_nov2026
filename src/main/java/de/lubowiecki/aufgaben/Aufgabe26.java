package de.lubowiecki.aufgaben;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe26 {

    /*
    Schreibe eine Programm, das Eingaben (Zahlen) von der Console entgegennimmt.
    Solange eine Falscheeingabe erfolgt, soll der User einen Hinweis bekommen und zur Neueingabe aufgefordert werden
    Ist die Eingabe richtig, dann soll eine Ausgabe erfolgen und das Programm beendet werden
     */
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        int zahl = zahlEinlesen("Zahl");
        System.out.println(zahl);
    }

    private static int zahlEinlesen(String label) {
        int zahl;
        while(true) {
            try {
                System.out.print(label + ": ");
                zahl = scanner.nextInt();
                System.out.println("Ausgabe: " + zahl);
                break; // bricht die while-Schleife ab
            }
            catch(InputMismatchException e) {
                scanner.next(); // Puffer leeren
                System.out.println("Falsche Eingabe");
            }
        }
        return zahl;
    }
}
