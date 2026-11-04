package de.lubowiecki;

import java.util.Scanner;

public class App {

    private static final String KEYS = """
                                        ***********************************************
                                        NEU:    Neuen Kunden anlegen
                                        LISTE:  Zeige alle Kunden
                                        ENDE:   Programm beenden
                                        HILFE:  Möglichkeiten des Programms anzeigen
                                        ***********************************************
                                        """;

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(KEYS);

        app: while(true) {

            System.out.print("Auswahl: ");
            String input = SCANNER.next();

            switch(input.toUpperCase()) {
                case "NEU" -> erfasseKunde();
                case "LISTE" -> zeigeKunden();
                case "ENDE" -> {
                    break app; // Bricht die While-Schleife ab
                }
                case "HILFE" -> System.out.println(KEYS);
                default -> System.out.println("Falsche Auswahl!");
            }
        }
        System.out.println("Programmende");
    }

    private static void zeigeKunden() {
        System.out.println("#");
    }

    private static void erfasseKunde() {
        System.out.println("&");
    }
}
