package com.fidel.patterns.structural.decorator.car;

public class DecoratorCar extends Car {
    private Car decoratedCar;

    public DecoratorCar(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void go() {
        decoratedCar.go();
    }
}
