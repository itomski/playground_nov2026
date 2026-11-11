package de.lubowiecki.aufgaben.loesungen.a20;

public class Start {

    public static void main(String[] args) {

//        KaffeeProdukt p1 = new KaffeeProdukt(25, 100, 150); // Klasse ist abstract
//        System.out.println(p1);

        Espresso e1 = new Espresso();
        System.out.println(e1);

        Cappuccino c1 = new Cappuccino();
        System.out.println(c1);

        // KaffeeProdukt (links): Referenztyp
        // Cappuccino (rechts): Objekttyp

        // Cappuccino IS-A KaffeeProdukt
        KaffeeProdukt produkt = new Cappuccino();
        produkt = new Amercano();
        produkt = new Espresso();
        // Auf eine Referenz können Objekt einer Klasse und ihrer Kindklassen abgelegt werden

        // Alle Subklassen von KaffeeProdukt können dort genutzt werden, wo ein KaffeeProdukt verlangt wird
        printKaffee(new Espresso());
        printKaffee(new Cappuccino());
        printKaffee(new Amercano());

        // IS-A Beziehung entsteht durch Vererbung
        // Objekt einer Kindklasse IS-A Objekt der Elternklasse
    }

    private static void printKaffee(KaffeeProdukt produkt) {
        System.out.println("\n---------------------------------------------");
        System.out.println(produkt);
        // Hier kann unabhängig von dem Objekttyp nur das verwendet werden, was im Referenztyp vorhanden ist
        System.out.println("---------------------------------------------\n");
    }

}
