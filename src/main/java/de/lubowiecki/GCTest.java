package de.lubowiecki;

public class GCTest {

    public static void main(String[] args) throws InterruptedException {

        // Person ist ein Objekt auf dem Heap
        // p liegt auf dem Stack und ist eine Referenz auf das Person-Objekt auf dem Heap
        Person p = new Person();
        p = null; // Referenz wird gelöst

        System.gc(); // GC zum Arbeiten auffordern

        Thread.sleep(1000); // Der main-Thread soll 1 Sek warten
    }
}
