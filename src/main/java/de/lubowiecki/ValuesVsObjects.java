package de.lubowiecki;

public class ValuesVsObjects {

    public static void main(String[] args) {

        var vorname1 = "Peter";
        var nachname1 = "Parker";
        var alter1 = 25;

        var vorname2 = "Bruce";
        var nachname2 = "Banner";
        var alter2 = 42;

        printPerson(vorname1, vorname2, alter2);

        System.out.println();
        String[] p1 = {"Peter", "Parker", "25"};
        printPerson(p1);

        System.out.println();
        Person p2 = new Person("Peter", "Parker", 25);
        printPerson(p2);

        System.out.println();
        Person p3 = new Person("Peter", "Parker");

        System.out.println();
        Person p4 = new Person("Bruce");

        System.out.println(p4.hashCode());
        System.out.println(p4.equals(p3));
        System.out.println(p4.getClass().getName());
    }

    private static void printPerson(String vorname, String nachname, int alter) {
        System.out.println("Mein Name ist " + vorname + " " + nachname + ". Ich bin " + alter + " Jahre alt.");
    }

    private static void printPerson(String[] person) {
        System.out.println("Mein Name ist " + person[0] + " " + person[1] + ". Ich bin " + person[2] + " Jahre alt.");
    }

    private static void printPerson(Person person) {
        System.out.println("Mein Name ist " + person.getVorname() + " " + person.getNachname() + ". Ich bin " + person.getAlter() + " Jahre alt.");
    }
}
