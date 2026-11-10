package de.lubowiecki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Listen3 {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);

        zahlen = new ArrayList<>(Arrays.asList(1,2,3)); // Vor Java 9
        zahlen = new ArrayList<>(List.of(1,2,3)); // Ab Java 9

        zahlen.addAll(List.of(10,20,30));
        zahlen.addAll(0, List.of(100,200,300));

        System.out.println(zahlen);

//        for(Integer zahl : zahlen) {
//            zahlen.remove(zahl); // ConcurrentModificationException
//        }

        // Gut aber umständlich
//        for(int i = 0; i < zahlen.size();) {
//            if(zahlen.get(i) >= 100) {
//                zahlen.remove(i); // Elemente rücken nach dem Entfernen um eine Position nach links
//            }
//            else {
//                i++;
//            }
//        }

        // Funktioniert super
//        Iterator<Integer> itr = zahlen.iterator();
//        while(itr.hasNext()) {
//            if(itr.next() >= 100) {
//                itr.remove();
//            }
//        }

        // Mit Lambdas
        zahlen.removeIf(e -> e >= 100);

        System.out.println(zahlen);
    }
}
