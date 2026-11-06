package de.lubowiecki;

public class Overloading {

    public static void main(String[] args) {

        // Überladen = Methodenname bleibt gleich, aber die Parameterliste ändert sich

        // Ganzzahlen-Literale sind automatisch int
        // Kommazahlen-Literale sind automatisch double

        // Wrapper
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        byte b = 1;
        doSomething(b);
        doSomething(1);
        //doSomething(1.5);

        // 1. Methode mit einem passenden Typ
        // 2. primitive Widening
        // 3. Autoboxing
        // 4. VarArg
        // 5. Error

        System.out.println(1);
        System.out.println("1");
        System.out.println(1.0);
    }

    private static void doSomething(byte v) {
        System.out.println("byte");
    }

    private static void doSomething(Byte v) {
        System.out.println("Byte");
    }

    private static void doSomething(int v) {
        System.out.println("int");
    }

    private static void doSomething(int... v) {
        System.out.println("VarArg");
    }

    private static void doSomething(float v) {
        System.out.println("float");
    }

    private static void doSomething(double v) {
        System.out.println("double");
    }


}
