package de.lubowiecki.aufgaben;

import java.util.Random;

public class Aufgabe4 {

    /*
    Schreibe ein Programm für einen Würfelbecher.
    Die Methode Roll produziert eine Zufallszahl und gibt sie aus.
    */

    public static void main(String[] args) {

        // Aufruf einer statischen Methode
        DiceCup.roll1();
        DiceCup.roll1();
        DiceCup.roll1();

        System.out.println();

        // Aufruf einer Instanz-Methode
        DiceCup cup = new DiceCup(6);
        cup.roll2();
        cup.roll2();
        cup.roll2();

    }
}

class DiceCup {

    int dots;

    // Wird bei der Instanzierung erzeugt und wird von den Methoden wiederverwendet
    Random generator = new Random();

    public DiceCup(int dots) {
        this.dots = dots;
    }

    // Klassenmethode
    public static void roll1() {
        int result = (int)(Math.random() * 6) + 1;
        System.out.println(result);
    }

    // Instanzmethode
    public void roll2() {
        int result = generator.nextInt(1, dots + 1);
        System.out.println(result);
    }
}
