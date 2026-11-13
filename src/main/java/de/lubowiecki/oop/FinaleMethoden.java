package de.lubowiecki.oop;

public class FinaleMethoden {

    public static void main(String[] args) {

    }
}

class Parent {

    public void doSomething() {
        //...
    }

    public final void doSomethingElse() {
        //...
    }
}

class Child extends Parent {

    @Override
    public void doSomething() {
        //... Anpassung
    }

//    Nicht erlaubt, da die Methode in der Elternklasse final ist
//    @Override
//    public void doSomethingElse() {
//        //... Anpassung
//    }
}
