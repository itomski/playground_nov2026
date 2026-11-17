package de.lubowiecki.exceptions;

public class ExceptionsWerfen3 {

    public static void main(String[] args) {

        try {
            System.out.println(checkAlter(-15));
        }
        catch (WertZuNiedrigException e) {
            System.out.println("Zu niedrig");
        }
        catch (WertZuHochException e) {
            System.out.println("Zu hoch");
        }

    }

    private static boolean checkAlter(int alter) throws WertZuNiedrigException, WertZuHochException {
        if(alter < 0) {
            throw new WertZuNiedrigException();
        }
        else if(alter > 120) {
            throw new WertZuHochException();
        }
        else if(alter > 18) {
            return true;
        }
        else {
            return false;
        }
    }
}

// Ist die Parent-Klasse checked, ist die Custom Exception auch checked.
// Ist die Parent-Klasse unchecked, ist die Custom Exception auch unchecked (Child von RuntimeException).

class WertZuNiedrigException extends IllegalArgumentException {

    public WertZuNiedrigException() {
        super("Wert ist zu niedrig");
    }
}

class WertZuHochException extends IllegalArgumentException {

    public WertZuHochException() {
        super("Wert ist zu hoch");
    }
}
