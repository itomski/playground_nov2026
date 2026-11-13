package de.lubowiecki.oop;

public class AbstractClassVsInterface {

    public static void main(String[] args) {

        // Abstrakte Klassen sind NICHT vollständig
        // Können aber fertige Methoden mit verschiedenen Access-Modifiern vererben
        // Können Eigenschaften und Konstruktoren enthalten
        // Zweck: Vererbung von Funktionalitäten und Eigenschaften, die in den Kindklassen vervollständigt werden
        // Nur Einfachvererbung möglich
        // Kann als Referenztyp verwendet werden

        // Interface ist 100% abstrakt
        // Methoden sind IMMER public und IMMER* abstrakt
        // Es werden Methodenköpfe definiert
        // Haben keine Kunstruktoren
        // Alle Eigenschaften sind Konstanten
        // Zweck: Stellt sicher, dass bestimme Methode in den Kindklassen eingebaut werden
        // Auch Mehrfachvererbung möglich
        // Kann als Referenztyp verwendet werden

        // * default Methoden sind seit 1.8 möglich
    }
}
