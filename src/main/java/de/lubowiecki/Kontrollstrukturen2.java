package de.lubowiecki;

public class Kontrollstrukturen2 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        int anzahl = 5;

        for (int i = 0; i < anzahl; i++) {
            System.out.println(i);
        }

        // System.out.println(i); // Hier nicht mehr verfügbar

        System.out.println();

        for (int i = 0; i < anzahl; i++)
            System.out.println(i);

        System.out.println();

        int j = 5;
        for (;j > 0;)
            System.out.println(j--);

        // Endlosschleife
        // for (;;) System.out.print("!");

        System.out.println();

        for (int i = 0; i < 10; i++) { // Zeilen
            for (int k = 0; k < 10; k++) { // Zellen
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 1) continue; // Springt zum nächsten durchlauf

            System.out.println(i);

            if(i == 80) break; // Die Schleife wird bei 80 vorzeitig beenden
        }
    }
}
