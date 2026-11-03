package de.lubowiecki;

public class Kontrollstrukturen1 {

    public static void main(String[] args) {

        boolean aktiverKunde = false;

        if(aktiverKunde) {
            System.out.println("OK");
        }

        System.out.println();

        if(aktiverKunde) {
            System.out.println("OK");
        }
        else {
            System.out.println("Nicht ok!");
        }

        System.out.println();

        // Auch ohne Klammern möglich (bei einer einzigen Anweisung im Block)
        if(aktiverKunde) System.out.println("OK");
        else System.out.println("Nicht ok!");

        System.out.println();

        int zahl = 100;

        if(zahl < 0) {
            System.out.println("Negativ!");
        }
        else if(zahl > 120) {
            System.out.println("Zu hoch!");
        }
        else {
            System.out.println("Passt!");
        }

        String output;

        if(aktiverKunde) {
            // Variablen sind nur in dem Block sichtbar, in dem sie deklariert wurden
            String status = "aktiv";
            output = "aktiv";
        }
        else {
            String status = "passiv";
            output = "passiv";
        }

        //System.out.println(status); // status ist hier nicht mehr verfügbar
        System.out.println(output);

        System.out.println("Dieser Kunde ist " + output);
                                                    // WENN      ?   DANN  :  SONST
        System.out.println("Dieser Kunde ist " + ((aktiverKunde) ? "aktiv" : "passiv"));

        // Bei einer Zuweisung
        output = (aktiverKunde) ? "aktiv" : "passiv";
    }
}
