package de.lubowiecki.tasks;

import java.util.Scanner;

public class CliController {

    private final Scanner scanner = new Scanner(System.in);

    private static final String MAIN = """
                                    # Hauptmenü
                                    1. Liste der Aufgaben
                                    2. Aufgaben verwalten
                                    3. Liste exportieren
                                    0. Programm verlassen
                                    
                                    """;

    private static final String SUB1 = """
                                    # Aufgaben anzeigen
                                    1. Alle
                                    2. Nur offene
                                    3. Nur erledigte
                                    0. Zurück
                                    
                                    """;

    private static final String SUB2 = """
                                    # Aufgaben verwalten
                                    1. Neue Aufgabe erstellen
                                    2. Aufgabe löschen
                                    3. Aufgabe als erledigt markieren
                                    4. Aufgabe als NICHT erledigt markieren
                                    5. Aufgabe bearbeiten
                                    0. Zurück
                                    
                                    """;

    private static final String SUB3 = """
                                    # Aufgaben exportieren
                                    1. CSV
                                    2. JSON
                                    3. EXCEL
                                    0. Zurück
                                    
                                    """;

    private static final String INVALID_INPUT = """
                                                Ungültig!
                                                
                                                """;


    public void start() {

        app: while(true) {
            System.out.println(MAIN);

            int input = getInput();

            switch(input) {
                case 1 -> startSub1();
                case 2 -> startSub2();
                case 3 -> startSub3();
                case 0 -> {
                    System.out.println("Programm wird beendet");
                    break app;
                }
                default -> System.out.println(INVALID_INPUT);
            }
        }
    }

    private void startSub1() {

        app: while(true) {
            System.out.println(SUB1);

            int input = getInput();

            switch(input) {
                case 1 -> System.out.println("Alle werden anzeigt");
                case 2 -> System.out.println("Nur die offenen werden angezeigt");
                case 3 -> System.out.println("Nur die erledigten werden angezeigt");
                case 0 -> {
                    System.out.println("Zurück zum Hauptmenü");
                    break app;
                }
                default -> System.out.println(INVALID_INPUT);
            }
        }
    }

    private void startSub2() {

        app: while(true) {
            System.out.println(SUB2);

            int input = getInput();

            switch(input) {
                case 1 -> System.out.println("Neue Aufgabe wird erstellt");
                case 2 -> System.out.println("Aufgabe wird gelöscht");
                case 3 -> System.out.println("Aufgabe wird als erledigt markiert");
                case 4 -> System.out.println("Aufgabe wird als NICHT erledigt markiert");
                case 5 -> System.out.println("Aufgabe wird bearbeitet");
                case 0 -> {
                    System.out.println("Zurück zum Hauptmenü");
                    break app;
                }
                default -> System.out.println(INVALID_INPUT);
            }
        }
    }

    private void startSub3() {

        app: while(true) {
            System.out.println(SUB3);

            int input = getInput();

            switch(input) {
                case 1 -> System.out.println("CSV Export erfolgt");
                case 2 -> System.out.println("JSON Export erfolgt");
                case 3 -> System.out.println("Excel Export erfolgt");
                case 0 -> {
                    System.out.println("Zurück zum Hauptmenü");
                    break app;
                }
                default -> System.out.println(INVALID_INPUT);
            }
        }
    }

    private int getInput() {
        while(true) {
            System.out.print("Auswahl: ");
            String input = scanner.next().trim();

            try {
                return Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
            }
        }
    }
}
