package com.fidel.patterns.creational.abstract_factory;

class WoodenToysFactory implements IToyFactory {
    public Bear getBear() {
        return new WoodenBear();
    }
    public Cat getCat() {
        return new WoodenCat();
    }
}