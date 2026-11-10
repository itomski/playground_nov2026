package de.lubowiecki;

import java.util.ArrayList;

public class Listen2 {

    private static ArrayList<Person> personen = new ArrayList<>();

    public static void main(String[] args) {

        Person p = new Person("Peter", "Parker", 25);
        personen.add(p);

        personen.add(new Person("Bruce", "Banner", 42));

        for(Person person : personen) {
            System.out.println(person);
        }

        System.out.println(personen);

        System.out.println("--------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);


    }
}
