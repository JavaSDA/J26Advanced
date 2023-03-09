package com.company.abstraction.exercises.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape circle = new Circle(7);
        Shape rect = new Rectangle(4, 8);

        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());

        System.out.printf("Circle area is %.2f cm\n", circle.getArea());
        
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
        
        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Perimeter of Rectangle: " + rect.getPerimeter());
    }
}
