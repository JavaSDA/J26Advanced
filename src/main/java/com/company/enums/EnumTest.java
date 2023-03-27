package com.company.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnumTest {
    public static void main(String[] args) {
//        System.out.println(Sandwich.PI.getPiValue());
        System.out.println(FoodMenu.BREAKFAST.getMain());
        System.out.println(FoodMenu.LUNCH.getAppetizer());
        System.out.println(FoodMenu.DINNER.getDessert());

        // Streams
        // Stream is a data structure that doesn't store elements.

//        System.out.println(Arrays.toString(FoodMenu.values()));

        // Method referencing = syntactical sugar
        // It's basically a shorthand for writing certain lambda expressions.
        // We can only use this when, the lambda expr only expects one
        // argument and one of the following is true
        // - lambda input argument is an argument from a class
        // - an "argumentless" method is called on the input argument

//        Stream.of(FoodMenu.values()).forEach(value -> System.out.println(value));
//        List<String> words = Stream
//                .of(FoodMenu.values())
//                .filter(value -> !value.equals(FoodMenu.LUNCH))
//                .map(value -> value.getMain()) // .map(FoodMenu::getAppetizer)
//                .collect(Collectors.toList()); // syntactical sugar
//
//        System.out.println(words);
    }
}
