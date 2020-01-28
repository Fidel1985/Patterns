package com.fidel.patterns.structural.flyweight.game;

import java.util.HashMap;

public class UnitImagesFactory {
    public static HashMap<UnitType, Image> images = new HashMap<>();

    public static Image createDragonImage()
    {
        if (!images.containsKey(UnitType.DRAGON))
        {
            images.put(UnitType.DRAGON, Image.load("Dragon.jpg"));
        }
        return images.get(UnitType.DRAGON);
    }

    public static Image createGoblinImage()
    {
        if (!images.containsKey(UnitType.GOBLIN))
        {
            images.put(UnitType.GOBLIN, Image.load("Goblin.jpg"));
        }
        return images.get(UnitType.GOBLIN);
    }
}
