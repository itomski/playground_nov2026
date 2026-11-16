package de.lubowiecki.exceptions;

public class UncheckedExceptionWeitergabe {

    public static void main(String[] args) {
        System.out.println("main START");
        try {
            methodA();
        }
        catch(NullPointerException e) {
            System.out.println("Exception behandelt in main");
        }
        System.out.println("main ENDE");
    }

    private static void methodA() {
        System.out.println("methodA START");
        methodB();
        System.out.println("methodA ENDE");
    }

    private static void methodB() {
        System.out.println("methodB START");
        methodC();
        System.out.println("methodB ENDE");
    }

    private static void methodC() {
        System.out.println("methodC START");
        try {
            String text = null;
            // UncheckedExceptions werden automatisch an den Aufrufer weitergereicht, wenn sie nicht behandelt wurden
            char first = text.charAt(0);
        }
        catch(NullPointerException e) {
            System.out.println("Exception behandelt in C");
        }
        System.out.println("methodC ENDE");
    }
}
