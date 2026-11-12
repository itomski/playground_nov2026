package de.lubowiecki.aufgaben.loesungen.a21;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static final int REIHEN = 10;
    private static final int ZELLEN = 10;

    private static final int[][] spielfeld = new int[REIHEN][ZELLEN];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        roboterPlazieren(x, y);

        while(true) {
            System.out.print("Bewegung: ");
            String eingabe = scanner.next().trim().toUpperCase();

            for(String zeichen : eingabe.split("")) {
                switch(zeichen) {
                    case "R" -> {
                        x = bewegungHorizontal(x, true);
                    }
                    case "L" -> {
                        x = bewegungHorizontal(x, false);
                    }
                    case "U" -> {
                        y = bewegungVertikal(y, true);
                    }
                    case "O" -> {
                        y = bewegungVertikal(y, false);
                    }
                }
            }
            roboterPlazieren(x, y);
        }
    }

    /**
     * Führt die Bereinigung des Spielfelds aus und positioniert den Roboter darauf,
     * danach erfolgt die Ausgabe
     * @param x Aktuelle horizontale Position des Roboters
     * @param y Aktuelle vertikale Position des Roboters
     */
    private static void roboterPlazieren(int x, int y) {
        spielfeldBereinigen();
        spielfeld[y][x] = 1;
        printSpielfeld();
    }

    /**
     * Prüft, ob die gewünschte Bewegung erfolgen kann und bestimmt die neue horizontale Position des Roboters
     * @param x Aktuelle horizontale Position des Roboters
     * @param vorwaerts Angabe, ob die Bewegung vorwärts oder rückwärts erfolgen soll
     * @return Neue horizontale Position für den Roboter
     */
    private static int bewegungHorizontal(int x, boolean vorwaerts) {
        int temp;

        if(vorwaerts) {
            temp = x + 1;
            if (temp < ZELLEN)
                x = temp;
        }
        else {
            temp = x - 1;
            if(temp > -1)
                x = temp;
        }
        return x;
    }

    /**
     * Prüft, ob die gewünschte Bewegung erfolgen kann und bestimmt die neue vertikale Position des Roboters
     * @param y Aktuelle vertikale Position des Roboters
     * @param vorwaerts Angabe, ob die Bewegung vorwärts oder rückwärts erfolgen soll
     * @return Neue vertikale Position für den Roboter
     */
    private static int bewegungVertikal(int y, boolean vorwaerts) {
        int temp;

        if(vorwaerts) {
            temp = y + 1;
            if (temp < REIHEN)
                y = temp;
        }
        else {
            temp = y - 1;
            if(temp > -1)
                y = temp;
        }
        return y;
    }

    /**
     * Gibt den aktuellen Zustand des Spielfelds aus
     * X zeigt ein leeres Feld an
     * @ zeigt die Position des Roboters an
     */
    private static void printSpielfeld() {
        for(int[] reihen : spielfeld) {
            for(int zelle : reihen) {
                if(zelle == 1)
                    System.out.print(" @ ");
                else
                    System.out.print(" X ");
            }
            System.out.println();
        }
    }

    /**
     * Überschreibt alle Spielfeld-Positionen mit 0
     */
    private static void spielfeldBereinigen() {
        for(int[] reihen : spielfeld) {
            Arrays.fill(reihen, 0);
        }
    }
}
