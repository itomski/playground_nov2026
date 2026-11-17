package de.lubowiecki.exceptions;

public class DoubleTest {

    public static void main(String[] args) {

        try {
            int erg = div(10, 0);
            System.out.println(erg);
        }
        catch (ArithmeticException e) {
            System.out.println("Problem");
        }

//        double erg = 10.0 / 0.0; // Infinity
//        System.out.println(erg);
//        if(Double.isInfinite(erg)) {
//            System.out.println("Problem");
//        }

        try {
            double erg = div(10.0, 0);
            System.out.println(erg);
        }
        catch (ArithmeticException e) {
            System.out.println("Problem");
        }

    }

    private static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }

    private static double div(double a, double b) throws ArithmeticException {
        double erg =  a / b;
        if(Double.isInfinite(erg)) throw new ArithmeticException("....");
        return erg;
    }
}
