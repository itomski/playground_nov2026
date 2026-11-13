package de.lubowiecki.patterns.composite;

public class WordDokument extends Dokument {

    public WordDokument() {
        super("Word");
    }

    @Override
    public void print() {
        System.out.println("Text wird geprintet");
    }
}
