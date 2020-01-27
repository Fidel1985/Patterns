package com.fidel.patterns.structural.decorator.car;

public class Car {
    private String brandName;

    public Car() {
    }

    public Car(String brandName) {
        this.brandName = brandName;
    }

    public void go() {
        System.out.println("I'm " + brandName + " and I'm on my way...");
    }
}
