package de.lubowiecki.aufgaben.loesungen.a10;

import java.util.Random;

public class DiceCup {

    private final Random rand = new Random();

    private int dots = 6;

    public DiceCup() {
    }

    public DiceCup(int dots) {
        this.dots = dots;
    }

    public int roll() {
        return rand.nextInt(dots) + 1;
    }

    public int[] roll(int count) {

        int[] results = new int[count]; // Leeres Array

        // Array mit Zufallszahlen füllen
        for (int i = 0; i < results.length; i++) {
            results[i] = roll(); // roll für eine Zufallszahl wird verwendet
        }

        // Array zurückgeben
        return results;
    }
}
