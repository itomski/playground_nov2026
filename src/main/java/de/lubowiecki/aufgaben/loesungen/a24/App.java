package de.lubowiecki.aufgaben.loesungen.a24;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Tier> tiere = new ArrayList<>();
        tiere.add(new Katze()); // Katze IS-A Tier
        tiere.add(new Wolf()); // Katze IS-A Tier
        tiere.add(new Hund()); // Katze IS-A Tier
        tiere.add(new Vogel()); // Katze IS-A Tier

        for(Tier t : tiere) {
            t.gibLaut();
            t.bewegDichZum("Zoo");
//            t.friss("Gemüse");
        }
    }
}


