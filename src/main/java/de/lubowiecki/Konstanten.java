package de.lubowiecki;

public class Konstanten {

    // Klassenkonstante
    public static final String TEXT = "Das ist das Haus von Nikigraus!";

    public final int ZAHL = 10; // Muss spätestens im Konstruktor zugewiesen werden

    public static void main(String[] args) {

        System.out.println(TEXT);
        // TEXT = "..."; // Geht nicht! Ist konstant

        final int a = 100;
        // a = 110; // Geht nicht! Ist konstant
        System.out.println(a);

        // System.out.println(ZAHL); // Instanzkonstanten sind nur über ein Objekt erreichbar

        Konstanten k = new Konstanten();
        System.out.println(k.ZAHL); // OK

        // Bei Objektreferenzen heißt final, dass die Referenz nicht auf ein anderes Objekt zeigen kann
        // Der Zustand des Objektes darf sich aber ändern
        final Person p = new Person();
        p.setVorname("Toni");
        System.out.println(p);
        // p = new Person("Peter", "Parker"); // p ist final. Geht nicht
    }
}
