package de.lubowiecki;

import java.util.Objects;

// Die Elternklasse alle Klassen ist Object
public class Person implements Comparable<Person> {

    // Komplexe Datentypen (d.h. Klassen-Typen) bekommen als Standard null

    private static int anzahl = 0;

    private String vorname = "Unbekannt";
    private String nachname = "Unbekannt";
    private int alter;

    // 1
    public Person() {
        // super(); // wird automatisch aufgerufen
        anzahl++;
        System.out.println("1");
    }

    // Person(String, String)
    public Person(String vorname, String nachname) {
        this(); // Ruft den parameterlosen Konstruktor auf
        this.vorname = vorname;
        this.nachname = nachname;
        System.out.println("2");
    }

    // Person(String)
    public Person(String nachname) {
        this("Unbekannt", nachname);
        System.out.println("3");
    }

    public Person(String vorname, String nachname, int alter) {
        this(vorname, nachname); // Aufruf eines anderen Konstruktors muss IMMER als erste Anweisung erfolgen
        this.alter = alter;
        System.out.println("4");
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public static int getAnzahl() {
        int anzahl = 10;
        return Person.anzahl; // Zugriff auf die Klassenvariable
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                '}';
    }

    @Override
    protected void finalize() { // Destructor
        System.out.println("Ich wurde vom GC abgeholt...");
    }


    @Override
    public int compareTo(Person other) {
        // Programmierer entscheidet in dieser Methode, auf Basis welcher Eigenschaften der Vergleich erfolgen soll
        // Da diese Methode nur 1x eingebaut werden kann, beschreibt sie die Natürliche-Ordnung
        // - = kleiner
        // + = größer
        // 0 = gleich
        return alter - other.alter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return alter == person.alter && Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    // hashCode und equals sollten auf den gleichen Eigenschaften basieren
    @Override
    public int hashCode() {
        // Objects eine Hilfsklasse mit statischen Methoden für Objekte
        return Objects.hash(vorname, nachname, alter);
    }
}
