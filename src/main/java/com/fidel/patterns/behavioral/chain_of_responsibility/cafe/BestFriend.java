package com.fidel.patterns.behavioral.chain_of_responsibility.cafe;

import java.util.ArrayList;
import java.util.List;

public class BestFriend extends WeirdCafeVisitor {
    private List<Food> coffeeContainingFood;

    public BestFriend(WeirdCafeVisitor cafeVisitor) {
        super(cafeVisitor);
        this.coffeeContainingFood = new ArrayList<>();
    }

    @Override
    public void handleFood(Food food) {
        if (food.getIngredients().contains("Meat")) {
            System.out.println("BestFriend: I just ate " + food.getName() + ". It was tasty");
            return;
        }
        if (food.getIngredients().contains("Coffee") && coffeeContainingFood.size() < 1) {
            System.out.println("BestFriend: I have to take something with coffee " + food.getName() + ". Looks fine");
            coffeeContainingFood.add(food);
            return;
        }
        super.handleFood(food);
    }
}
