package com.fidel.patterns.creational.abstract_factory;

abstract class AnimalToy {
    private String name;
    AnimalToy(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
