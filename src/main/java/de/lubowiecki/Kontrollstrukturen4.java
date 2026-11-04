package de.lubowiecki;

import java.util.Scanner;

public class Kontrollstrukturen4 {

    public static void main(String[] args) {

        boolean exit = false;

        Scanner scanner = new Scanner(System.in);

        while(!exit) {

            System.out.println("#");

            System.out.print("Weiter: ");
            String weiter = scanner.next();

            if(weiter.toLowerCase().equals("ja")) { // equals vergleicht den Inhalt der Zeichenkette
                System.out.println("OK");
            }
            else {
                System.out.println("Ende");
                exit = true;
            }
        }

        System.out.println("Programm wurde gestoppt");
    }
}
