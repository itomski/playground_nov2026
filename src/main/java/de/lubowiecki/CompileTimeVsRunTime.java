package de.lubowiecki;


public class CompileTimeVsRunTime {

    public static void main(String[] args) {

        final int CONST1 = 100; // Compiletime-Konstante: Deklaration und Inititalisierung in einem

        //final int CONST2 = 200;
        final int CONST2;
        CONST2 = 200; // Runtime-Konstante: Deklaration und Inititalisierung sind getrennt

        while(CONST1 < CONST2) { // Kompiler kann das Ergebnis ermitteln
            System.out.println("A");
        }

        System.out.println("ABC");

        int eingabe = 50;

        switch(eingabe) {
            case 50:
                System.out.println("A");
            case CONST1: // Müssen Compiletime-Konstanten sein
                System.out.println("B");
            case CONST1 + 20: // Ok
                System.out.println("C");
//            case CONST2: // Runtime-Konstanten nicht erlaubt
//                System.out.println("D");
        }

    }
}
