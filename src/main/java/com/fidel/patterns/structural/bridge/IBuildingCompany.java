package com.fidel.patterns.structural.bridge;

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
