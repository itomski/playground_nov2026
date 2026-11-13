package de.lubowiecki.aufgaben.loesungen.a24;

public abstract class Tier {

    // abstract = Die Implementierung wird auf die Kindklassen verschoben.
    // Die Kindklassen MÜSSEN! diese Methode bereitstellen
    public abstract void gibLaut();

    public void bewegDichZum(String ziel) {
        System.out.println(getClass().getSimpleName() + ": bewegt sich zum " + ziel);
    }
}
