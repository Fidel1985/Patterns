package com.fidel.patterns.structural.bridge;

/**
 * Bridge. Intent. Decouple an abstraction from its implementation so that the two can vary independently.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        BrickWallCreator brickWallCreator = new BrickWallCreator();
        ConcreteSlabWallCreator concreteSlabWallCreator = new ConcreteSlabWallCreator();

        BuildingCompany buildingCompany = new BuildingCompany();
        buildingCompany.buildFoundation();

        buildingCompany.setWallCreator(concreteSlabWallCreator);
        buildingCompany.buildRoom();

        buildingCompany.setWallCreator(brickWallCreator);
        buildingCompany.buildRoom();
        buildingCompany.buildRoom();
        buildingCompany.buildRoof();
    }
}
