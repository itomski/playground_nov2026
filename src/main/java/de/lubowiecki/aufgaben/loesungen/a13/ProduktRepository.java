package de.lubowiecki.aufgaben.loesungen.a13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduktRepository {

//    private Produkt[] produkte = new Produkt[10];
    private List<Produkt> produkte = new ArrayList<>();

//    private int naechsterFreierIndex = 0;

    public void hinzufuegen(Produkt produkt) {
        // TODO: Wenn das Array zu klein ist, bitte vergrößern
//        produkte[naechsterFreierIndex] = produkt;
//        naechsterFreierIndex++;
        produkte.add(produkt);

    }

    // TODO: Weitere Methoden zum Ändern und Löschen der Produkte

//    public Produkt[] alleAbfragen() {
//        return produkte;
//    }

    public List<Produkt> alleAbfragen() {
        //return produkte;
        return Collections.unmodifiableList(produkte); // Eine unveränderbare Kopie der Liste wird zurückgegeben
    }
}
