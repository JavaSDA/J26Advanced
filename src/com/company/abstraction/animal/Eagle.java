package com.company.abstraction.animal;

public class Eagle extends Animal {
    public Eagle(String name, int age) {
        super(name, age, "bird");
    }

    public void makeSound() {
        System.out.println("Eagle Cry!");
    }
}
