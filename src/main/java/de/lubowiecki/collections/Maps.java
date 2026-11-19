package de.lubowiecki.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> codes = new HashMap<>();
        codes.put(100, "Standard");
        codes.put(300, "Premium");
        codes.put(0, "Freemium");

        System.out.println(codes);

        System.out.println(codes.get(100));
        System.out.println(codes.get(10)); // null
        System.out.println(codes.getOrDefault(10, "Unbekannt"));
        System.out.println(codes.getOrDefault(300, "Unbekannt"));

    }
}
