package de.lubowiecki;

import java.util.Random;

public class Zufallszahlen {

    public static void main(String[] args) {

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        // Variante 1
        System.out.println((int)(Math.random() * 100) + 1); // 1 - 100


        // Variante 2
        Random zufallsGenerator = new Random();
        System.out.println(zufallsGenerator.nextInt(100) + 1); // 1 - 100
    }
}
