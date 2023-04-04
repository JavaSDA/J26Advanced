package com.company.practicalEx.singleFileEx;

import java.util.stream.IntStream;

public class SumOfSquares {
    public static void main(String[] args) {
        int sum = IntStream
                .rangeClosed(1, 10)
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of 1-10: " + sum);
    }
}
