package de.lubowiecki;

import java.util.Scanner;

public class Kontrollstrukturen3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Deine Auswahl: ");
        char auswahl = scanner.next() // String von der Console einlesen
                            .toUpperCase() // In Großbuchstaben
                            .charAt(0); // Erstes Zeichen

        switch (auswahl) {

            case 'A':
                startKundenverwaltung();
                break;

            case 'B':
                System.out.println("Dokumentenverwaltung");
                break;

            case 'C':
                System.out.println("FIBU");
                break;

            default: // Wenn keine der anderen Optionen ausgewählt ist
                System.out.println("Falsche Auswahl!");
        }

        System.out.println("----------");

        switch (auswahl) { // Auf breaks wird verzichtet. Nach jedem case erfolgt automatisch break
            case 'A' -> startKundenverwaltung();
            case 'B' -> System.out.println("Dokumentenverwaltung");
            case 'C' -> System.out.println("FIBU");
            default -> System.out.println("Falsche Auswahl!");
        }

        System.out.println("----------");

        String wochentag = "Xa";

        switch(wochentag.toLowerCase()) {
            case "mo":
                System.out.println("Montag");
            case "di":
                System.out.println("Dienstag");
            case "mi":
                System.out.println("Mittwoch");
            case "do":
                System.out.println("Donnerstag");
            case "fr":
                System.out.println("Freitag");
            case "sa":
            case "so":
                System.out.println("Wochenende");
        }

        System.out.println("----------");

        wochentag = "mo";
        String tag = switch(wochentag.toLowerCase()) { // Mit Rückgabewert
                            case "mo" -> "Montag";
                            case "di" -> "Dienstag";
                            case "mi" -> "Mittwoch";
                            case "do" -> "Donnerstag";
                            case "fr" -> "Freitag";
                            case "sa", "so" -> "Wochenende";
                            default -> "Flasche Auswahl";
                        };

        System.out.println(tag);

    }

    static void startKundenverwaltung() {
        System.out.println("Kundenverwaltung");
        //... weiterer Sourcecode
    }

}
