package de.lubowiecki.aufgaben;

import java.util.Scanner;

public class Aufgabe27 {

    /*
    Schreibe eine Simulation für Geldeinwurf.
    Der User wird aufgefordert einen Betrag einzuwerfen, den er über die Konsole eingibt.
    Danach wird versucht ein "Produkt" zu kaufen.
    Falls der Betrag noch nicht ausreicht, soll dabei eine CheckedException geworfen werden.
    Der User kann dann mehr Geld einwerfen.
     */


    private static double betrag = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while(true) {
            try {
                einzahlen();
                kaufen();
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void einzahlen() {
        System.out.print("Wieviel willst du einzahlen? ");
        betrag += Double.parseDouble(scanner.next());
    }

    private static void kaufen() throws Exception {
        if(betrag < 5.0) {
            throw new Exception("Zu wenig Geld!");
        }
        else {
            betrag -= 5.0;
            System.out.println("Gekauft!");
        }
    }

}
