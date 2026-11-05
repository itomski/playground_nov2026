package de.lubowiecki;

import java.util.Arrays;

public class Arrays3 {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];
        /*
        {
            0: {
                0: 0,
                1: 0
            }
            1: {
                0: 8,
                1: 0
            }
            2: {
                0: 0,
                1: 5
            }
        }
        */

        arr[1][0] = 8;
        arr[2][1] = 5;
        System.out.println(arr[1][0]);

        System.out.println();

        for(int[] row : arr) {
            for(int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr)); // Nur die erste Ebene
        System.out.println(Arrays.deepToString(arr)); // Alles

        System.out.println();

        byte[][] board = new byte[8][8];

        for(byte[] row : board) {
            for(byte cell : row) {
                System.out.print(" " + cell + " ");
            }
            System.out.println();
        }
    }
}
