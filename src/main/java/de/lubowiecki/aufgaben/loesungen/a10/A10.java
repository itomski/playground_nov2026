package de.lubowiecki.aufgaben.loesungen.a10;

public class A10 {

    public static void main(String[] args) {

        DiceCup cup1 = new DiceCup(10);
        System.out.println(cup1.roll());
        System.out.println(cup1.roll());
        System.out.println(cup1.roll());
        System.out.println(cup1.roll());
        System.out.println(cup1.roll());
        System.out.println(cup1.roll());

        System.out.println();

        for(int zahl : cup1.roll(10)) {
            System.out.print(zahl + " ");
        }

        System.out.println();

        DiceCup cup2 = new DiceCup();
        System.out.println(cup2.roll());
        System.out.println(cup2.roll());
        System.out.println(cup2.roll());
        System.out.println(cup2.roll());
        System.out.println(cup2.roll());
        System.out.println(cup2.roll());

        System.out.println();

        for(int zahl : cup2.roll(10)) {
            System.out.print(zahl + " ");
        }

    }
}
