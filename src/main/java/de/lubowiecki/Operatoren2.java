package de.lubowiecki;

public class Operatoren2 {

    public static void main(String[] args) {

        // Relationale Operatoren liefern IMMER ein boolean
        System.out.println(10 < 12); // kleiner
        System.out.println(10 <= 10); // kleiner-gleich
        System.out.println(10 == 12); // gleich?
        System.out.println(10 >= 12); // groeßer-gleich?
        System.out.println(10 > 12); // groeßer?
        System.out.println(10 != 12); // nicht-gleich?
        // System.out.println(10 => 12); // nicht erlaubt!

        // Logisch: Arbeiten mit booleschen zuständen
        // short-circuit: Verarbeiten den Ausdruck, bis ein eindeutiges Ergebnis feststeht

        // UND
        if(true && false) { // Beide Seiten MÜSSEN true ergeben
            System.out.println("#");
        }

        // ODER
        if(true || false) { // Mind. eine der Seiten MUSS true ergeben
            System.out.println("&");
        }

        // XOR
        if(true ^ false) { // Nur eine der Seiten DARF true ergeben
            System.out.println("@");
        }

        System.out.println();

        // Bitwise
        // Verarbeiten den Ausdruck IMMER komplett

        if(true & false) { // Beide Seiten MÜSSEN true ergeben
            System.out.println("#");
        }

        if(true | false) { // Mind. eine der Seiten MUSS true ergeben
            System.out.println("&");
        }

        System.out.println();

        // UND
        // 00001010: 10
        // 00000101: 5
        // 00000000: 0
        System.out.println(10 & 5);

        // OR
        // 00001010: 10
        // 00000101: 5
        // 00001111: 15
        System.out.println(10 | 5);

        // XOR
        // 00001010: 10
        // 00000110: 6
        // 00001100: 12
        System.out.println(10 ^ 6);

    }
}
