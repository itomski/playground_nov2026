package de.lubowiecki.exceptions;

public class FinalyTest {

    public static void main(String[] args) {

        int v = getValue();
        System.out.println(v);

    }

    public static int getValue() {
        try {
            throw new RuntimeException("E1");
            // throw new String("ABC"); // Muss eine Kindklasse von Thowable sein
            // return 5; // Nicht erreichbar
        }
        catch (RuntimeException e) {
            //throw new RuntimeException("E2");
            throw e;
        }
        finally {
            return 10; // Überschreibt die Rückgabe oder die Exception der Methode
        }
    }
}
