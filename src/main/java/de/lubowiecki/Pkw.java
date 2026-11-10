package de.lubowiecki;

import java.util.StringJoiner;

public class Pkw {

    private String kennzeichen;
    private String marke;
    private String modell;
    private String version;
    private int baujahr;
    private int ps;
    private String antrieb;
    private String farbe;

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getAntrieb() {
        return antrieb;
    }

    public void setAntrieb(String antrieb) {
        this.antrieb = antrieb;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pkw{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append(", ps=").append(ps);
        sb.append(", antrieb='").append(antrieb).append('\'');
        sb.append(", farbe='").append(farbe).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
