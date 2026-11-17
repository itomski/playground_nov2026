package de.lubowiecki;

public class EnumTest {

    public static void main(String[] args) {

        Wochentag tag = Wochentag.DI;
        tageBisWochenende(tag);

        System.out.println();

        tageBisWochenende(Wochentag.FR);

        System.out.println();

        tageBisWochenende(Wochentag.MI);

        System.out.println(NextWochentag.MI.getNr());
    }

    private static void tageBisWochenende(Wochentag tag) {

        switch(tag) {
            case MO: System.out.println("Montag");
            case DI: System.out.println("Dienstag");
            case MI: System.out.println("Mittwoch");
            case DO: System.out.println("Donnerstag");
            case FR: System.out.println("Freitag");
            case SA, SO: System.out.println("Woechenende");
        }
    }
}

enum Wochentag {

    MO, DI, MI, DO, FR, SA, SO

}

enum NextWochentag {

    MO(10), DI(20), MI(30), DO(40), FR(50), SA(60), SO(70);

    private final int nr;

    NextWochentag(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }
}
