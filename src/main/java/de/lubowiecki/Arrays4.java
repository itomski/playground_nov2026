package de.lubowiecki;

public class Arrays4 {

    public static void main(String[] args) {

        print(1,2,5,7,9);

        print(new int[]{1,2,5,7,9,10});

        int[] arr = new int[]{};
        print(arr);

        print(2,7,22,18,9,100,-5);

        print(2,7,22);
    }

    private static void print(int i, int i1, int i2, int i3, int i4) {
        System.out.printf("Zahlen: %d %d %d %d %d \n", i, i1, i2, i3, i4);
    }

//    private static void print(int[] zahlen) {
//        System.out.print("Zahlen: ");
//        for(int zahl : zahlen) {
//            System.out.print(zahl + " ");
//        }
//        System.out.println();
//    }

    private static void print(int... zahlen) { // VarArg
        System.out.print("Zahlen: ");
        for(int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println();
    }
}
