package com.example.shoppr_recipe_app;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class saved extends AppCompatActivity {
    TextView ingredientData;
    TextView instructionData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        ingredientData = findViewById(R.id.ingredientsView);
        instructionData = findViewById(R.id.instructionsView);

        Intent intent = getIntent();
        String receivedIngredients = intent.getStringExtra("ingredients");
        String receivedInstructions = intent.getStringExtra("instructions");

        ingredientData.setText(receivedIngredients);
        instructionData.setText(receivedInstructions);

    }

}
