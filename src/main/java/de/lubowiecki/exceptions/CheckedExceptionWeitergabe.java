package de.lubowiecki.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CheckedExceptionWeitergabe {

    public static void main(String[] args) {
        System.out.println("main START");
        // Main-Methode ist die letzte Möglichkeite die Exception zu behandeln
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("Behandlung in main");
        }
        System.out.println("main ENDE");
    }

    private static void methodA() throws IOException {
        System.out.println("methodA START");
        methodB();
        System.out.println("methodA ENDE");
    }

    private static void methodB() throws IOException {
        System.out.println("methodB START");
        methodC(); // handle or declare
        System.out.println("methodB ENDE");
    }

    // throws = könnte eine Checked Exception werfen
    private static void methodC() throws IOException {
        System.out.println("methodC START");
        // Checked Exception: handle or declare
        // = Programmierer muss sich kümmern, egal ob die Exception tatsächlich auftaucht
//        try {
            Writer out = new FileWriter("datei.txt");
//        }
//        catch (IOException e) {
//            System.out.println("Behandelt in C");
//        }
        System.out.println("methodC ENDE");
    }
}
