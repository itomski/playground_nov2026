package de.lubowiecki.zeit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Basics {

    public static void main(String[] args) {

        //Date heute1 = new Date();
        Date heute1 = new Date(95, 4, 15);
        System.out.println(heute1);

        System.out.println();

        LocalDate datum = LocalDate.now(); // Aktuelles Datum
        System.out.println(datum);
        LocalTime zeit = LocalTime.now();
        System.out.println(zeit);
        LocalDateTime datumUndZeit = LocalDateTime.now();
        System.out.println(datumUndZeit);
        System.out.println(datumUndZeit.toLocalDate());
        System.out.println(datumUndZeit.toLocalTime());

    }
}
