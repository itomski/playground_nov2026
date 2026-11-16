package de.lubowiecki.exceptions;

public class CatchTest {

    public static void main(String[] args) {

        String text = null;

        // tray darf nicht alleine stehen

        try {
            System.out.println("Vor der Exception");
            // System.out.println(text.toUpperCase());
            // Bei einer Exception wird der try-Block sofort unterbrochen
            // und Java springt in einen passenden Catch-Block
            // System.out.println(10 / 0);
            int[] arr = new int[10];
            arr[10] = 100;
            System.out.println("Nach der Exception");
        }
        // Es kann mehrere Catch-Blöcke geben, die unterschiedliche Exceptions fangen.
        // Die Catch-Blöcke schließen sich gegenseitig aus
        catch(NullPointerException e) { // e ist der Namen der Variable, NullPointerException ist der Datentyp
            System.out.println("Problem: Null-Pointer");
            // Nach dem Catch ist die Exception erledigt und das Programm kann weiter fortgesetzt werden
        }
        catch (ArithmeticException e) {
            System.out.println("Problem: Arithmetic");
        }
        catch (RuntimeException e) {
            System.out.println("Problem: Andere Laufzeit-Exceptions");
        }
        catch (Exception e) {
            System.out.println("Problem: alle anderen Exceptions");
        }
        // Nach unten wird man immer genereller

        System.out.println("...");
    }
}
