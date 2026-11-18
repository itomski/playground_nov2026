package de.lubowiecki;

public class Datentypen2 {

    public static void main(String[] args) {

        // Primitiv
        // byte < short < int < long < float < double
        //         char <

        // Automatisches primitive widening

        byte a = 10;
        int b = a; // primitive widening für a von byte auf int
        double c = a; // primitive widening für a von byte auf double
        // primitive narrowing nur mit einem Cast möglich

        //a = c; // Error!
        a = (byte)c; // Ok. Über- oder Unterlauf möglich
        a++; // a = (byte)(a + 1) // Über- oder Unterlauf möglich

        // Wrapper
        Integer i = 10; // Autoboxing von int(primitiv) auf Integer(wrapper)
        // Wrapperobjekte haben Methoden
        // primitive Datentypen haben KEINE Methoden

        //Long l = 100; // Zuerst Autoboxing von int auf Ineteger, dann komplex Widening... Error

        Long l = 100L; // Autoboxing von long auf Long

        Number n = 100; // Autoboxing zu Integer und komplex Widening von Integer zu Number... Ok

        double d = l; // Ok: Autounboxing von Long auf long, primitive Widening von long auf double

        System.out.println(l.longValue()); // Unboxing ohne AutoUnboxing
        System.out.println(Long.valueOf(100L)); // Boxing ohne Ohne Autoboxing

        System.out.println(i + l); // Zum Rechenen werden die Wrapper IMMER ausgepackt und angepasst

        long l1 = 100_000_000; // primitive Widening von int zu long
        long l2 = 100_000_000_000L; // kein primitive Widening

        System.out.println();

        int i2 = Integer.decode("0x10");
        System.out.println(i2);
        //i2 = Integer.valueOf("0x10"); // Nur dezimal erlaubt
        i2 = Integer.valueOf("10", 2); // binär
        System.out.println(i2);

        Integer i3 = new Integer(10); // Objekt wird direkt erzeugt
        i3 = 10; // Autoboxing von int auf Integer


        int i4;

        if(i3 > 5) {
            i4 = 10;
        }

        //System.out.println(i4); // Error: i4 könnte nicht initialisiert sein

        float f1 = 1f;
        f1 = .5f;
        f1 = 0.5f;
    }
}
