package com.company.ball;

public class Spike extends Ball {
    // A parent object is one that is extended
    // by the child class

    // The child class INHERITS all the features and
    // properties of the parent class but vice versa
    // does not occur

    private int numOfSpikes;

    public Spike(boolean isRound, int diameter, int numOfSpikes) {
        super(isRound, diameter);
        this.numOfSpikes = numOfSpikes;
    }

    public int getNumOfSpikes() {
        return numOfSpikes;
    }

}
