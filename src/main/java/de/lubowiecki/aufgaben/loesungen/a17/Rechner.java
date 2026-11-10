package de.lubowiecki.aufgaben.loesungen.a17;

public class Rechner {

    //private static String protokoll = "";
    private static final StringBuilder protokoll = new StringBuilder();

    public static double add(double a, double b) {
        double erg = a + b;
        //protokoll += a + " + " + b + " = " + erg + "\n";
        addToProtokoll(a, b, "+", erg);
        return erg;
    }

    public static double sub(double a, double b) {
        double erg = a - b;
        addToProtokoll(a, b, "-", erg);
        return erg;
    }

    public static double multi(double a, double b) {
        double erg = a * b;
        addToProtokoll(a, b, "*", erg);
        return erg;
    }

    public static double div(double a, double b) {
        double erg = a / b;
        addToProtokoll(a, b, "/", erg);
        return erg;
    }

    private static void addToProtokoll(double a, double b, String operator, double result) {
        protokoll.append(a).append(" ")
                .append(operator)
                .append(" ").append(b)
                .append(" = ")
                .append(result)
                .append("\n");
    }

    public static String getProtokoll() {
        return protokoll.toString();
    }
}