package de.lubowiecki;

public class Pkw {

    private String kennzeichen;
    private String marke;
    private String modell;
    private String version;
    private int baujahr;
    private int ps;
    private String antrieb;
    private String farbe;

    @Override
    public String toString() {
        return "Pkw{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", version='" + version + '\'' +
                ", baujahr=" + baujahr +
                ", ps=" + ps +
                ", antrieb='" + antrieb + '\'' +
                ", farbe='" + farbe + '\'' +
                '}';
    }
}
