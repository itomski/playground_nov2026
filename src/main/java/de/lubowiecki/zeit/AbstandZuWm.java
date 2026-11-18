package de.lubowiecki.zeit;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AbstandZuWm {

    public static void main(String[] args) {

        LocalDate heute = LocalDate.now();
        LocalDate wm = LocalDate.of(2030, 6, 8);

        long tage = ChronoUnit.DAYS.between(heute, wm);
        System.out.println(tage);

        long wochen = ChronoUnit.WEEKS.between(heute, wm);
        System.out.println(wochen);

        Period abstand = heute.until(wm);
        System.out.println(abstand);
        // Period abstand = Period.between(heute, wm);

        Period p1 = Period.of(0, 30, 0);
        System.out.println(p1);
        System.out.println(p1.normalized()); // Umrechung in Jahre

        System.out.println();
        p1 = Period.of(0, 0, 200);
        System.out.println(p1);
        System.out.println(p1.normalized()); // Keine Umrechnung von Tagen auf Monate oder Jahre
    }
}
