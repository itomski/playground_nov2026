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

        System.out.println();

        // Parameterloser Konstruktor baut einen SB mit der capacity von 16
        StringBuilder sb2 = new StringBuilder(); // Leerer Stringbuilder
        System.out.println(sb2.length()); // Anzahl von Zeichen im SB
        System.out.println(sb2.capacity()); // Größe des internen Arrays

        System.out.println();
        sb2.append("1234567890123456");
        sb2.append("a");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        // Vergößern = alte Größe * 2 + 2

        System.out.println();
        sb2.append("1234567890");
        sb2.append("1234567890");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        System.out.println();
        sb2.trimToSize(); // Zuschnitt des Arrys (capacity) auf die benötigte Größe
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        // startindex inkl.
        // endindex exkl.
        sb2.delete(5, 10); // Entfernt Zeichen an gewünschter Position
        System.out.println(sb2.length());

        sb2.insert(5, "abc"); // Fügt Zeichen an gewüpnschter Position hinzu

        // Veränedrt nicht den StringBuilder
        String sub = sb2.substring(15, 20); // Liefert Zeichen aus dem StringBuilder als String
        System.out.println(sub);

        System.out.println();

        // Konstruktor mit einem String baut einen StringBuilder mit der capacity: Anzahl Zeichen + 16
        StringBuilder sb3 = new StringBuilder("0123456789");
        System.out.println(sb3.length()); // 10
        System.out.println(sb3.capacity()); // 26

        System.out.println();
        sb3.setLength(5); // Schneidet den Inhalt ab
        System.out.println(sb3);
        System.out.println(sb3.length()); // 5
        System.out.println(sb3.capacity()); // 26

        System.out.println();
        sb3.setLength(50); // Fügt leere Unicode-Zeichen hinzu
        System.out.println(sb3);
        System.out.println(sb3.length()); // 50
        System.out.println(sb3.capacity()); // 54

        System.out.println();

        // Konstruktor mit einem int baut einen StringBuilder mit der capacity = Zahl
        StringBuilder sb4 = new StringBuilder(100);
        System.out.println(sb4.length()); // 0
        System.out.println(sb4.capacity()); // 100

        System.out.println();
        sb4.ensureCapacity(50); // Stellt sicher, dass die capacity ausreicht
        System.out.println(sb4.length()); // 0
        System.out.println(sb4.capacity()); // 100

        System.out.println();
        sb4.ensureCapacity(150); // Stellt sicher, dass die capacity ausreicht
        System.out.println(sb4.length()); // 0
        System.out.println(sb4.capacity()); // 202
    }
}
