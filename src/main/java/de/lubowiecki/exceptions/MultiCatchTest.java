package de.lubowiecki.exceptions;

public class MultiCatchTest {

    public static void main(String[] args) {

        try {
            String str = "Das ist das Haus von Nikigraus";
            String[] teile = str.split(" ");
        }
        // Aufzählung der Exceptions, die extra behandelt werden MÜSSEN
        catch(NullPointerException | ArrayIndexOutOfBoundsException e) { // Multicatch
            System.out.println("Problem 1");
        }
        catch(RuntimeException e) {
            System.out.println("Problem 2");
        }
        finally { // Wird immer ausgeführt
            System.out.println("IMMER");
        }

        // Mögliche Kombinationen - Reihenfolge beachten
        // try-catch
        // try-catch-catch...
        // try-catch-catch...-finally
        // try-finally

        // Nur try-with-ressources darf alleine stehen
    }
}
