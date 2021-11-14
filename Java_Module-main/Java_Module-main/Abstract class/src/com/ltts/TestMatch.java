package com.ltts;

public class TestMatch extends Match{
    @Override
    float calculateRunRate() {
        return (super.getCurrentScore()/super.getCurrentOver());
    }

    @Override
    int calculateBalls() {
        return (super.getCurrentOver()*6);
    }

    @Override
    void display(double reqRunRate, int balls) {
        System.out.println("Need "+super.getCurrentScore()+" runs to win");
    }
}