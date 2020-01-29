package com.fidel.patterns.behavioral.chain_of_responsibility.cafe;

import java.util.Arrays;
import java.util.Collections;

public class ChainDemo {

    public static void main (String[] args) {
        Food cappuccino1 = new Food("Cappuccino", Arrays.asList("Coffee", "Milk","Sugar"));
        Food cappuccino2 = new Food("Cappuccino", Arrays.asList("Coffee", "Milk"));
        Food soup1 = new Food("Soup with meat", Arrays.asList("Meat", "Water","Potato"));
        Food soup2 = new Food("Soup with potato", Arrays.asList("Water", "Potato"));
        Food meat = new Food("Meat", Collections.singletonList("Meat"));
        WeirdCafeVisitor girlFriend = new GirlFriend(null);
        WeirdCafeVisitor me = new Me(girlFriend);
        WeirdCafeVisitor bestFriend = new BestFriend(me);
        bestFriend.handleFood(cappuccino1);
        bestFriend.handleFood(cappuccino2);
        bestFriend.handleFood(soup1);
        bestFriend.handleFood(soup2);
        bestFriend.handleFood(meat);
    }
}
