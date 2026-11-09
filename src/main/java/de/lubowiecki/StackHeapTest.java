package de.lubowiecki;

public class StackHeapTest {

    private static int count;

    public static void main(String[] args) {

        doSomething();

    }

    private static void doSomething() {
        count++;
        System.out.println(count);
        //if(count < 10_000) {
            doSomething(); // Rekursion: Kann zu StackOverflowError führen
        //}
    }
}
