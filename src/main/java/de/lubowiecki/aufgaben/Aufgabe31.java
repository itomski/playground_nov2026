package de.lubowiecki.aufgaben;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufgabe31 {

    /*
    Schreibe eine Liste von 5 Datumsangaben
    Sortiere die Liste und gebe die Angaben in deutscher Schreibweise aus
     */

    public static void main(String[] args) {

        List<LocalDate> dates = new ArrayList<>();
        // Listen sind geordnet - Einfügereihenfolge
        dates.add(LocalDate.of(2015, 10, 5));
        dates.add(LocalDate.of(2026, 1, 15));
        dates.add(LocalDate.of(2007, 8, 30));
        dates.add(LocalDate.of(1999, 2, 18));
        dates.add(LocalDate.of(2028, 1, 1));

        //System.out.println(dates);

        Collections.sort(dates); // Sortieren
        //dates.sort((d1, d2) -> d1.compareTo(d2));

        final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for(LocalDate d : dates) {
            System.out.println(d.format(FMT)); // Formatiert ausgeben
        }
    }
}
