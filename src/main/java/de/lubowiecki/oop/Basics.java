package de.lubowiecki.oop;

import de.lubowiecki.Person;

public class Basics {

    public static void main(String[] args) {

        Produkt p1 = new Produkt();
        p1.gewicht = 10.0;

        Fahrrad f1 = new Fahrrad();
        f1.hersteller = "Peugeot"; // Erbt Eigenschaften von Produkt


    }
}

class Produkt {

    String hersteller;
    double gewicht;
    double preis;
}

// Die Kindklasse erweitert die Elternlasse um zusätzliche Eigenschaften und Fähigkeiten
class Fahrrad extends Produkt {

    int gaenge;
    double radgroesse;
}

class Radio extends Produkt {

    String frequenzen;
    String energieQuelle;
}


