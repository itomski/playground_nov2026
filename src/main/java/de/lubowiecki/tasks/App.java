package de.lubowiecki.tasks;

public class App {

    /*
    Eine Liste von Tasks.
    Jedes Task ist ein Objekt und hat folgende Eigenschaften: Nr, Erzeugungsdatum, Erledigungsdatum, Titel, Beschreibung
    Die Nr und das Erzeugungsdatum werden automatisch beim Anlegen des Tasks vergeben.

    Mögliche Optionen im Menü:
    1. Liste der Aufgaben
        1.1 Alle
        1.2 Nur offene
        1.3 Nur erledigte
        0. Zurück
    2. Aufgaben verwalten
        2.1 Task löschen
        2.2. Task als erledigt markieren
        2.3. Task als NICHT erledigt markieren
        2.4. Task bearbeiten
        0. Zurück
    3. Liste exportieren
        3.1. CSV
        3.2 JSON
        (etc. XML, Markup, Word, PDF, Excel)
        0 Zurück
    0. Programm verlassen

    Anforderungen:
    Daten werden in eine Datei persistiert

    Später:
    Daten werden in eine Datenbank persistiert
    GUI (JavaFX)
    */

    public static void main(String[] args) {
        new CliController().start();
    }
}
