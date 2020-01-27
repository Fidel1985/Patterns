package com.fidel.patterns.structural.decorator.car;

/**
 Decorator. Intent. Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative
 to subclassing for extending functionality.
 * */
public class DecoratorDemo {

    public static void main(String[] args) {
        Car doctorsDream = new AmbulanceCar(new Mercedes());
        doctorsDream.go();
    }
}
