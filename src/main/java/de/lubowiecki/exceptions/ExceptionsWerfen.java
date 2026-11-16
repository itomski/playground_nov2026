package de.lubowiecki.exceptions;

public class ExceptionsWerfen {

    public static void main(String[] args) {

        try {
            int erg = berechne(10, 15); // Checked Exception MUSS behandelt werden
            System.out.println(erg);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static int berechne(int a, int b) throws Exception {
        if(a > 0 && b > 0) {
            return a * b;
        }
        // Wenn eine Exception geworfen wird, muss kein Rückgabewert folgen
        //throw new RuntimeException("Eingabe ungültig"); // RuntimeException (unchecked) wird geworfen!
        throw new Exception("Eingabe ungültig"); // Exception (checked) wird geworfen!
    }

}