package de.lubowiecki.aufgaben.loesungen.a25;

public class Roboter {

    private String name;
    private Antrieb antrieb;
    private Kommunikation kommunikation;
    private Arbeitseinheit arbeitseinheit;

    public Roboter(String name, Antrieb antrieb, Kommunikation kommunikation, Arbeitseinheit arbeitseinheit) {
        this.name = name;
        this.antrieb = antrieb;
        this.kommunikation = kommunikation;
        this.arbeitseinheit = arbeitseinheit;
    }

    public void bewegen() {
        // Der Aufruf wird an das Modul delegiert
        System.out.println(name + ": " + antrieb.bewegen());
    }

    public void kommunizieren() {
        System.out.println(name + ": " + kommunikation.kommunizieren());
    }

    public void arbeiten() {
        System.out.println(name + ": " + arbeitseinheit.arbeiten());
    }
}
