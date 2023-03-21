package com.company.enums;

public enum Sandwich {
    // An enum is a special type of object in Java
    // for storing or defining a fixed number of instances
    // for a given type. It's also used to house constant values

    // When defining Enums, it's conventional to use all
    // capital letters, since these are essentially constants

    // similarities between classes and enums.
    // enums can contain:
    // constructors
    // fields
    // methods
    // access modifiers

    // they can also implement interfaces.
    // NOTE: inheritance does not apply to enums.



    PI(3.142), // 3.142
    INTEREST(4);
    private final double value;

    Sandwich(final double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
