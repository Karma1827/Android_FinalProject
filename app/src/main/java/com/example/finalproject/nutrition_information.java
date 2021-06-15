package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class nutrition_information extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_information);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        TextView calories = findViewById( R.id.calories );
        TextView fat = findViewById( R.id.fat );
        TextView sodium = findViewById( R.id.sodium );
        TextView sugar = findViewById( R.id.sugar );
        TextView carb = findViewById( R.id.carb );
        TextView protein = findViewById( R.id.protein );

        Bundle recieve = getIntent().getExtras();
        String text_string = recieve.getString("nutrition");
        String calories_string = recieve.getString( "calories" );
        String fat_string = recieve.getString( "fat" );
        String sodium_string = recieve.getString( "sodium" );
        String sugar_string = recieve.getString( "sugar" );
        String carb_string = recieve.getString( "carb" );
        String protein_string = recieve.getString( "protein" );
        if((textView != null) || (calories != null) || (fat != null) || (sodium != null) || (sugar != null) || (carb != null) || (protein != null)){
            textView.setText(text_string);
            calories.setText(calories_string);
            fat.setText( fat_string);
            sodium.setText( sodium_string );
            sugar.setText( sugar_string);
            carb.setText( carb_string);
            protein.setText( protein_string);
        }
    }
}