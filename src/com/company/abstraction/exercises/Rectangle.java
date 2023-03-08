package com.company.abstraction.exercises;

public class Rectangle extends Shape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        // Area of rectangle is length x breadth
        return length * breadth;
    }

    public double getPerimeter() {
        // Perimeter is 2 x (length + breadth)
        return 2 * (length + breadth);
    }
}
