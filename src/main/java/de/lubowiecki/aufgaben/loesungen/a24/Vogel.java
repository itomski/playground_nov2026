package de.lubowiecki.aufgaben.loesungen.a24;

public class Vogel extends Tier {

    // Methode in Tier ist abstrakt und MUSS hier ersetzt werden
    @Override
    public void gibLaut() {
        System.out.println("Tweet tweet");
    }

    // Ersetzt die geerbte Variante aus der Elternklasse (Tier)
    @Override
    public void bewegDichZum(String ziel) {
        System.out.println(getClass().getSimpleName() + ": fliegt zum " + ziel);
    }
}
