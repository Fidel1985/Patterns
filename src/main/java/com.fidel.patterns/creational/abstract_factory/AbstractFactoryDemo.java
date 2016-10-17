package com.fidel.patterns.creational.abstract_factory;

/**
 * Abstract Factory. Intent. Provide an interface for creating families of related or dependent objects without
 * specifying their concrete classes.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        IToyFactory toyFactory = new WoodenToysFactory();
        Bear bear = toyFactory.getBear();
        Cat cat = toyFactory.getCat();
        System.out.println("I've got " + bear.getName() + " and " + cat.getName());

        toyFactory = new TeddyToysFactory(); // substitute implementation, the rest of code is similar
        bear = toyFactory.getBear();
        cat = toyFactory.getCat();
        System.out.println("I've got " + bear.getName() + " and " + cat.getName());
    }
}