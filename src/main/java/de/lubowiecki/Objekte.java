package de.lubowiecki;

public class Objekte {

    public static void main(String[] args) {

        // Klasse = Bauplan
        // Objekt = Konkretes Objekt, das aus einem Bauplan erzeugt wurde

        // Eine Klasse
        // 3 Instanzen/Objekte
        Fahrzeug f1 = new Fahrzeug();
        Fahrzeug.getAnzahl(); // Aufruf direkt auf der Klasse
        Fahrzeug f2 = new Fahrzeug();
        Fahrzeug.getAnzahl();
        Fahrzeug f3 = new Fahrzeug();
        Fahrzeug.getAnzahl();

        f1.antrieb = "Elektro";
        f2.antrieb = "Benzin";
        f2.marke = "Volvo";
        f3.preis = 17_299.99;

        f1.getInfo();
        f2.getInfo();
        f3.getInfo();

    }
}

class Fahrzeug {

    // Wird gemeinsam von allen Fahrzeugen genutzt
    static int anzahl;

    String marke;
    String modell;
    int leistungInPs;
    String antrieb;
    String farbe;
    double preis;

    // Konstruktor
    Fahrzeug() {
        anzahl++; // Um 1 erhöhen
    }

    public void getInfo() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("PS: " + leistungInPs);
        System.out.println("Antrieb: " + antrieb);
        System.out.println("Farbe: " + farbe);
        System.out.println("Preis: " + preis);
        System.out.println();
    }

    public static void getAnzahl() {
        System.out.println(anzahl);
    }
}