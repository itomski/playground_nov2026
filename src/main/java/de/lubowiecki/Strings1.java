package de.lubowiecki;

public class Strings1 {

    public static void main(String[] args) {

        String s = "Hallo";
        s = s + " String";
        System.out.println(s);

        System.out.println();

        String s1 = "Hallo"; // erzeugt ein String-Objekt im String-Pool, wenn es das noch nicht gibt
        String s2 = "Hallo";
        String s3 = new String("Hallo"); // new erzeugt IMMER ein neues String Objekt auf dem Heap

        // == bei primitiven Werten vergleicht den Wert
        // == bei komplexen Datentypen/Objekten vergleicht, ob es das gleiche Objekt auf dem Heap ist

        System.out.println(s1 == s2); // Zeigt s1 und s2 auf das gleiche Objekt?
        System.out.println(s1 == s3);

        // Bei Objekten vergleicht equals den Zustand/Inhalt
        System.out.println(s1.equals(s3));

        System.out.println();

        String text = "   Das ist ein Haus von Nikigraus!      ";

        // Strings sid Immutable
        text.toLowerCase(); // Kleinbuchstaben

        // Änderungsmethoden von String produzieren IMMER einen neuen String
        text = text.toUpperCase(); // Großbuchstaben
        text = text.trim(); // Schneidet Leerzeichen und Tabs an beiden Enden ab

        System.out.println(text);

        String s5 = 10 + "";
        s5 = String.valueOf(10); // Konvertierung in String

        String name = "Peter";
        String ausgabe = String.format("Mein Name ist %s \n", name); // Liefert einen Formatierten String zurück
        System.out.printf("Mein Name ist %s \n", name); // Sofortige Ausgabe auf der Konsole
        System.err.printf("Mein Name ist %s \n", name); // Sofortige Ausgabe auf der Konsole
        System.out.println(ausgabe);

        // System.in = Eigabestrom
        // System.out = Ausgabestrom
        // System.err = Ausgabestrom für Exceptions und Errors

        System.out.println();
        ausgabe = String.join(",\n\t\t", "Peter", "Bruce", "Carol");
        System.out.println(ausgabe);

        System.out.println();

        text = "Das ist das Haus von Nikigraus";
        String[] teile = text.split(" ");
        for(String teil : teile) {
            System.out.println(teil);
        }

        System.out.println();
        text = "LLLUUUROOxyz";
        teile = text.toUpperCase().split(""); // In einzelne Zeichen
        for(String teil : teile) {
            switch(teil) {
                case "L" -> System.out.println("Links");
                case "R" -> System.out.println("Rechts");
                case "O" -> System.out.println("Oben");
                case "U" -> System.out.println("Unten");
                default -> System.out.println("Unbekannt");
            }
        }

        System.out.println();
        text = "Das ist das Haus von Nikigraus!";
        int letztesLeerzeichen = text.lastIndexOf(" ");
        String teil = text.substring(letztesLeerzeichen + 1);
        System.out.println(teil);

        name = " peTER  ";
        name = name.trim() // Leerzeichen an den Enden entfernen
                .toLowerCase(); //Kleinbuchstaben

        // name = null;
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1));

    }
}
