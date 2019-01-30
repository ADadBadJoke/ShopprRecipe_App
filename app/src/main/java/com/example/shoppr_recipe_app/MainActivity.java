package com.example.shoppr_recipe_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

            }
        } );

        openShoppingList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );

        openSavedRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
