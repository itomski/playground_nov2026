package de.lubowiecki;

public class Modifier {

    public static void main(String[] args) {

        Thing t1 = new Thing("Hammer", "Ganz toll", 1.2, 39.99);
        // Thing t2 = new Thing(); // Den Default-Konstruktor gibt es nicht!

        // t1.price = -10; // Error: Eigenschaft ist private
        System.out.println(t1.getPrice()); // Lesender Zugriff über einen Getter
        t1.setPrice(29.99); // Schreibender Zugriff über einen Setter
        System.out.println(t1.getPrice());
        t1.setPrice(-15.99);
        System.out.println(t1.getPrice());
    }
}

class Thing {

    // Kein direkter Zugriff auf die Eigenschaften möglich
    private String name;
    private String description;
    private double weight;
    private double price;

    // Alt+Einf
    public Thing(String name, String description, double weight, double price) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Validierung
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(double weight) {
        if(weight > 0) // Validierung
            this.weight = weight;
    }

    public void setPrice(double price) {
        if(price > 0)
            this.price = price;
    }
}
