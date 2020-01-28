package com.fidel.patterns.structural.flyweight.game;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List<Unit> parseHTML()
    {
        List<Unit> units = new ArrayList<>();
        for (int i = 0; i < 150; i++)
            units.add(new Dragon());
        for (int i = 0; i < 500; i++)
            units.add(new Goblin());
        System.out.println("Dragons and Goblins are parsed from HTML page.");
        return units;
    }
}
