package de.lubowiecki.lambdas;

import de.lubowiecki.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.IntStream;

public class BuildInTest {

    public static void main(String[] args) {

        // Consumer

        List<String> namen = new ArrayList<>();
        namen.addAll(List.of("Peter", "Bruce", "Carol", "Steve", "Natasha"));

        Consumer<String> cons = v -> System.out.println(v);
        namen.forEach(cons);

        namen.forEach(v -> System.out.println(v));

        namen.forEach(System.out::println); // Methoden Referenz

        System.out.println();

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker"));
        personen.add(new Person("Steve", "Rogers"));
        personen.add(new Person("Carol", "Danvers"));
        personen.add(new Person("Scott", "Lang"));

        personen.forEach(p -> System.out.println(p.getVorname().charAt(0) + ". " + p.getNachname()));

        System.out.println();

        // Function
        Function<String, Integer> stringToInteger = s -> Integer.parseInt(s);
        int i = stringToInteger.apply("122");
        System.out.println(i);

        Function<Person, String> personToString = p -> p.getVorname() + " " + p.getNachname();
        Person peter = personen.get(0);
        String str = personToString.apply(peter);
        System.out.println(str);

        // Function<T,R>
        // R apply(T t)
        //Function<Person, Integer> personToInteger = p -> p.getAlter();
        Function<Person, Integer> personToInteger = Person::getAlter; // Methoden-Referenz

        // Funktion mit zwei Eingangswerten
        BiFunction<String, String, Person> stringsZuPerson = (v, n) -> new Person(v, n);
        Person p = stringsZuPerson.apply("Bruce", "Banner");

        // Supplier
        Random rand = new Random();
        String[] vornamen = {"Peter", "Bruce", "Steve", "Carol", "Natasha"};
        String[] nachnamen = {"Parker", "Banner", "Rogers", "Danvers", "Romanov"};

        System.out.println();

        // R get()
        Supplier<Person> randPerson = () -> {
            String vorname = vornamen[rand.nextInt(vornamen.length)];
            String nachname = nachnamen[rand.nextInt(nachnamen.length)];
            return new Person(vorname, nachname);
        };

        // Fabrik = Methode, die ein Objekt erzeugt
        Person p1 = randPerson.get();
        Person p2 = randPerson.get();
        Person p3 = randPerson.get();
        Person p4 = randPerson.get();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println();

        // Erzeugt primitive Werte (IntSupplier, LongSupplier, DoubleSupplier)
        IntSupplier w6 = () -> (int)(Math.random() * 6) + 1; // Generiert Zahlen zwischen 1 und 6

        // Streams
        IntStream.generate(w6)
                .limit(100)
                .forEach(j -> System.out.println(j));

        System.out.println();

        // Predicate

        Predicate<String> startetMitS = s -> s.startsWith("S");
        Predicate<String> endetMitT = s -> s.endsWith("t");
        Predicate<String> minLength10 = s -> s.length() >= 10;

        Predicate<String> comboPred = startetMitS.and(endetMitT).and(minLength10); // Verbindet mehrere Predicates

        System.out.println(startetMitS.test("Steve"));
        System.out.println(endetMitT.test("Steve"));
        System.out.println(minLength10.test("Steve"));

        System.out.println(comboPred.test("Selrnr rwekerre rekherert"));

        List<Integer> zahlen = new ArrayList<>(List.of(10, 17, 22, -5, 18, 0, -100, 1125));
        System.out.println(zahlen);
        zahlen.removeIf(j -> j < 0 || j > 100);
        System.out.println(zahlen);

        System.out.println();

        UnaryOperator<String> upper = s -> s.toUpperCase();
        namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Steve", "Natasha"));
        System.out.println(namen);
        namen.replaceAll(upper); // wird auf jedes Element angewendet
        System.out.println(namen);

    }
}
