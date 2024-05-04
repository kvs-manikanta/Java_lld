package com.bms.lambdas;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        Car c1=new Car("red","seden",10000);
        Car c2=new Car("blue","suv",1000);
        Car c3=new Car("gold","sport",2000);
        Car c4=new Car("black","electric",3300);
        Car c5=new Car("olive","seden",200);

        List<Car> cars = Arrays.asList(c1,c2,c3,c4,c5);

        //Way1

        /*
        Collections.sort(cars);

        for(Car car : cars)
        {
            System.out.println(car.toString());
        }
        */
        //Way-2
        /*
        Comparator<Car> comparator=(car1,car2)-> {
             return car2.price - car1.price;
        };

        Collections.sort(cars, comparator);

        for(Car car : cars)
        {
            System.out.println(car.toString());
        }
         */
        //Way-3

        Collections.sort(cars,(car1,car2) -> car1.price-car2.price );

        for(Car car : cars)
        {
            System.out.println(car.toString());
        }


    }
}
