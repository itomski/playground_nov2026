package de.lubowiecki.patterns.composite;


// Interface Methoden MÜSSEN von allen konkreten Klassen eingebaut werden
// Abstrakte Klassen geben die Anforderung an ihre Kindklassen weiter
// Abstrakte Klassen sind keine vollständige Klassen und dürfen nicht direkt instanziert werden
public abstract class Dokument implements Printable {

    private final String typ;

    public Dokument(String typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return typ;
    }

    // Hat eine Klasse eine abstrakte Methoe muss sie abstrakt sein
    public abstract void print(); // Abstrakte Methoden sind nicht fertig und MÜSSEN von den Kindklassen eingebaut werden
}
