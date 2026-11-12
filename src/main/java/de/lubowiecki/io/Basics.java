package de.lubowiecki.io;

import java.io.*;

public class Basics {

    public static void main(String[] args) {

        // Reader und Writer arbeiten mit UniCode und Zeichen für Zeichen
        // BufferedReader und BufferedWriter arbeiten mit einem Puffer, der viele Zeichen enthalten kann

        final String FILE = "daten.txt";

        // Schreiben
        try(Writer out = new BufferedWriter(new FileWriter(FILE, true))) {
            out.write("\nDas ist das Haus von Nikigraus"); // Schreiben
        }
        catch (IOException e) {
            System.out.println("Problem bei Schreiben");
        }

        // Lesen
        try(BufferedReader in = new BufferedReader(new FileReader(FILE))) {

            String line;
            while((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Problem beim Lesen");
        }
    }
}
