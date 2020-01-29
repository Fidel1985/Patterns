package com.fidel.patterns.behavioral.chain_of_responsibility.cafe;

public class GirlFriend extends WeirdCafeVisitor {

    public GirlFriend(WeirdCafeVisitor cafeVisitor) {
        super(cafeVisitor);
    }

    @Override
    public void handleFood(Food food) {
        if (food.getIngredients().contains("Coffee")) {
            System.out.println("GirlFriend: My lovely cappuccino!!!");
            //return;
        }
        //super.HandleFood(food);
    }
}
