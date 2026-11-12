package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methoden {

    public static void main(String[] args) {

        // Pkw = Referenztyp (links)
        // Pkw = Objekttyp (rechts)
        Pkw pkw = new Pkw(4);
        pkw.einsteigen("Peter", 0);
        pkw.einsteigen("Bruce", 1);

        // Methode wird auf dem Objekttyp ausgeführt
        pkw.printInfo(); // Geerbte Methode

        System.out.println();

        Lkw lkw = new Lkw(10);
        lkw.ladungHinzufuegen("Milch");
        lkw.ladungHinzufuegen("Butter");
        lkw.ladungHinzufuegen("Klopapier");
        lkw.printInfo();

        System.out.println();

        print(pkw);
        print(lkw);
    }

    private static void print(Fahrzeug f) {
        // Referenztyp: Fahrzeug
        // Objekttyp: Das konkrete Objekt
        f.printInfo();
    }

}

class Fahrzeug {

    private String kennzeichen;
    private String marke;
    private String modell;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
    }

    public void printInfo() {
        System.out.println(kennzeichen + ", " + marke + ", " + modell);
    }
}

class Pkw extends Fahrzeug {

    // Zuweisung dieser Konstante MUSS spätestens im Konstruktor erfolgen
    private final String[] sitzplaetze;

    public Pkw() {
        // super(); Aufruf des Konstruktors der Elternklasse
        sitzplaetze = new String[5];
    }

    public Pkw(int anzahlSitzplaetze) {
        this.sitzplaetze = new String[anzahlSitzplaetze];
    }

    public Pkw(String kennzeichen, String marke, String modell, int anzahlSitzplaetze) {
        // super = Objekt der Elternklasse
        // this = dieses Objekt
        super(kennzeichen, marke, modell); // Weitergabe von Infos an die Elternklasse
        this.sitzplaetze = new String[anzahlSitzplaetze];
    }

    public void einsteigen(String name, int position) {
        sitzplaetze[position] = name;
    }

    public void aussteigen(int position) {
        sitzplaetze[position] = null;
    }

    // Methoden überschreiben = eine geerbte Methode anpassen
    @Override
    public void printInfo() {
        super.printInfo(); // Aufruf der Methode aus der Elternklasse
        System.out.println(Arrays.toString(sitzplaetze));
    }
}

class Lkw extends Fahrzeug {

    private final int MAX_KAPAZITAET;
    private List<String> ladung = new ArrayList<>();

    public Lkw() {
        MAX_KAPAZITAET = 100;
    }

    public Lkw(int kapazitaetDerLadung) {
        MAX_KAPAZITAET = kapazitaetDerLadung;
    }

    public void ladungHinzufuegen(String fracht) {
        if(this.ladung.size() < MAX_KAPAZITAET)
            this.ladung.add(fracht);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(ladung);
    }
}