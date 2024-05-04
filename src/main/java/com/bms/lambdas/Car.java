package com.bms.lambdas;

public class Car implements Comparable<Car>{
    @Override
    public int compareTo(Car c) {
        return this.price-c.price;
    }

    String color;
    String model;
    int price;

    public Car(String color, String model,int price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
