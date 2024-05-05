package com.bms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    static class Car {
        String name;
        int price;
        int speed;

        Car(String name, int price, int speed) {
            this.name = name;
            this.price =  price;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "[Name = " + this.name + ", Price = " + this.price + ", Speed = " + this.speed + " ]\n";
        }
    }

    public static void main(String[] args) {
        List<Integer> list=List.of(5,3,6,1,4,9,6,34,663,652);

        List<Integer> result= list.stream().filter((n) -> n%2==0).toList();

        System.out.println(result);

          /*
        1. List is converted into a Stream of numbers.
        2. Stream will loop over the elements of the list.
        3. Every element will be passed to the filter as an input.
        4. If the condition of filter returns true, then that element will be taken in the output.
        5. Else that element will be neglected.
         */

        //Filter all the cars with price > 1000

        Car car1 = new Car("A", 1200, 200);
        Car car2 = new Car("B", 80, 400);
        Car car3 = new Car("C", 700, 150);
        Car car4 = new Car("D", 400, 100);
        Car car5 = new Car("E", 1900, 500);
        Car car6 = new Car("F", 350, 50);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6);

        List<Car> expensiveCars = cars.stream().filter((c1) -> c1.price > 1000).toList();
        System.out.println(expensiveCars);

        //For every car, extract the price.
        System.out.println(cars.stream().map((car) -> car.price).toList());

        //Problem statement
        System.out.println(cars.stream().filter((car) -> car.price > 1000).toList());
        System.out.println(cars.stream().map((car) -> car.price > 1000).toList());

        List<String> stringList=Arrays.asList("banana","elephant","brazil","bolyvia","amazon");

        List<Integer> stringLength=stringList.stream().filter((str) -> str.startsWith("b")).map(String::length).toList();

        System.out.println(stringLength);


    }
}
