package com.example.factory.pattern.models;

public class Ship implements ITransport{
    @Override
    public void deliver() {
        System.out.println("Delivered by ship");
    }
}
