package de.lubowiecki;

public class Operatoren3 {

    static String text1 = "abc";

    public static void main(String[] args) {

        String text2 = "xyz";

        if(text1 != null && text1.length() > 0) {
            System.out.println(text1.toUpperCase());
        }

        if(text2 != null & text2.length() > 0) {
            System.out.println(text2.toUpperCase());
        }
    }
}
