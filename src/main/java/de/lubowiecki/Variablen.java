package de.lubowiecki;

public class Variablen {

    // Klassenvariablen: Gibt es nur 1x
    static int zahl;

    // Instanzvariablen: Gehört den Objekt
    int andereZahl;

    public static void main(String[] args) {

        // lokale Variable: Nur da, wenn die Methode gerade ausgeführt wird
        int ganzAndereZahl = 10;
        machWas(); // Methode wird ausgeführt

        Variablen v1 = new Variablen(); // Aus Klasse wird ein Objekt erzeugt
        v1.andereZahl = 15;
        v1.zahl = 100;

        Variablen v2 = new Variablen();
        v2.andereZahl = 30;
        v2.zahl = 200;

        System.out.println(v1.andereZahl);
        System.out.println(v1.zahl);
        System.out.println(v2.andereZahl);
        System.out.println(v2.zahl);

    }

    private static void machWas() {
        int lokaleVariable = 10;
    }
}
