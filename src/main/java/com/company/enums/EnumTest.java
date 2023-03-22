package com.company.enums;

import java.util.Arrays;
import java.util.stream.Stream;

public class EnumTest {
    public static void main(String[] args) {
//        System.out.println(Sandwich.PI.getPiValue());
        System.out.println(FoodMenu.BREAKFAST.getMain());
        System.out.println(FoodMenu.LUNCH.getAppetizer());
        System.out.println(FoodMenu.DINNER.getAppetizer());

        // Streams TODO: Scan the documentation together with the class.
        // Stream is a data structure that doesn't store elements.

//        System.out.println(Arrays.toString(FoodMenu.values()));

        // Method referencing = syntactical sugar
        // It's basically a shorthand for writing certain lambda expressions.
        // We can only use this when, the lambda expr only expects one
        // argument and one of the following is true
        // - lambda input argument is an argument from a class
        // - an "argumentless" method is called on the input argument

//        Stream.of(FoodMenu.values()).forEach(value -> System.out.println(value));
        Stream.of(FoodMenu.values()).forEach(System.out::println); // syntactical sugar
    }
}
