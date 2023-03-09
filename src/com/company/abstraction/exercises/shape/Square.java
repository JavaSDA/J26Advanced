package com.company.abstraction.exercises.shape;

public class Square extends Shape {
    private int lengthOfSide;

    public Square(int lengthOfSide) {
        super();
        this.lengthOfSide = lengthOfSide;
    }

    public double getArea() {
        // Area of a square is equal to
        // the length of a side raised to power 2
        return lengthOfSide * lengthOfSide;
    }

    public double getPerimeter() {
        // Perimeter of a square is equal to
        // 4 * multiplied by the length of one side.
        return 4 * lengthOfSide;
    }
}
