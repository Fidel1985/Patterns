package com.fidel.patterns.creational.abstract_factory;

class TeddyToysFactory implements IToyFactory {
    public Bear getBear() {
        return new TeddyBear();
    }
    public Cat getCat() {
        return new TeddyCat();
    }
}
