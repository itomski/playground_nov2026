package de.lubowiecki.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        PowerPointDokument ppd = new PowerPointDokument();
        ExcelDokument ed = new ExcelDokument();
        WordDokument wd = new WordDokument();

        // Die Gruppe selbst ist auch ein Printable
        PrintGruppe g1 = new PrintGruppe(ppd, ed, wd);
        g1.print();

        System.out.println();

        // Gruppen können auch wie Dokumente anderen Gruppen hinzugefügt werden
        PrintGruppe g2 = new PrintGruppe(g1, new WordDokument(), new ExcelDokument());
        g2.print();

//        System.out.println(ppd);
//        System.out.println(ed);
//        System.out.println(wd);
//
//        List<Printable> dokumente = new ArrayList<>();
//        dokumente.add(ppd);
//        dokumente.add(ed);
//        dokumente.add(wd);
//
//        for(Printable p : dokumente) {
//            p.print(); // Das Interface sichert zu, dass die print-Methode verfügbar ist
//        }
    }
}
