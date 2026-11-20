package de.lubowiecki;

public class Initializer2 {

    public static void main(String[] args) {

        // 1x alle statischen Initializer von Parent nach Child
        // Pro Instanz Instanz-Initializer + Konstruktor von Parent nach Child
        C c = new C();
        System.out.println();
        B b = new B();
    }
}

class A {

    static {
        System.out.println("SI: A");
    }

    {
        System.out.println("II: A");
    }

    public A() {
        // super()
        // Instanz-Initializer
        System.out.println("C: A");
    }
}

class B extends A {

    static {
        System.out.println("SI: B");
    }

    {
        System.out.println("II: B");
    }

    public B() {
        // super()
        // Instanz-Initializer
        System.out.println("C: B");
    }
}

class C extends B {

    static {
        System.out.println("SI: C");
    }

    {
        System.out.println("II: C");
    }

    public C() {
        // super()
        // Instanz-Initializer
        System.out.println("C: C");
    }
}
