package de.lubowiecki.patterns.composite;

public class ExcelDokument extends Dokument {

    public ExcelDokument() {
        super("Excel");
    }

    @Override
    public void print() {
        System.out.println("Tabelle wird geprintet");
    }
}
