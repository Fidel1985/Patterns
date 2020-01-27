package com.fidel.patterns.structural.decorator.car;

public class AmbulanceCar extends DecoratorCar {

    public AmbulanceCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println(".... beep-beep-beeeeeeep ....");
    }
}
