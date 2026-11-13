package de.lubowiecki.patterns.composite;

public class PowerPointDokument extends Dokument {

    public PowerPointDokument() {
        super("PowerPoint");
    }

    @Override
    public void print() {
        System.out.println("Folien werden geprintet");
    }
}
