package com.example.shoppr_recipe_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Shopping_List_Activity extends AppCompatActivity {

    private TextView foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping__list_);

        foodList = findViewById(R.id.shoppingElements);

        for (int k=0; k < Saved_Recipes_Activity.savedingredients.size(); k++) {

            foodList.append(Saved_Recipes_Activity.savedingredients.get(k) + "\n");

        }
    }
}
