package de.lubowiecki;

public class Person {

    // Komplexe Datentypen (d.h. Klassen-Typen) bekommen als Standard null

    private static int anzahl = 0;

    private String vorname = "Unbekannt";
    private String nachname = "Unbekannt";

    public Person() {
    }

    // Person(String, String)
    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        anzahl++;
    }

    // Person(String)
    public Person(String nachname) {
        this.vorname = "Unbekannt";
        this.nachname = nachname;
        anzahl++;
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
                '}';
    }

    @Override
    protected void finalize() { // Destructor
        System.out.println("Ich wurde vom GC abgeholt...");
    }
}
