package de.lubowiecki.aufgaben.loesungen.a28;

public class Kaffeemaschine {

    private int wasserMenge = 1000;
    private int kaffeeMenge = 100;
    private int milchMenge = 100;

    public boolean kaffeeZubereiten() throws ZuWenigWasser, ZuWenigMilch, ZuWenigKaffee {
        return zubereiten(150, 20, 0);
    }

    public boolean kaffeeMitMilchZubereiten() throws ZuWenigWasser, ZuWenigMilch, ZuWenigKaffee {
        return zubereiten(150, 20, 50);
    }

    private boolean zubereiten(int wasser, int kaffee, int milch) throws ZuWenigWasser, ZuWenigKaffee, ZuWenigMilch {
        if(pruefeBedarf(wasser, kaffee, milch)) {
            verbrauchen(wasser, kaffee, milch);
            return true;
        }
        return false;
    }

    private void verbrauchen(int wasser, int kaffee, int milch) {
        wasserMenge -= wasser;
        kaffeeMenge -= kaffee;
        milchMenge -= milch;
    }

    private boolean pruefeBedarf(int wasser, int kaffee, int milch) throws ZuWenigWasser, ZuWenigKaffee, ZuWenigMilch {
        if(wasserMenge - wasser < 0) throw new ZuWenigWasser();
        if(kaffeeMenge - kaffee < 0) throw new ZuWenigKaffee();
        if(milchMenge - milch < 0) throw new ZuWenigMilch();
        return true;
    }
}
