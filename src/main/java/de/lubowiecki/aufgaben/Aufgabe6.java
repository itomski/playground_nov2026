package de.lubowiecki.aufgaben;

import java.util.Scanner;

public class Aufgabe6 {

    /*
    Schreibe ein Programm, dass nach einer Zahl (Alter) fragt.
    Danach wird die Eingabe geprüft.
    Bei Wert unter 16 kommt die Ausgabe "Zu jung"
    Bei Wert bis inkl. 100 kommt die Ausgabe "passt"
    Bei Wert über 100 kommt die Ausgabe "leider zu spät"
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wie alt bist du?");
        int alter = scanner.nextInt();

        if(alter < 16) {
            System.out.println("zu jung");
        }
        else if(alter > 100) {
            System.out.println("zu spät");
        }
        else {
            System.out.println("passt");
        }

    }
}
