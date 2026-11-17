package de.lubowiecki.aufgaben;

public class Aufgabe30 {

    /*
    Schreibe ein Enum Dice mit den Konstanten W6, W10, W20 und W100.
    Hinter der Auswahl steht jeweils die Augenanzahl des Würfels d.h. W6 liefert eine 6.
     */

    public static void main(String[] args) {

        System.out.println(Dice.W6.get());
        System.out.println(Dice.W20.get());

    }
}

enum Dice {

    W4(4), W6(6), W10(10), W20(20), W100(100);

    private final int pips;

    Dice(int pips) {
        this.pips = pips;
    }

    public int get() {
        return pips;
    }
}
