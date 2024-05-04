package com.bms.lambdas;


import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BiPredicateImpl biPredicate=new BiPredicateImpl();

        //Way-1
        boolean result=biPredicate.test("Hyderabad","Bangalore");

        System.out.println(result);

        //Way-2
        //Anonymous Function
        BiPredicate<String,String> biPredicate1=new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.length()>s2.length();
            }
        };

        //Way-3
        BiPredicate<String,String> biPredicate2=(str1,str2) -> str1.length()>str2.length();

        System.out.println(biPredicate2.test("Hyd","Bang"));

        BinaryOperator<String> binaryOperator = (str1, str2) -> {
            System.out.println("We are in Lambda expression for Binary operator");
            return str1 + " " + str2;
        };

        System.out.println(binaryOperator.apply("Scaler", "Bangalore"));

    }
}
