package de.lubowiecki.aufgaben.loesungen.a25;

public class AudioKommunikation implements Kommunikation{
    @Override
    public String kommunizieren() {
        return new StringBuilder("Spracheingabe\n")
                        .append("Interpretation...\n")
                        .append("Audioausgabe")
                        .toString();
    }
}
