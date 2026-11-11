package de.lubowiecki.aufgaben.loesungen.a20;

public class Espresso extends KaffeeProdukt {

    public Espresso() {
        super(25, 50, 0);

        //mengeWasser = 75; // Geht nicht. Eigenschaft ist privat!
        setMengeWasser(75); // Ok. Setter ist public

        // super ist eine Referenz auf ein Objekt der Elternklasse
    }
}
