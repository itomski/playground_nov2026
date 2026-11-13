package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioTest {

    public static void main(String[] args) {

        // NIO
        Path file = Paths.get("daten.txt");
        System.out.println(file.toAbsolutePath());

        if(Files.exists(file)) {
            System.out.println("Datei ist verfügbar!");

            try {
                List<String> zeilen = Files.readAllLines(file);

                for (String zeile : zeilen) {
                    System.out.println(zeile);
                }
            } catch (IOException e) {
                System.out.println("Problem");
            }
        }
    }
}
