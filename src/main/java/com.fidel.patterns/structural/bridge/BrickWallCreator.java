package com.fidel.patterns.structural.bridge;

public class BrickWallCreator implements IBuildingCompany.IWallCreator {

    @Override
    public void buildWall() {
        System.out.println("Brick wall.");
    }

    @Override
    public void buildWallWithDoor() {
        System.out.println("Brick wall with door.");
    }

    @Override
    public void buildWallWithWindow() {
        System.out.println("Brick wall with window.");
    }
}
