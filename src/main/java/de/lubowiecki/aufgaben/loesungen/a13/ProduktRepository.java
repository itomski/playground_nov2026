package de.lubowiecki.aufgaben.loesungen.a13;

public class ProduktRepository {

    private Produkt[] produkte = new Produkt[10];

    private int naechsterFreierIndex = 0;

    public void hinzufuegen(Produkt produkt) {
        // TODO: Wenn das Array zu klein ist, bitte vergrößern
        produkte[naechsterFreierIndex] = produkt;
        naechsterFreierIndex++;
    }

    // TODO: Weitere Methoden zum Ändern und Löschen der Produkte

    public Produkt[] alleAbfragen() {
        return produkte;
    }
}
