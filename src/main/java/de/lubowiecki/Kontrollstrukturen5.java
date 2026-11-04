package de.lubowiecki;

public class Kontrollstrukturen5 {

    public static void main(String[] args) {

        boolean run = false;

        while(run) { // Kopfgesteuert
            System.out.println("1");
        }

        do {
            System.out.println("2");
        } while(run); // Fussgesteuert

        // continue und break können in Schleifen (for, while, do-while) und in switch genutzt werden

    }
}
