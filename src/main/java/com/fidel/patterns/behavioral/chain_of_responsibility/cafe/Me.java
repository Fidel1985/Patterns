package com.fidel.patterns.behavioral.chain_of_responsibility.cafe;

public class Me extends WeirdCafeVisitor {

    public Me(WeirdCafeVisitor cafeVisitor) {
        super(cafeVisitor);
    }

    @Override
    public void handleFood(Food food) {
        if (food.getIngredients().contains("Water")) {
            System.out.println("Me: I like Soup. It went well.");
        }
        super.handleFood(food);
    }
}
