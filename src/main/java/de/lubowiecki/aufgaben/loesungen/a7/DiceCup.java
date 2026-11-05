package de.lubowiecki.aufgaben.loesungen.a7;

import java.util.Random;

public class DiceCup {

    static Random generator = new Random();

    public static int roll() {
        return generator.nextInt(6) + 1;
    }
}
