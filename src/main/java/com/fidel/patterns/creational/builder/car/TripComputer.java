package com.fidel.patterns.creational.builder.car;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class TripComputer {
    private Car car;

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
