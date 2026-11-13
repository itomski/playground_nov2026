package de.lubowiecki.aufgaben.loesungen.a24;

public class Hund extends Tier {

    @Override
    public void gibLaut() {
        System.out.println(getClass().getSimpleName() + ": Wau Wau");
    }
}
