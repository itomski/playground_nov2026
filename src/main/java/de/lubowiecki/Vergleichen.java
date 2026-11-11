package de.lubowiecki;

public class Vergleichen {

    public static void main(String[] args) {

        System.out.println(10 == 10);
        System.out.println(10.5 == 10);

        // == vergleicht, ob es das gleiche Objekt auf dem Heap ist
        System.out.println("Hallo" == "Hallo"); // String-Literal-Pool
        System.out.println("Hallo" == "hallo");
        String h = new String("Hallo");
        System.out.println("Hallo" == h); // Nicht das gleiche Objekt auf dem Heap
        System.out.println("Hallo".equals(h)); // Hat den gleichen Inhalt

        Person p1 = new Person("Peter", "Parker", 25);
        Person p2 = new Person("Peter", "Parker", 25);
        System.out.println(p1 == p2); // Ist es das gleiche Objekt auf dem Heap?
        System.out.println(p1.equals(p2)); // Hat es den gleichen Inhalt?

        // Objekte, die per equals gleich sind, sollten den gleichen Hashcode ergeben
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        // Jede eigene Klasse sollte equals selbst implementieren
        // Die equals-Methode erklärt Java, wie zwei Objekte des gleich Typs verglichen werden
    }
}
