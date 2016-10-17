package com.fidel.patterns.creational.builder;

class BuyLaptop {
    private LaptopBuilder laptopBuilder;

    void setLaptopBuilder(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    //makes Builder to return the whole laptop
    Laptop getLaptop() {
        return laptopBuilder.getLaptop();
    }

    //makes Builder append all parts
    void constructLaptop() {
        laptopBuilder.createNewLaptop();
        laptopBuilder.setMonitorResolution();
        laptopBuilder.setProcessor();
        laptopBuilder.setMemory();
        laptopBuilder.setHDD();
        laptopBuilder.setBattery();
    }
}
