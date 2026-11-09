package de.lubowiecki;

public class Operatoren {

    public static void main(String[] args) {

        // Mathematisch
        int a = -10;

        int erg1 = 10 + 17;
        int erg2 = 10 + 15 * 2; // Punkt vor Strich
        System.out.println(erg2); // 40

        // Modulo
        System.out.println(10 % 2);
        System.out.println(10 % 3);
        System.out.println(7 % 8);

        erg2 = (10 + 15) * 2;
        System.out.println(erg2); // 50

        System.out.println();

        int b = 100;
        b += 5; // b = (int)(b + 5);

        byte by = 120;
        by += 10; // by = (byte)(by + 10);
        System.out.println(by);

        // Zusammengesetzte Operatoren und Increment und Decrement können NUR mit Variablen erfolgen.

        // 10++; // Mit Literalen nicht möglich!
        // 10 += 15; // Mit Literalen nicht möglich!
    }
}
