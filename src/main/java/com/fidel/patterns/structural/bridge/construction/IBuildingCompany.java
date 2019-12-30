package com.fidel.patterns.structural.bridge.construction;

interface IBuildingCompany {
    void buildFoundation();
    void buildRoom();
    void buildRoof();
    interface IWallCreator {
        void buildWall();
        void buildWallWithDoor();
        void buildWallWithWindow();
    }
}
