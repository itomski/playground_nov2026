package de.lubowiecki.lambdas;

public class Basics {

    public static void main(String[] args) {

        // Implementierung der abstrakten run-Methode aus MyLambda
        // void run(String txt);
        MyLambda func1 = (text) -> System.out.println(text.toUpperCase());
        func1.run("Dies und das...");

        MyLambda func2 = (text) -> System.out.println(text.substring(0,5) + "...");
        func2.run("Dies und das...");

        MyLambda func3 = (text) -> {
            System.out.println(text.substring(5));
            System.out.println("XYZ");
        };
        func3.run("Dies und das...");

        // int roll();
        RandomNumber w6 = () -> (int)(Math.random() * 6) + 1;
        RandomNumber w10 = () -> (int)(Math.random() * 10) + 1;
        RandomNumber w20 = () -> (int)(Math.random() * 20) + 1;

        System.out.println(w6.roll());
        System.out.println(w6.roll());
        System.out.println(w6.roll());
        System.out.println(w10.roll());
        System.out.println(w10.roll());
        System.out.println(w10.roll());
        System.out.println(w20.roll());
        System.out.println(w20.roll());
        System.out.println(w20.roll());
    }
}

@FunctionalInterface
interface MyLambda {

    void run(String txt);

}

interface RandomNumber {

    int roll();

}