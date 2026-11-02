package de.lubowiecki;

public class Datentypen {

    // Klassenvariable - bekommt einen Standardwert
    static boolean grossGenug;

    public static void main(String[] args) {

        // BOOLEAN

        boolean autoFahrer = false; // Deklaration + Initialisierung
        System.out.println(autoFahrer);

        autoFahrer = true;
        System.out.println(autoFahrer);

        System.out.println(); // Leerzeile

        System.out.println(grossGenug);

        // Lokale Variablen bekommen KEINE Standardwerte
        // Lokale Variable ist eine Variable, die INNERHALB einer Methode deklariert wird
        boolean altGenug; // Deklaration
        //System.out.println(altGenug); // Error: Variable ist nicht initialisiert
        altGenug = true; // Initialisierung
        System.out.println(altGenug);

        System.out.println();

        // CHAR
        char c1 = 'A';
        c1 = (char)(c1 + 2); // Cast nötig
        c1++;

        System.out.println(c1);
        System.out.println((char)3632);
        System.out.println('\u1136');
        System.out.println('\u22b2');

        System.out.println();

        // Byte
        byte b1 = 10; // Es wird geprüft, ob der Wert passt
        b1 = 120;
        b1 = -128;
        b1 = 127;
        byte b2 = 5;

        System.out.println(b1 + b2);
        //byte sum = b1 + b2; // Beim Rechnen mit Zahlen ist das Erg. mind. int
        int sum = b1 + b2; // OK
        System.out.println(sum);

        b1 = 125;
        System.out.println(b1++); // b1 = (byte)(b1 + 1)
        System.out.println(b1++);
        System.out.println(b1++);
        System.out.println(b1++); // Überfüllt

        // SHORT
        short s1 = 25000;

        // INT
        int i1 = 25;
        int i2 = 100;
        int iSum = i1 + i2;
        iSum = i1 / 2; // Ganzzahlen. Nachkommastelle geht verloren
        System.out.println(iSum);

        // byte < short < int < long < float < double
        //         char <

        iSum = i1 + b2; // Kleinerer Typ promoviert zum Größeren
        System.out.println(iSum);

        // LONG

        long zahl1 = 1_000_000_000_000_000L;
        zahl1 = 1_000_000;

        // Zahlensysteme
        int i3 = 0x22FFA; // Hex
        i3 = 0b0111001; // Binär
        i3 = 017; // Oktal
        System.out.println(i3);

        System.out.println(013);

        // FLOAT
        float f1 = 1.2F;

        // DOUBLE
        double d1 = 100.5;
        System.out.println(d1 - 15); // Der kleinere Typen eines Operanden wird an den, des größeren angepasst
    }
}
