package com.fidel.patterns.structural.adapter;

// Ну і власне сама розетка в новій квартирі
public class NewElectricitySystem implements INewElectricitySystem {
    public String matchWideSocket() {
        return "220V";
    }
}
