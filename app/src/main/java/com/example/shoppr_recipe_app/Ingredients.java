package com.example.shoppr_recipe_app;

public class Ingredients  {

    public String name;
    public String amount;

    public Ingredients(String name, String amount) {

        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public String getAmount() {
        return this.amount;
    }



}
