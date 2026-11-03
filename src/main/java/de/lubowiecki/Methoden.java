package de.lubowiecki;

public class Methoden {

    // Statische Methoden können nur andere statische Methoden direkt aufrufen
    public static void main(String[] args) {

        int result = machWas(5);
        System.out.println(result);

        result = machWas(10);
        System.out.println(result);

        result = machWas(20);
        System.out.println(result);

    }

    // Klammer = Eingang in die Methode
    // int = Rückgabetyp, void = Methode hat keine Rückgabe
    public static int machWas(int zahl) {
        // Methoden-Körper = Verarbeitung
        // System.out.println(zahl * zahl);
        int erg = zahl * zahl;
        return erg; // Was die Methode zurückgibt
    }
}
