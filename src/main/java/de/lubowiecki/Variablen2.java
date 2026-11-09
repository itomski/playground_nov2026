package de.lubowiecki;

public class Variablen2 {

    public static void main(String[] args) {

        // System.out.println(a); // Error: Variable ist noch nicht deklariert

        int a = 10;
        System.out.println(a);

        if(true) {
            // Eine Variable ist in dem Block verfügbar, in dem sie deklariert wurde
            int b = 20;
        } // b ist out of scope

        // System.out.println(b); // Error: ist hier nicht mehr sichtbar

        int d; // Deklaration entscheidet über die Sichtbarkeit

        { // Schränkt die Sichtbarkeit der Variable ein
            int c = 30;
            d = c;
        }

        //System.out.println(c); // Error: Out of Scope
        System.out.println(d); // Immer noch verfügbar

        int alter = 20;

        String output;

        if(alter < 18) {
            output = "zu jung";
        }
        else {
            output = "alt genug";
        }

        System.out.println("Du bist " + output);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //System.out.println(i); // Error: i ist out of scope

        // i ist hier wieder als Name verfügbar
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(i); // OK
    }
}
