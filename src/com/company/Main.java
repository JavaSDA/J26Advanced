package com.company;

import com.company.abstraction.animal.Animal;
import com.company.abstraction.animal.Eagle;
import com.company.ball.Ball;
import com.company.ball.Spike;

public class Main {

    // A Class is a blueprint for creating an object.

    // An INSTANCE is the construction of your object.

    // 'static' makes sure that the item it is called on maintains
    // only one instance of itself.

    // a static method or field is one that only has one instance of itself

    // an instance method or field is one that's attached
    // to each instance of the object

    // A constructor is what allows you to define the acceptable parameters
    // for dynamically creating your objects.

    // 4 core pillars of OOP
    // Encapsulation
    // Inheritance
    // Abstraction
    // Polymorphism

    // Encapsulation is hiding data, being able to control read/write access
    // to an object.

    // Inheritance is creating hierarchy between objects in your code.
    // When you use inheritance, you're saying that the child(subclass) object is a type of
    // the parent(base).

    // Abstraction is hiding implementation from the users of the class.
    // Two ways to do abstractions
    // - Abstract classes
    // - Interfaces

    // Polymorphism is making pieces of your code do different things.
    // You can make these pieces of code do different things, depending on where
    // and how they are called.

    // Method overriding
    // Method overloading

    // Ball is round. - feature
    // Ball has diameter - feature

    // Ball bounces - behaviour/action


    public static void main(String[] args) {
	// write your code here
        Ball leatherBall = new Ball(true, 40); // instance of the object
//
//        Ball paperBall = new Ball(true, 10);
//
//        Ball americanFootball = new Ball(false, 30);
////        leatherBall.setDiameter(4);
//        System.out.println("The diameter of the ball is: " + leatherBall.getDiameter());
//        System.out.println("The diameter of the ball is: " + americanFootball.getDiameter());
//
////        paperBall.bounce();
//        leatherBall.bounce(); // a call to the INSTANCE method 'bounce'
//
//        Ball.keepBallRound();


        Spike spike = new Spike(true, 20, 100);

        spike.bounce();

        System.out.println(spike.getNumOfSpikes(4));

//        System.out.println(leatherBall.getNumOfSpikes());
        System.out.println(spike.getDiameter());

        Spike.keepBallRound();


        Animal animal = new Eagle("Bingo", 3);

    }
}
