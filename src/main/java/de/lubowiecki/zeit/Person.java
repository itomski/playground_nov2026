package de.lubowiecki.zeit;

import java.time.LocalDate;

public class Person implements Comparable<Person> {

    private static int count;
    private int id;
    private String vorname;
    private String nachname;
    private LocalDate geburtsDatum;

    public Person() {
        this.id = ++count;
    }

    public Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this();
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    public int getId() {
        return id;
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

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public String getGeburtsDatumFormatiert() {
        return geburtsDatum.format(Utils.DATE_FMT);
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(getGeburtsDatumFormatiert());
        sb.append('}');
        return sb.toString();
    }

    // Um Java zu erklären, wie Personen sortiert werden MUSS das Comparable-Interface implementiert werden
    @Override
    public int compareTo(Person other) {
        //return vorname.compareTo(other.vorname); // Nach Vorname
        //return nachname.compareTo(other.nachname); // Nach Nachname
        return geburtsDatum.compareTo(other.geburtsDatum); // Nach Geburtsdatum
    }
}
