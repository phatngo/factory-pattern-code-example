package com.example.factory.pattern.models;

public class Motorbike implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Delivered by motorbike");
    }
}
