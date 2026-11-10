package de.lubowiecki.aufgaben.loesungen.a17;

public class App {

    public static void main(String[] args) {

        Rechner.add(10, 15);
        Rechner.add(7, 10.5);
        Rechner.add(1.2, 18);
        Rechner.sub(1.2, 18);
        Rechner.sub(20, 18);

        System.out.println(Rechner.getProtokoll());

    }
}
