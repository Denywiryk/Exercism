package com.den.Comparator;

public class Laptop {
    int ram;
    int price;



    String name;

    public Laptop(int ram, int price, String name) {
        this.ram = ram;
        this.price = price;
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
