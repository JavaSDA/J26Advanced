package com.company.exercises.lambda;

public class LambdaTest {
    public static void main(String[] args) {

        double fNum = 10;
        double sNum = 5;

        // Implement the arithmetic operations

        MathOperation add = (x, y) -> x + y; // TODO: Discuss method referencing with collections
        MathOperation sub = (x, y) -> x - y;
        MathOperation mul = (x, y) -> x * y;
        MathOperation div = (x, y) -> x / y;

        System.out.println(fNum + " + " + sNum + " = " + doOperation(fNum, sNum, add));
        System.out.println(fNum + " - " + sNum + " = " + doOperation(fNum, sNum, sub));
        System.out.println(fNum + " * " + sNum + " = " + doOperation(fNum, sNum, mul));
        System.out.println(fNum + " / " + sNum + " = " + doOperation(fNum, sNum, div));



    }

    private static double doOperation(double fNumber, double sNumber, MathOperation operation)  {
        return operation.operate(fNumber, sNumber);
    }

    // Generics -
}
