package de.lubowiecki.zeit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Methoden {

    public static void main(String[] args) {

        // LocalDate ld = new LocalDate(); // Error: privater Konstruktor
        LocalDate ld = LocalDate.of(2005, 5, 25);
        System.out.println(ld); // ISO

        // LocalDate, LocalTime und LocalDateTime sind IMMUTABLE
        ld = ld.plusMonths(2); // Neues Objekt MUSS auf die alte Referenz zugewiesen werden
        ld = ld.plusWeeks(20);
        ld = ld.minusYears(2);
        ld = ld.plus(10, ChronoUnit.DAYS); // Mit Wert und Einheit
        ld = ld.plus(Period.of(2,7,25)); // Zeitraum
        System.out.println(ld);

        // LocalDate ist vergleichbar
        LocalDate ld2 = LocalDate.of(2005, 5, 25);
        System.out.println(ld.compareTo(ld2)); // Vergleicht

        LocalDateTime ldt = ld.atTime(LocalTime.now()); // Verbindet Datum und Zeit zu einem LocalDateTime
        System.out.println(ldt);

        System.out.println(ld.getMonth()); // Enum Month
        System.out.println(ld.getMonthValue()); // int Wert
        System.out.println(ld.getYear());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfWeek()); // Enum DayOfWeek
        System.out.println(ld.getDayOfYear());

        LocalDate heute = LocalDate.now();

        System.out.println(ld.isAfter(heute));
        System.out.println(ld.isBefore(heute));

        System.out.println(ld.until(heute)); // Period

        ld = ld.withYear(2000); // Überschreibt das Jahr
        ld = ld.withMonth(1); // Überschreibt den Monat

        System.out.println();
        System.out.println(ld);

        // Formatierung
        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ISO_WEEK_DATE;
        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("d. MMMM yyyy");

        //Locale.setDefault(Locale.CHINA); // Sprach und Land Einstellung

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(DATE_FMT.format(ld));
        System.out.println(ld.format(DATE_FMT));

    }
}
