package com.fidel.patterns.creational.builder.laptop;

/**
 * Builder. Intent. Separate the construction of a complex object from its representation so that the same construction
 * process can create different representations.
 */
public class BuilderDemo {

    public static void main(String[] args) {
        LaptopBuilder gamingBuilder = new GamingLaptopBuilder();
        //LaptopBuilder tripBuilder = new TripLaptopBuilder(); not implemented
        BuyLaptop shopForYou = new BuyLaptop();

        shopForYou.setLaptopBuilder(gamingBuilder);
        shopForYou.constructLaptop();

        Laptop laptop = shopForYou.getLaptop();
        System.out.println(laptop);
    }
}
