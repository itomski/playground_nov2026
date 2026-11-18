package de.lubowiecki.zeit;

import java.time.LocalDate;

public class VertragApp {

    public static void main(String[] args) {

        Vertrag v1 = new Vertrag(
                LocalDate.now(),
                LocalDate.now().plusYears(1),
                "Haftpflicht Versicherung"
        );

        System.out.println(v1);
    }
}
