package de.lubowiecki.aufgaben;

public class Aufgabe36 {

    /*
    Schreibe ein FunctionalInterface das einen Methode execute hat die zwei double Werte entgegennimmt und
    einen double Wert zurückgibt.

    Implementiere 4 Grundrechenarten damit und probiere es aus.
    */

    public static void main(String[] args) {

        MathOperation add = (a1, a2) -> a1 + a2;
        System.out.println(add.execute(10, 22));

        MathOperation mod = (a, b) -> a % b;
        System.out.println(mod.execute(10, 3));

        Addition addition = new Addition();
        System.out.println(addition.execute(10, 22));


        // Anonyme Klasse
        // Neue Klasse ohne Namen die das Interface implementiert und sofort einmalig instanziert wird
        MathOperation sub = new MathOperation() {
            @Override
            public double execute(double a, double b) {
                return a - b;
            }
        };

        System.out.println(sub.execute(10, 4));

        final int x1 = 100;
        int x2 = 100; // effektiv final = nicht als final markiert aber verändert sich nicht
        // Klassen oder Instanzvariablen müssen NICHT final oder effektiv final sein
        MathOperation specialAdd = (a1, a2) -> a1 + a2 + x1 + x2;

    }
}

@FunctionalInterface
interface MathOperation {

    double execute(double a, double b);;

}

class Addition implements MathOperation {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
