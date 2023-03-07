package com.company.ball;

public class Ball {
    // fields = features/properties
    private boolean isRound;
    private int diameter; // cm

    public Ball(boolean isRound, int diameter) {
        this.isRound = isRound;
        this.diameter = diameter;
    }

    // setter and getter
//    public void setDiameter(int diameter) {
//        this.diameter = diameter;
//    }
//
    public boolean isRound() {
        return isRound;
    }

    public int getDiameter() {
        return diameter;
    }

    // methods = behaviour
    public void bounce() {
        System.out.println("The ball bounced");
    }

    public static void keepBallRound() {
        System.out.println("Keeping ball round");
    }
}
