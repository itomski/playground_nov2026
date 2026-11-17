package de.lubowiecki.aufgaben.loesungen.a28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final Kaffeemaschine kaffeemaschine = new Kaffeemaschine();

        app: while(true) {
            System.out.print("Auswahl: ");

            try {
                switch (scanner.next().substring(0, 1).trim().toUpperCase()) {
                    case "A" -> {
                        if (kaffeemaschine.kaffeeZubereiten())
                            System.out.println("Kaffee fertig");
                    }
                    case "B" -> {
                        if (kaffeemaschine.kaffeeMitMilchZubereiten())
                            System.out.println("Kaffee mit Milch fertig");
                    }
                    case "Q" -> {
                        break app;
                    }
                    default -> System.out.println("Falsche auswahl");
                }
            }
            catch (ZuWenigWasser e) {
                System.out.println("Wasser nachfüllen");
            }
            catch (ZuWenigKaffee e) {
                System.out.println("Kaffee nachfüllen");
            }
            catch (ZuWenigMilch e) {
                System.out.println("Milch nachfüllen");
            }
        }
    }
}
