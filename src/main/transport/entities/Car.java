package main.transport.entities;

import main.transport.interfaces.Transport;
import main.utils.Random;

public class Car implements Transport {
    private double maxSpeed;

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("crash");
    }

    @Override
    public double getMaxSpeed() {
        int event = Random.getEvent();
        while (event != 6) {
            maxSpeed += 1.0;
            event = Random.getEvent();
        }
        stop();
        return maxSpeed;
    }
}
