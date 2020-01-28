package com.fidel.patterns.structural.flyweight.game;

public class Goblin extends Unit {

    public Goblin() {
        setName("Goblin");
        setHealth(8);
        // here we have new image object per unit
        // setPicture(Image.load("Goblin.jpg"));
        // shared image per all units of one type
        setPicture(UnitImagesFactory.createGoblinImage());
        setUnitType(UnitType.GOBLIN);
    }
}
