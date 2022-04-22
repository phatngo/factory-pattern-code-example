package com.example.factory.pattern.factory;

import com.example.factory.pattern.models.ITransport;
import com.example.factory.pattern.models.Motorbike;
import com.example.factory.pattern.models.Truck;

public class RoadLogistics extends LogisticsFactory{
    @Override
    public ITransport createTransport(String transportType) {
        if(transportType.equalsIgnoreCase("Truck"))
             return new Truck();
        else if(transportType.equalsIgnoreCase("Motorbike"))
            return new Motorbike();
        return null;
    }
}
