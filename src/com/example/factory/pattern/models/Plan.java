package com.example.factory.pattern.models;

public abstract class  Plan {
    protected double rate;

    public abstract void getRate();

    public abstract void getName();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
