package de.lubowiecki.aufgaben.loesungen.a21;

import java.util.Scanner;

public class App {

    private static final int[][] spielfeld = new int[10][10];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.print("Bewegung: ");
            String eingabe = scanner.next().trim().toUpperCase();

            for(String zeichen : eingabe.split("")) {
                switch(zeichen) {
                    case "R" -> System.out.println("Rechts");
                    case "L" -> System.out.println("Links");
                    case "O" -> System.out.println("Oben");
                    case "U" -> System.out.println("Unten");
                }
            }
        }

//        int x = 4;
//        int y = 2;
//
//        spielfeld[y][x] = 1;
//        printSpielfeld();

    }

    private static void printSpielfeld() {

        for(int[] zeile : spielfeld) {
            for(int zelle : zeile) {
                if(zelle == 1)
                    System.out.print(" @ ");
                else
                    System.out.print(" X ");
            }
            System.out.println();
        }
    }

}
