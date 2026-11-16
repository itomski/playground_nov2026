package de.lubowiecki.aufgaben.loesungen.a25;

public class App {

    public static void main(String[] args) {

        // Referenztyp: Antrieb (Interface)
        // Objekttyp: RaupenAntrieb (MUSS immer eine konkrete Klasse sein)
        Antrieb raupe = new RaupenAntrieb();
        Kommunikation audio = new AudioKommunikation();
        Arbeitseinheit uebersetzen = new UebersetzerEinheit();

        Roboter c3po = new Roboter("C3-PO", raupe, audio, uebersetzen);
        c3po.bewegen();
        c3po.kommunizieren();
        c3po.arbeiten();

        System.out.println("-------------------");
        Roboter r2d2 = new Roboter("R2-D2", raupe, audio, new BuegelEinheit());
        r2d2.bewegen();
        r2d2.kommunizieren();
        r2d2.arbeiten();
    }
}
