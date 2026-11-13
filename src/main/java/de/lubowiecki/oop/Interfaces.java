package de.lubowiecki.oop;

public class Interfaces {

    public static void main(String[] args) {

        // Interfaces können auch als Referenztypen genutzt werden
        //Movable m = new Movable(); // Error: Interfaces können NICHT direkt instanziert werden
        Movable m = new Robot();
        m.moveTo(10, 7);

        System.out.println();

        m = new Vehicle();
        m.moveTo(10, 7);

        // Über die Referenz vom Typ eines Interface sind alle Methoden des Interface aufrufbar.
        // Die Methoden werden auf dem konkreten Objekttyp ausgeführt

    }
}

// Ein Interface beschreibt Anforderungen an eine Klasse

interface Movable {

    void moveTo(int x, int y);

}

// Interfaces werden implementiert
// Eine Klasse kann NUR EINE andere Klasse extenden
// Aber sie darf beliebig viele Interfaces implementiern
class Robot implements Movable {

    // Die Klasse MUSS alle Methoden des Interface das sie implementiert realisieren
    // Die Klasse kann entscheiden, WIE die Methode realisiert wird

    @Override
    public void moveTo(int x, int y) {
        System.out.println("Noch nicht ausprogrammiert!");
    }
}

class Vehicle implements Movable {

    private int x;
    private int y;

    @Override
    public void moveTo(int x, int y) {
        System.out.printf("Bewegung: x=%d y=%d \n", x, y);
        this.x = x;
        this.y = y;
    }
}