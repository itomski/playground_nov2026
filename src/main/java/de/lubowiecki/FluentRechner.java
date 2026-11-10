package de.lubowiecki;

public class FluentRechner {

    private int sum;

    public static void main(String[] args) {

        FluentRechner ft = new FluentRechner();
        int res = ft.add(10).add(15).sub(5).result();
        System.out.println(res);
    }

    public FluentRechner add(int v) {
        sum += v; // Verändert den Zustand
        return this; // Liefert das geänderte Objekt zurück
    }

    public FluentRechner sub(int v) {
        sum -= v; // Verändert den Zustand
        return this; // Liefert das geänderte Objekt zurück
    }

    public int result() {
        return sum;
    }
}
