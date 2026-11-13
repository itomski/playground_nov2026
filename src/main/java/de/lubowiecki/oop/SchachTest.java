package de.lubowiecki.oop;

public class SchachTest {

    public static void main(String[] args) {

        Bauer b1 = new Bauer();
        Bauer b2 = new Bauer();
        Springer s3 = new Springer();

        Schachbrett schachbrett = new Schachbrett();
        schachbrett.aufstellen(b1, 1,5);
        schachbrett.aufstellen(b2, 2,6);
        schachbrett.aufstellen(s3, 3,0);
        b1.bewege();
        s3.bewege();
    }
}

class Schachbrett {

    private Figur[][] brett = new Figur[8][8];

    public void aufstellen(Figur figur, int x, int y) {
        brett[y][x] = figur;
    }

}

interface Figur {
    // Interface definiert den Kopf/Signatur der Methode
    boolean bewege();
}

class Bauer implements Figur {

    // Die Klasse realisiert die Methode nach eigenem Bedarf
    @Override
    public boolean bewege() {
        System.out.println("Ein Feld vorwärts");
        return true;
    }
}

class Springer implements Figur {
    @Override
    public boolean bewege() {
        System.out.println("Mehrere Felder diagonal");
        return true;
    }
}

class Koenig implements Figur {
    @Override
    public boolean bewege() {
        System.out.println("Ein Feld in jede Richtung");
        return true;
    }
}

class Pferd implements Figur {
    @Override
    public boolean bewege() {
        System.out.println("Zwei vorwärts und eins zur Seite");
        return true;
    }
}