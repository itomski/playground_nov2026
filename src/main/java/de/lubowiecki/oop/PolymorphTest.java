package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.List;

public class PolymorphTest {

    public static void main(String[] args) {

        List<Thing> dinge = new ArrayList<>();
        dinge.add(new Hammer()); // Ok: Hammer IS-A Thing
        dinge.add(new Tasse()); // Ok: Tasse IS-A Thing
        dinge.add(new Uhr()); // Ok: Uhr IS-A Thing
        dinge.add(new Hammer());
        dinge.add(new Uhr());
        dinge.add(new Zange());
        //dinge.add(new String("Moin")); // Ok: String IS-NOT-A Thing

        for(Thing t : dinge) {
            // Referenz ist vom Typ Thing
            // Objekttyp ist das jeweilige Objekt auf dem Heap
            System.out.println(t);
        }
    }
}

class Thing {

    @Override
    public String toString() {
        return getClass().getSimpleName(); // Liefert den Namen der Klasse
    }
}

class Tasse extends Thing {
}

class Hammer extends Thing {
}

class Uhr extends Thing {
}

class Zange extends Thing {
}