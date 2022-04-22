package com.example.factory.pattern.factory;

import com.example.factory.pattern.models.ITransport;
import com.sun.jdi.connect.Transport;

public abstract class LogisticsFactory {
    ITransport transport;
    abstract public ITransport createTransport(String transportType);
    public ITransport getVehicle(String transportType) {
        transport = createTransport(transportType);
        return transport;
    }
}
