package com.fidel.patterns.structural.flyweight.game;

import java.util.List;

/**
 Flyweight. Intent. Use sharing to support large numbers of fine-grained objects efficiently.
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        Parser unitParser = new Parser();
        List<Unit> units = unitParser.parseHTML();
        System.out.println(units.size());
    }
}
