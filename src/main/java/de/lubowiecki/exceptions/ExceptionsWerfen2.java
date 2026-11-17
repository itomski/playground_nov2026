package de.lubowiecki.exceptions;

public class ExceptionsWerfen2 {

    public static void main(String[] args) {

        int alter = -15;
        try {
            boolean altGenug = checkAlter(alter);
            System.out.println(altGenug);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

            System.out.println(e.getCause()); // Grund für die Exception

            // StackTrace
            for(StackTraceElement el : e.getStackTrace()) {
                System.out.println(el);
            }

            e.printStackTrace();

            //throw new RuntimeException("Dies und das", e); // Eine neue Exception auf Basis der alten werfen
        }
    }

    // Uncheked Exceptions können als Information per throws angekündigt werden - angabe ist optional
    private static boolean checkAlter(int alter) throws IllegalArgumentException {
        if(alter < 0) {
            throw new IllegalArgumentException("Wert kleiner als 0");
        }
        else if(alter > 18) {
            return true;
        }
        else {
            return false;
        }
    }

    // Exception ist checked
    private static void werfeException() throws Exception {

        // throw new Exception(); // parameterlos
        throw new Exception("Das ist die Nachricht"); // mit einer Nachricht
        // throw new Exception("Das ist die Nachricht", new NullPointerException()); // mit Nachricht und Grund
        // throw new Exception(new NullPointerException()); // mit Grund

        // String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace
        // throw new Exception("Das ist die Nachricht", new NullPointerException(), true, true);
    }
}
