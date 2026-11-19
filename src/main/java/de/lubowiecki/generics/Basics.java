package de.lubowiecki.generics;

import de.lubowiecki.Person;

import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {

        StringBox b1 = new StringBox("Das ist das Haus von Nikigraus");
        System.out.println(b1.getContent());

        IntegerBox b2 = new IntegerBox(123);
        System.out.println(b1.getContent());

        Box<String> b3 = new Box<>("Das ist das Haus von Nikigraus");
        System.out.println(b3.getContent());

        Box<Integer> b4 = new Box<>(123);
        System.out.println(b4.getContent());

        Box<Double> b5 = new Box<>(123.5);
        System.out.println(b5.getContent());

        Box<Person> b6 = new Box<>(new Person("Peter", "Parker"));
        System.out.println(b6.getContent());

        // Standard RAW-Type ist Object
        Box b7 = new Box(new Object());
        System.out.println(b7.getContent());

    }
}

class StringBox {

    private String content;

    public StringBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class IntegerBox {

    private Integer content;

    public IntegerBox(Integer content) {
        this.content = content;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }
}

class Box<T> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
