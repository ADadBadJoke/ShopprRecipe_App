package com.example.shoppr_recipe_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {

    private Button openNewRecipe;
    private Button openShoppingList;
    private Button openSavedRecipes;
    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openNewRecipe = findViewById(R.id.newRecipe);
        openShoppingList = findViewById(R.id.shoppingList);
        openSavedRecipes = findViewById(R.id.savedRecipes);
        welcomeText= findViewById(R.id.welcomeText);

        openNewRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NewRecipeIntent = new Intent(Main_Activity.this, New_Recipe_Activity.class);
                startActivity(NewRecipeIntent);
            }
        } );

        openShoppingList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ShoppingListIntent = new Intent(Main_Activity.this, Shopping_List_Activity.class);
                startActivity(ShoppingListIntent);
            }
        } );

        openSavedRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SavedRecipesIntent = new Intent(Main_Activity.this, Saved_Recipes_Activity.class);
                startActivity(SavedRecipesIntent);
            }
        });
    }


}
