package de.lubowiecki;

import java.util.Arrays;

public class Arrays5 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[5]);
        arr[6] = 10;
        System.out.println(Arrays.toString(arr));

        // System.out.println(arr[-5]); // nur positive int-Werte erlaubt: ArrayIndexOutOfBoundsException
        arr[16] = 10; // Index zu hoch: ArrayIndexOutOfBoundsException

        // Exceptions entstehen zur Laufzeit
        // Indexpositionen werden erst zur Laufzeit geprüft

        int[][] arr2d = new int[2][3]; // 2 Arrays mit je 3 Elementen

        // Größe der ersten Dimension MUSS immer bei der Erzeugung mit "new" angegeben werden
        arr2d = new int[2][]; // 2 x null
        // {null, null}
        arr2d[0] = new int[1];
        arr2d[1] = new int[2];
        // {{0}, {0,0}}

        arr2d = new int[2][0]; // 2 Arrays mit größe 0
        // {{}, {}}
    }
}
