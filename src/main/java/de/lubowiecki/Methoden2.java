package de.lubowiecki;

public class Methoden2 {

    public static void main(String[] args) {
        new Methoden2().machWas();
    }

    private void machWas() {

        int i = 10;

//        if(true) {
//            return; // verlässt die Methode
//        }

        System.out.println("...");

        String str = "Hallo Welt";
        System.out.println(str.indexOf("W"));
        System.out.println(str.indexOf("X"));

    }
}
