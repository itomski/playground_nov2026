package de.lubowiecki;

import java.time.LocalDate;

public class Api1 {

    public static void main(String[] args) {

        // Alle Klassen aus dem Package java.lang sind automatisch verfügbar und müssen NICHT importiert werden

        // Klassen aus anderen Packages müssen vor der Verwendung importiert werden
        LocalDate ld = LocalDate.now();

        String str1 = "Moin Moin "; // Verwendet den String-Literal-Pool
        String str2 = new String("Moin Moin "); // Baut IMMER ein neues Objekt auf dem Heap
        final String str3 = "Moin Moin "; // Compile-Time-Konstante
        final String str4;
        str4 = "Moin Moin "; // Runtime-Time-Konstante

        System.out.println(str1 == str3); // Ist es das gleiche Objekt?
        System.out.println(str1.equals(str3)); // Hat es den gleichen Inhalt?

        System.out.println();

        System.out.println(str1 == str2); // Ist es das gleiche Objekt?
        System.out.println(str1.equals(str2)); // Hat es den gleichen Inhalt?

        System.out.println("Moin Moin " + "ist eine einfache Art Hallo zu sagen!");
        System.out.println("Moin Moin ".concat("ist eine einfache Art Hallo zu sagen!"));
        System.out.println(str1 + "ist eine einfache Art Hallo zu sagen!");
        System.out.println(str1.concat("ist eine einfache Art Hallo zu sagen!"));
        System.out.println(str3 + "ist eine einfache Art Hallo zu sagen!");
        System.out.println(str3.concat("ist eine einfache Art Hallo zu sagen!"));
        System.out.println(str4 + "ist eine einfache Art Hallo zu sagen!");
        System.out.println(str4.concat("ist eine einfache Art Hallo zu sagen!"));

        System.out.println();

        StringBuilder sb = new StringBuilder(); // Leerer Stringbuilder
        sb.append("Hallo").append(" Welt").append(100).append(true);
        sb.append("...");
        System.out.println(sb); // Automatischer Aufruf von toString
        String output = sb.toString();
    }
}
