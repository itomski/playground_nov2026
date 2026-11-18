package de.lubowiecki.zeit;

import java.time.LocalDate;

public class Vertrag {

    private LocalDate start;
    private LocalDate ende;
    private String text;

    public Vertrag(LocalDate start, LocalDate ende, String text) {
        this.start = start;
        this.ende = ende;
        this.text = text;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnde() {
        return ende;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vertrag{");
        sb.append("start=").append(start);
        sb.append(", ende=").append(ende);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
