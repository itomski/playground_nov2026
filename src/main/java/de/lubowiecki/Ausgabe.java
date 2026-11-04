package de.lubowiecki;

public class Ausgabe {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker");
        System.out.println(p1.toString());
        System.out.println(p1); // toString wird bei Ausgabe von Objekten automatisch aufgerufen
        System.out.println(p1.hashCode());

        Person p2 = new Person();
        String str = p2.toString(); // Konvertierung in String
        p2 = null;
        System.out.println(p2);
        System.out.println(p2.getVorname()); // NullPointerException


    }
}
