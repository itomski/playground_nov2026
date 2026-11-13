package de.lubowiecki.oop;

public class HasATest {

    public static void main(String[] args) {

        Vertrag vertrag1 = new Vertrag("Arbeitsvertrag", "Bla bla bla...");

        Kunde k1 = new Kunde(123, "Peter", "Parker");
        Kunde k2 = new PremiumKunde(189, "Bruce", "Banner");
        vertrag1.setPartei1(k1);
        vertrag1.setPartei2(k2);

        System.out.println(vertrag1);

    }
}

// IMMUTABLE
class Kunde {

    private final int kundenNr;
    private final String vorname;
    private final String nachname;

    public Kunde(int kundenNr, String vorname, String nachname) {
        this.kundenNr = kundenNr;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getName() {
        return vorname + " " + nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("kundenNr=").append(kundenNr);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class PremiumKunde extends Kunde {

    private String besonderheit = "Extra Funktionen";

    public PremiumKunde(int kundenNr, String vorname, String nachname) {
        super(kundenNr, vorname, nachname);
    }

    @Override
    public String getName() {
        // super.getName() - Methode aus der Elternklasse
        return super.getName() + ", " + besonderheit;
    }
}

class Vertrag {

    private String gegenstand;
    private String vertragsText;
    private Kunde partei1; // Vertrag HAS-A Kunde
    private Kunde partei2;

    public Vertrag(String gegenstand, String vertragsText) {
        this.gegenstand = gegenstand;
        this.vertragsText = vertragsText;
    }

    public void setPartei1(Kunde partei1) {
        this.partei1 = partei1;
    }

    public void setPartei2(Kunde partei2) {
        this.partei2 = partei2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vertrag{");
        sb.append("gegenstand='").append(gegenstand).append('\'');
        sb.append(", vertragsText='").append(vertragsText).append('\'');
        sb.append(", partei1=").append(partei1.getName());
        sb.append(", partei2=").append(partei2.getName());
        sb.append('}');
        return sb.toString();
    }
}
