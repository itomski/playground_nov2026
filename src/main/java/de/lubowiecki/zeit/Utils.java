package de.lubowiecki.zeit;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Utils {

    public static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    public static final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

    // Verhindert die Instanzierung
    private Utils() {
    }
}
