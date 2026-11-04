package de.lubowiecki;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        int i1 = 10;
        i1 = 20; // Erster Wert geht verloren

        int[] arr = {1,5,7,8,-10,22}; // Array mit vorgegebenen Werten
        System.out.println(arr[0]); // Gib mir den Wert am Index 0
        System.out.println(arr[4]); // Gib mir den Wert am Index 4
        // System.out.println(arr[6]); // ArrayIndexOutOfBoundsException: Zu hoher Index

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        for (int wert : arr) {
            System.out.println(wert);
        }

        System.out.println();

        // Die Größe eines Arrays kann nachträglich NICHT geändert werden
        int[] nextArr = new int[10]; // Leeres Array mit der Größe von 10 Positionen
        nextArr[0] = 100; // Zuweisung an gewünschter Position
        System.out.println(nextArr[0]);

        int idx = 5;
        nextArr[idx] = 200;

        System.out.println(Arrays.toString(nextArr));

        for(int i = 0; i < nextArr.length; i++) {
            nextArr[i] = 10;
        }

        System.out.println(Arrays.toString(nextArr));

        for(int zahl : getZahlen()) {
            System.out.print(zahl + " ");
        }
    }

    static int[] getZahlen() {
        return new int[5];
    }
}
