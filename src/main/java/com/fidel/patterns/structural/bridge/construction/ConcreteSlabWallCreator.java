package com.fidel.patterns.structural.bridge.construction;

public class ConcreteSlabWallCreator implements IBuildingCompany.IWallCreator {

    @Override
    public void buildWall() {
        System.out.println("Concrete slab wall.");
    }

    @Override
    public void buildWallWithDoor() {
        System.out.println("Concrete slab wall with door.");
    }

    @Override
    public void buildWallWithWindow() {
        System.out.println("Concrete slab wall with window.");
    }
}
