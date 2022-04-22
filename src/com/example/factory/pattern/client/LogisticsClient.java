package com.example.factory.pattern.client;

import com.example.factory.pattern.factory.LogisticsFactory;
import com.example.factory.pattern.factory.RoadLogistics;
import com.example.factory.pattern.factory.SeaLogistics;
import com.example.factory.pattern.models.ITransport;

public class LogisticsClient {
    public static void main(String[] args){
        LogisticsFactory roadLogisticsFactory = new RoadLogistics();
        ITransport transport = roadLogisticsFactory.getVehicle("Truck");
        transport.deliver();

        transport = roadLogisticsFactory.getVehicle("Motorbike");
        transport.deliver();

        LogisticsFactory seaLogisticsFactory = new SeaLogistics();
        ITransport transport1 = seaLogisticsFactory.getVehicle("Ship");
        transport1.deliver();
    }
}
