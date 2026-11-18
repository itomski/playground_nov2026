package de.lubowiecki.aufgaben;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aufgabe32 {

    /*
    Schreibe ein Programm, welches vom User 3 Zahlen entgegennimmt und daraus ein LocalDate erzeugt.
    Gebe es aus.
    Danach verschiebe das Datum um 15 Tage und 3 Monate in die Zukunft.
    Gebe es aus.

    Erzeuge ein zweites LocalDate und errechne danach den Abstand in Tagen zwischen beiden.
    (Tipp: überladene until-Methode)
     */

    public static void main(String[] args) {

        int tag = Integer.parseInt("10");
        int monat = Integer.parseInt("3");
        int jahr = Integer.parseInt("2025");

        LocalDate ld = LocalDate.of(jahr, monat, tag);
        System.out.println(ld);

        ld = ld.plusDays(15);
        ld = ld.plusMonths(3);
        System.out.println(ld);

        tag = Integer.parseInt("3");
        monat = Integer.parseInt("8");
        jahr = Integer.parseInt("2027");

        LocalDate future = LocalDate.of(jahr, monat, tag);

        long days  = Duration.between(ld.atStartOfDay(), future.atStartOfDay()).toDays();
        System.out.println(days);

        System.out.println();

        days = ld.until(future, ChronoUnit.DAYS);
        System.out.println(days);
    }
}
