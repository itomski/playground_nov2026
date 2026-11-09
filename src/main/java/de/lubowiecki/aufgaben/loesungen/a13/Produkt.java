package de.lubowiecki.aufgaben.loesungen.a13;

import java.time.LocalDate;

public class Produkt {

    private String name;
    private String beschreibung;
    private String aufgenommenAm;
    private int menge;
    private double preis;

    public Produkt() {
        this.aufgenommenAm = LocalDate.now().toString(); // ISO
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getAufgenommenAm() {
        return aufgenommenAm;
    }

    public void setAufgenommenAm(String aufgenommenAm) {
        this.aufgenommenAm = aufgenommenAm;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", aufgenommenAm='" + aufgenommenAm + '\'' +
                ", menge=" + menge +
                ", preis=" + preis +
                '}';
    }
}
