package com.fidel.patterns.structural.flyweight.game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Unit
{
    private String name;
    private int health;
    private Image picture;
    private UnitType unitType;

}
