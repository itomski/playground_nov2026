package de.lubowiecki;

import java.util.ArrayList; // ArrayList wird importiert - Klasse kann über ihren Namen verwendet werden
// Es können keine zwei Klassen mit dem gleichen Namen importiert werden

import java.util.random.*; // Importiert alle Klassen aus dem Package. Importiert keine Subpackages

// Importiert das statische Inventar (Eigenschaften/Methoden/Innere-Klassen)
import static java.lang.Math.*;
import static de.lubowiecki.Wochentag.*; // Importiert alle Konstanten des ENUMs

// Reihenfolge der Schlüsselwörter ist WICHTIG!
import static java.lang.System.out;

import java.util.Date;

public class StatischeImports {

    public static void main(String[] args) {

        // Normale Imports importieren Klassen

        // Wenn kein Import vorhanden: fully-qualified
        java.util.ArrayList<String> liste = new java.util.ArrayList<>();

        Date d1; // Importierte Klasse
        java.sql.Date d2; // Kann nicht mehr importiert werden und muss fully-qualified genutzt werden

        System.out.println(Math.PI); // ohne eines statischen Imports
        System.out.println(PI); // mit einem statischen Import

        System.out.println(Math.pow(5, 2)); // ohne eines statischen Imports
        System.out.println(pow(5, 2)); // mit einem statischen Import

        // Alle Klassen aus java.lang sind automatisch importiert
        // Das statische Inventar der Klassen in java.lang ist NICHT automatisch importiert!!!

        System.out.println(Wochentag.DO); // ohne eines statischen Imports
        System.out.println(DO); // mit einem statischen Import

        out.println("Das ist das Haus von Nikigraus"); // mit einem statischen Import
    }
}
