package de.lubowiecki.collections;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Kalender {

    public static void main(String[] args) {

        Map<LocalDateTime, String> cal = new TreeMap<>();

        cal.put(LocalDateTime.now(), "Schulung");
        cal.put(LocalDateTime.of(2026,11,20, 16, 0), "Arzttermin");
        cal.put(LocalDateTime.of(2026,11,18, 8, 3), "Besprechung der Übung");

        // Map<LocalDateTime, List<String>> premiumCal = new TreeMap<>();

        System.out.println(cal);

        System.out.println();

        for(LocalDateTime key : cal.keySet()) {
            System.out.println(cal.get(key));
        }

        System.out.println();

        for(String val : cal.values()) {
            System.out.println(val);
        }

        System.out.println();

        for(Map.Entry<LocalDateTime, String> e : cal.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
