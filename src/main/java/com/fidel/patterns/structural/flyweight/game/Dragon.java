package com.fidel.patterns.structural.flyweight.game;

public class Dragon extends Goblin {

    public Dragon() {
        setName("Dragon");
        setHealth(50);
        // here we have new image object per unit
        // setPicture(Image.load("Dragon.jpg"));
        // shared image per all units of one type
        setPicture(UnitImagesFactory.createDragonImage());
        setUnitType(UnitType.DRAGON);
    }

}
