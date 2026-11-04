package de.lubowiecki;

public class KlasseVsObjekt {

    public static void main(String[] args) {

        double sum = Rechner.add(10, 25); // Verwendung statischer Methoden
        System.out.println(sum);

        Buch buch1 = new Buch("Java ist auch eine Insel", "123-456-7890", 15.99); // Objekterzeugung
        Buch buch2 = new Buch("Java ist eine Insel 2");
//        buch1.preis = 10;
//        buch1.titel = "Java ist auch eine Insel";
        double preis = buch1.getPreisInklMwSt(); // Für Aufruf von Instanzmethoden ist ein Objekt notwendig
        System.out.printf("%.2f", preis);
    }
}

class Buch {

    // Eigenschaften beschreiben den Zustand aktuellen eines Objektes
    String titel;
    String autor;
    String beschreibung;
    String isbn;
    double preis;

    // Gibt es keinen Konstruktor in einer Klasse, wird automatisch
    // ein parametrloser Default-Konstruktor von Java bereitgestellt

    // Konstruktor: heißt IMMER so wie die Klasse
    public Buch(String titel, String isbn, double preis) {
        // Methoden Parameter sind lokale Variablen
        // this.titel = Instanzvariable
        // titel = lokale Variable
        this.titel = titel;
        this.isbn = isbn;
        this.preis = preis;
    }

    // Ein weiterer Konstruktor
    public Buch(String titel) {
        this.titel = titel;
    }

    // Instanzmethoden verwenden den Zustand (Eigenschaften) des Objektes
    public double getPreisInklMwSt() {
        return preis * 1.07;
    }
}

class Rechner {

    // Hat keine Eigenschaften

    // Verhindert die Objekterzeugung - Klassen, die nur statisches Inventar haben, sollten nicht Instanziert werden
    private Rechner() {
    }

    // Verarbeitet Methodenparameter
    public static double add(double a, double b) {
        return a + b;
    }
}
