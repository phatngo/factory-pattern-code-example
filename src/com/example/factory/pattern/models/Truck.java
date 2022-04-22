package com.example.factory.pattern.models;

public class Truck implements ITransport{
    @Override
    public void deliver() {
        System.out.println("Delivered by truck");
    }
}
