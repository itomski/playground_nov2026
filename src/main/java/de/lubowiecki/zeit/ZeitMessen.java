package de.lubowiecki.zeit;

import java.time.Duration;
import java.time.Instant;

public class ZeitMessen {

    public static void main(String[] args) {

        //long start = System.currentTimeMillis();
        Instant start = Instant.now();

        for (int i = 0; i < 10_0000; i++) {
            System.out.println(i);
        }

        //long ende = System.currentTimeMillis();
        //System.out.println(ende - start + "ms");

        Instant ende = Instant.now();
        Duration abstand = Duration.between(start, ende); // Abstand zwischen start und ende
        System.out.println(abstand.toNanos() + "ns");

    }
}
