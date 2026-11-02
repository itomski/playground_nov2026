package de.lubowiecki;

public class FirstSteps {

    // Namenskonventionen

    // PascalCase: beginnt mit groß
    // Wird für Klassennamen verwendet

    // camelCase: beginnt klein
    // Variablen und Methoden

    // snake_case
    // ggfl. für lokale Variablen

    // SCREAMING_SNAKE_CASE
    // Konstanten

    // kebap-case: Wird in Java NICHT verwendet

    public static void main(String[] args) { // Einstiegspunkt

        int alter = 10; // Datentyp muss nur bei der Deklaration angegeben werden
        alter = 15; // Wertänderung

        // Der Datentyp für die Varaible wird bei der Deklaration automatisch ermittelt
        var name = "Peter"; // String-Variable
        // name = 15; // Error: Falscher Datentyp

        // String ist ein komplexer Datentyp
        String andererName = "Bruce";

        System.out.println("Ich bin " + alter + " Jahre alt");
        System.out.println("Peter ist auch " + alter + " Jahre alt");
        System.out.println("Peter ist auch " + 25 + " Jahre alt");

    }
}
