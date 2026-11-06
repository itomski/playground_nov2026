package de.lubowiecki.aufgaben.loesungen.a11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static final int REIHEN = 5;
    private static final int ZELLEN = 5;

    private static final int ANZAHL_PILZE = 10;
    private static final int ANZAHL_VERSUCHE = 10;

    private static final int[][] SPIELFELD = new int[REIHEN][ZELLEN];

    private static final Random RAND = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {

        boolean wiederholen = false;

        do {
            setzePilze();

            int gefunden = suchePilze();
            System.out.println("Ende!");
            System.out.println("Du hast " + gefunden + " Pilze gefunden");
            System.out.println();

            zeigeSpielfeld(SPIELFELD);

            System.out.print("Noch einmal? ");
            if(SCANNER.next().toLowerCase().equals("ja")){
                wiederholen = true;
            }
            else {
                wiederholen = false;
            }

        }
        while(wiederholen);
    }

    /**
     * Startet das Suche nach Pilzen
     * @return Anzahl gefundener Pilze
     */
    private static int suchePilze() {
        int gefunden = 0;

        for(int i = 0; i < ANZAHL_VERSUCHE; i++) {
            System.out.println("Wo soll gesucht werden?");
            System.out.print("x: ");
            // TODO: Validierung
            int x = SCANNER.nextInt();
            System.out.print("y: ");
            int y = SCANNER.nextInt();
            if(SPIELFELD[x][y] == 1) {
                System.out.println("Gefunden!");
                SPIELFELD[x][y] = 2; // Als gefunden markieren
                gefunden++;
            }
            else if(SPIELFELD[x][y] == 2) {
                System.out.println("Diesen Pilz hast du schon gefunden!");
            }
            else if(SPIELFELD[x][y] == 3) {
                System.out.println("Hier hast du schon gesucht!");
            }
            else {
                System.out.println("Leider nichts gefunden!");
                SPIELFELD[x][y] = 3;
            }
        }
        return gefunden;
    }

    /**
     * Gibt das Spielfeld auf der Konsole aus
     */
    private static void zeigeSpielfeld(int[][] spielfeld) {
        for(int[] reihe : spielfeld) {
            for(int zelle : reihe) {
                if(zelle == 1) {
                    System.out.print("\uD83C\uDF44 ");
                }
                else {
                    System.out.print(zelle + "  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Setzt die vorgegebene Anzahl an Pilzen auf dem Spielfeld
     */
    private static void setzePilze() {
        spielfeldZuruecksetzen();
        for (int i = 0; i < ANZAHL_PILZE; i++) {
            setzePilz();
        }
    }

    /**
     * Ermittelt eine Position und setzt dort einen Pilz.
     * Ist die Position bereits belegt, wird das Setzen erneut gestartet
     */
    private static void setzePilz() {
        // Position ermitteln
        int x = RAND.nextInt(REIHEN);
        int y = RAND.nextInt(ZELLEN);
        if(SPIELFELD[x][y] == 1) {
            setzePilz();
        }
        else {
            SPIELFELD[x][y] = 1;
        }
    }

    /**
     * Füllt das Spielfeld mit 0
     */
    private static void spielfeldZuruecksetzen() {
        for (int[] reihe : SPIELFELD) {
            Arrays.fill(reihe, 0);
        }
    }
}
