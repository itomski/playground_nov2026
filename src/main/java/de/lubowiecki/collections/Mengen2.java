package de.lubowiecki.collections;

import java.util.*;

public class Mengen2 {

    public static void main(String[] args) {

        Set<Thing> things = new HashSet<>();
        things.add(new Thing("Hammer"));
        System.out.println();
        things.add(new Thing("Zange"));
        System.out.println();
        things.add(new Thing("Hammer"));
        System.out.println();
        things.add(new Thing("Tasse"));
        System.out.println();
        things.add(new Thing("Stift"));

        things = new TreeSet<>(things);

        System.out.println();

        System.out.println(things);

        System.out.println();

        // Wie HashSet, behält aber die Einfügereihenfolge bei
        Set<String> namen = new LinkedHashSet<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Scott");
        System.out.println(namen);

        System.out.println();

        // Ist IMMER sortiert
        namen = new TreeSet<>(namen);
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Scott");
        System.out.println(namen);

    }
}

// Comparable = Natürliche Reihenfolge
class Thing implements Comparable<Thing> {

    private String name;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Thing o) {
        return name.compareTo(o.name);
    }
}
