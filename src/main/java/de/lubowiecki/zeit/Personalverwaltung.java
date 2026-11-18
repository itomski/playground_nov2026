package de.lubowiecki.zeit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personalverwaltung {

    public static void main(String[] args) {
        Person p1 = new Person("Peter", "Parker", LocalDate.of(1999, 5, 7));
//        System.out.println(p1);
//        System.out.println(p1.getGeburtsDatumFormatiert());

        final String ROW_TPL = "| %5s | %10s | %10s | %12s | \n";

        List<Person> personal = new ArrayList<>();
        personal.add(p1);
        personal.add(new Person("Bruce", "Banner", LocalDate.of(1982, 7, 15)));
        personal.add(new Person("Toni", "Stark", LocalDate.of(1979, 6, 1)));
        personal.add(new Person("Carol", "Danvers", LocalDate.of(2001, 1, 20)));
        personal.add(new Person("Steve", "Rogers", LocalDate.of(1928, 9, 1)));

        Collections.sort(personal);

        //System.out.println(personal);

        System.out.printf(ROW_TPL, "ID", "VORNAME", "NACHNAME", "GEBURTSDATUM");
        for(Person p : personal) {
            System.out.printf(ROW_TPL, p.getId(), p.getVorname(), p.getNachname(), p.getGeburtsDatumFormatiert());
        }
    }
}
