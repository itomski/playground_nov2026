package de.lubowiecki.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Warteschlangen {

    public static void main(String[] args) {

        Queue<String> jobs = new LinkedList<>();
        jobs.add("Meeting");
        jobs.add("Auswertung fertigstellen");
        jobs.add("Ablage erledigen");
        jobs.add("Anruf bei Dr. Strange");
        jobs.add("Feierabend");

        // Queue = Warteschlange
        // FIFO
        // Wird aufgefüllt und verarbeitet - Durchgangsspeicher

        System.out.println(jobs);
        while(!jobs.isEmpty()) {
            //System.out.println(jobs.peek()); // Element am Anfang der Warteschlange anzeigen
            System.out.println(jobs.poll()); // Enternt ein Element am Anfang der Warteschlange
        }
        System.out.println(jobs);

        System.out.println("--------------");

        // Stack = LIFO
        Deque<String> stack = new LinkedList<>();
        stack.push("Element1"); // Auf den Stack legen
        stack.push("Element2");
        stack.push("Element3");
        stack.push("Element4");

        System.out.println(stack);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop()); // Enternt das zuletzt eingefügte Element
        }
        System.out.println(stack);


    }
}
