package com.example.shoppr_recipe_app;

import java.util.ArrayList;
import java.util.List;

public class Recipes {

    List<Ingredients> recipeIngredients = new ArrayList<Ingredients>();
    String recipeInstructions;

    //this is a test im using for pushing to github from linux terminal

    public Recipes(ArrayList<Ingredients> ingredientList, String instructions) {
        this.recipeIngredients = ingredientList;
        this.recipeInstructions = instructions;
    }
}
