package com.example.shoppr_recipe_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Saved_Recipes_Activity extends AppCompatActivity {

    public static ArrayList<String> savedrecipenames = new ArrayList<String>();

    public static ArrayList<String> savedingredients = new ArrayList<String>();

    public static ArrayList<String> savedinstructions = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved__recipes_);

        ListView recipeList = findViewById(R.id.savedList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,savedrecipenames);
        recipeList.setAdapter(adapter);

        recipeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(Saved_Recipes_Activity.this, Saved_List_Data.class);
                intent.putExtra("ingredients", savedingredients.get(i));
                intent.putExtra("instructions", savedinstructions.get(i));
                startActivity(intent);

            }
        });


    }
}