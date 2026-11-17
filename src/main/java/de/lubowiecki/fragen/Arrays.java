package de.lubowiecki.fragen;

public class Arrays {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(++i);
        System.out.println(i++);

        char c = 66;
        System.out.println(c);

        int[][] arr = new int[2][2]; // {{0,0},{10,0}}
        arr[1][0] = 10;

        arr = new int[2][]; // {null, null}
        // arr[1][0] = 10; // NullPointerException

        arr = new int[2][]; // {{0,0,0}, {0,0}}
        arr[0] = new int[3];
        arr[1] = new int[2];

    }

}
