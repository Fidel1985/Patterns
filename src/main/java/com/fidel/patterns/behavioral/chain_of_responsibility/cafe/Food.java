package com.fidel.patterns.behavioral.chain_of_responsibility.cafe;

import java.util.List;

public class Food {
    private String name;
    private List<String> ingredients;

    public Food(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
