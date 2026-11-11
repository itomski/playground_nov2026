package de.lubowiecki.aufgaben.loesungen.a13;

import java.util.Scanner;

public class App {

    private final ProduktRepository REPO = new ProduktRepository();

    private static final String MENU = """
                                        
                                        1: Neues Produkt
                                        2: Produktliste anzeigen
                                        3: Hilfe anzeigen
                                        4: Programm verlassen""";

    private final Scanner SCANNER = new Scanner(System.in);

    private static final String ZEILEN_VORLAGE = "| %-15s | %-20s | %10s | %4s | %8s |\n";

    public static void main(String[] args) {
        new App().start(); // App wird instanziert und die Instanzmethode start aufgerufen
    }

    private void start() {

        System.out.println(MENU);
        app: while(true) {
            System.out.print("\nAuswahl: ");
            int eingabe = SCANNER.nextInt(); // TODO: Validieren

            switch(eingabe) {
                case 1 -> produktHinzufuegen();
                case 2 -> produkteAusgaben();
                case 3 -> System.out.println(MENU);
                case 4 -> {
                    break app;
                }
                default -> System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println("Programmende");
    }

    private void produktHinzufuegen() {
        Produkt p1 = new Produkt();

        SCANNER.nextLine(); // fix - Leert den Buffer des Eingabestroms

        System.out.print("Name: ");
        p1.setName(SCANNER.nextLine());

        System.out.print("Beschreibung: ");
        p1.setBeschreibung(SCANNER.nextLine());

        System.out.print("Menge: ");
        p1.setMenge(SCANNER.nextInt());

        System.out.print("Preis: ");
        p1.setPreis(SCANNER.nextDouble());

        REPO.hinzufuegen(p1);
    }

    private void produkteAusgaben() {
        System.out.println("\nProduktliste");
        for(Produkt produkt : REPO.alleAbfragen()) {
//            if(produkt != null)
                System.out.printf(ZEILEN_VORLAGE,
                        produkt.getName(),
                        produkt.getBeschreibung(),
                        produkt.getAufgenommenAm(),
                        produkt.getMenge(),
                        produkt.getPreis());
        }
    }
}
