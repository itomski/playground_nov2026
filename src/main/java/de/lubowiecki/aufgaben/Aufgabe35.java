package de.lubowiecki.aufgaben;

import static de.lubowiecki.aufgaben.Xyz.*;

public class Aufgabe35 {

    /*
    Schreibe eine Util-Klasse mit 2 Konstanten und 2 Methoden (alle statisch)
    Verwende sie in der main-Methode einer zweiten Klasse per statischen Import.
    */

    public static void main(String[] args) {

        System.out.println(X);
        System.out.println(Y);

        machWas();

        machWasAnderes();
    }
}

class Xyz {

    public static final int X = 10;
    public static final int Y = 20;

    public static void machWas() {
        System.out.println("MachWas");
    }

    public static void machWasAnderes() {
        System.out.println("MachWasAnderes");
    }
}
