package de.lubowiecki.exceptions;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        String text = null;
        //System.out.println(text.toUpperCase()); // NullPointerException

        // Eine Exception unterbricht die Ausführung der Methode

        // System.out.println(10 / 0); // ArithmeticException

        int[] arr = new int[10];
        //arr[10] = 100; // ArrayIndexOutOfBoundsException - Index beginnt bei 0
        //System.out.println(arr[-5]); // ArrayIndexOutOfBoundsException

//        arr = new int[-10]; // NegativeArraySizeException

//          int zahl = Integer.parseInt("100,0"); // NumberFormatException
//        System.out.println(zahl);

        // Exceptions tauchen NUR zur Laufzeit auf

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl: ");
        int zahl = scanner.nextInt(); // InputMismatchException bei eingabe von Nicht-Zahlen

        System.out.println("###");
    }
}
