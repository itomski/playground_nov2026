package de.lubowiecki;

public class Casting {

    public static void main(String[] args) {

        int i = 10;
        byte b = 15;
        double d = 10.5;
        short s = 12;

        //short shSum = b + s; // mind. zu int
        int iSum = b + s;
        double dSum = b + d; // der kleinere promiviert IMMER zum größeren Typ

        System.out.println(b + (byte)d); // der double verliert die Nachkommastelle

        d = 300.5;
        System.out.println((byte)d); // Überfüllt
        System.out.println(b + (byte)d); // der double verliert die Nachkommastelle

        b = 125;
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b++);
        // Durch einen Cast wird die Umwandlung erzwungen, was zum Über- oder Unterlauf führen kann

        int j; // Deklaration
        j = 10; // Initialisierung
        System.out.println(j); // Ohne Initialisierung darf ich eine lokale Variable nicht benutzten

    }
}
