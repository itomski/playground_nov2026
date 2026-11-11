package de.lubowiecki.aufgaben.loesungen.a20;


// abstract = Kann nur für Vererbung genutzt werden
// darf nicht direkt instanziert werden
public abstract class KaffeeProdukt {

    private int mengeKaffee;
    private int mengeWasser;
    private int mengeMilch;

    public KaffeeProdukt(int mengeKaffee, int mengeWasser, int mengeMilch) {
        this.mengeKaffee = mengeKaffee;
        this.mengeWasser = mengeWasser;
        this.mengeMilch = mengeMilch;
    }

    // public und protected Inventar wird vererbt


    public int getMengeKaffee() {
        return mengeKaffee;
    }

    public void setMengeKaffee(int mengeKaffee) {
        this.mengeKaffee = mengeKaffee;
    }

    public int getMengeWasser() {
        return mengeWasser;
    }

    public void setMengeWasser(int mengeWasser) {
        this.mengeWasser = mengeWasser;
    }

    public int getMengeMilch() {
        return mengeMilch;
    }

    public void setMengeMilch(int mengeMilch) {
        this.mengeMilch = mengeMilch;
    }

    @Override
    public String toString() {
        return new StringBuilder(getClass().getSimpleName())
            .append("{mengeKaffee=").append(mengeKaffee)
            .append(", mengeWasser=").append(mengeWasser)
            .append(", mengeMilch=").append(mengeMilch)
            .append('}')
            .toString();
    }
}
