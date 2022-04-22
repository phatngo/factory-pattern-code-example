package com.example.factory.pattern.factory;

import com.example.factory.pattern.models.ITransport;
import com.example.factory.pattern.models.Ship;
import com.example.factory.pattern.models.Truck;

public class SeaLogistics extends LogisticsFactory{
    @Override
    public ITransport createTransport(String transportType) {
        if(transportType.equalsIgnoreCase("Ship"))
            return new Ship();
        return null;
    }
}
