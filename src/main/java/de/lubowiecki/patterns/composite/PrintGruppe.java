package de.lubowiecki.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Composite
// Die Guppe implementiert das gleiche Interface
public class PrintGruppe implements Printable {

    private final List<Printable> DOKUMENTE = new ArrayList<>();

    public PrintGruppe(Printable... dokumente) {
        // Alle Elemente des VarArgs werden in die Liste DOKUMENTE hinzugefügt
        DOKUMENTE.addAll(Arrays.asList(dokumente));
    }

    @Override
    public void print() {
        // Die Print-Anweisung wird an die Dokumente in der Liste delegiert
        for(Printable d : DOKUMENTE) {
            d.print();
        }
    }
}
