package com.fidel.patterns.structural.bridge.construction;

public class BuildingCompany implements IBuildingCompany {
    public IWallCreator wallCreator;

    @Override
    public void buildFoundation() {
        System.out.println("Foundation is built.");
    }

    @Override
    public void buildRoom() {
        wallCreator.buildWallWithDoor();
        wallCreator.buildWall();
        wallCreator.buildWallWithWindow();
        wallCreator.buildWall();
        System.out.println("Room finished.");
    }

    @Override
    public void buildRoof() {
        System.out.println("Roof is done.");
    }

    public IWallCreator getWallCreator() {
        return wallCreator;
    }

    public void setWallCreator(IWallCreator wallCreator) {
        this.wallCreator = wallCreator;
    }
}
