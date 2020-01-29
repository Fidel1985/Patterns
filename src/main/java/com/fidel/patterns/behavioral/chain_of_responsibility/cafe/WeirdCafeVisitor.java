package com.fidel.patterns.behavioral.chain_of_responsibility.cafe;

public abstract class WeirdCafeVisitor {
    private WeirdCafeVisitor cafeVisitor;

    protected WeirdCafeVisitor(WeirdCafeVisitor cafeVisitor) {
        this.cafeVisitor = cafeVisitor;
    }

    public void handleFood(Food food) {
        if (cafeVisitor != null) {
            cafeVisitor.handleFood(food);
        }
    }
}
