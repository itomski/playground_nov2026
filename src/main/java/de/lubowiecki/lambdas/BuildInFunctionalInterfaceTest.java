package de.lubowiecki.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class BuildInFunctionalInterfaceTest {

    public static void main(String[] args) {

        Printer uppercase = (t) -> System.out.println(t.toUpperCase());
        uppercase.print("Das ist ja super!");

        // void accept(T t);
        Consumer<String> uppercase2 = t -> System.out.println(t.toUpperCase());
        uppercase2.accept("Das ist ja super!");

        Consumer<Integer> zumQuadrat = i -> System.out.println(i * i);
        zumQuadrat.accept(5);

        // R apply(T t, U u);
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BinaryOperator<Double> multi = (a, b) -> a * b;

    }
}

@FunctionalInterface
interface Printer {

    void print(String text);

}

