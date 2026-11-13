package de.lubowiecki.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialisieren {

    private static final String FILE = "objects.ser";

    public static void main(String[] args) {

//        List<String> namen = new ArrayList<>();
//        namen.add("Peter");
//        namen.add("Bruce");
//        namen.add("Carol");
//        namen.add("Toni");
//
//        writeToFile(namen);

        System.out.println();

        for(String name : readFromFile()) {
            System.out.println(name);
        }
    }

    private static void writeToFile(List<String> daten) {

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))) {
            out.writeObject(daten); // Serialisieren und speichern
        }
        catch (IOException e) {
            System.out.println("Problem beim Speichern!");
        }
    }

    private static List<String> readFromFile() {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))) {
            return (List<String>) in.readObject(); // Gelesen und deserialisieren
        }
        catch (Exception e) {
            System.out.println("Problem beim Lesen!");
        }
        return new ArrayList<>(); // Problem beim Lesen
    }
}
