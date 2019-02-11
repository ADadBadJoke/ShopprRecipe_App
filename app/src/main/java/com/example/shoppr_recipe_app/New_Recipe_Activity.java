package com.example.shoppr_recipe_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class New_Recipe_Activity extends AppCompatActivity {

    private EditText RecipeName;
    private EditText RecipeIngredients;
    private EditText RecipeInstructions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__recipe_);

        Button createRecipe = findViewById(R.id.buttonCreateRecipe);
        RecipeName = findViewById(R.id.textRecipeName);
        RecipeIngredients = findViewById(R.id.textRecipeIngredients);
        RecipeInstructions = findViewById(R.id.textRecipeInstructions);

        createRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String foodname = RecipeName.getText().toString();
                String ingredients = RecipeIngredients.getText().toString();
                String instructions = RecipeInstructions.getText().toString();

                Saved_Recipes_Activity.savedrecipenames.add(foodname);
                Saved_Recipes_Activity.savedingredients.add(ingredients);
                Saved_Recipes_Activity.savedinstructions.add(instructions);

                saveName();
                saveIngredients();
                saveInstructions();


            }
        });

    }

    private void saveName() {

        String foodName = RecipeName.getText().toString();

        FileOutputStream fos = null;

        try {

            fos = openFileOutput(foodName,MODE_PRIVATE);
            fos.write(foodName.getBytes());

            RecipeName.getText().clear();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fos != null) {

                try {

                    fos.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private void saveInstructions() {

        String foodName = RecipeName.getText().toString();
        String foodInstructions = RecipeInstructions.getText().toString();

        FileOutputStream fos = null;

        try {

            fos = openFileOutput(foodName + "Instructions",MODE_PRIVATE);
            fos.write(foodInstructions.getBytes());

            RecipeInstructions.getText().clear();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            if (fos != null) {

                try {

                    fos.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void saveIngredients(){

        String foodName = RecipeName.getText().toString();
        String foodIngredients = RecipeIngredients.getText().toString();

        FileOutputStream fos = null;

        try {

            fos = openFileOutput(foodName + "Ingredients", MODE_PRIVATE);
            fos.write(foodIngredients.getBytes());

            RecipeIngredients.getText().clear();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fos != null) {

                try {

                    fos.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

