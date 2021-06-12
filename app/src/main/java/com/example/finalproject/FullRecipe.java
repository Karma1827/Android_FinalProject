package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FullRecipe extends AppCompatActivity {
    private TextView mPosition;
    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_recipe);
        mPosition = findViewById(R.id.textView);
        mImage = findViewById(R.id.imageView);
        Intent intent = getIntent();
        String message = intent.getStringExtra(WordListAdapter.WordViewHolder.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(WordListAdapter.WordViewHolder.EXTRA_MESSAGE2);
        if(Integer.parseInt(message2) == 0){
            int[] array = {R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice};
            mImage.setImageResource(array[Integer.parseInt(message)]);
        }
        else if(Integer.parseInt(message2) == 1){
            int[] array = {R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle};
            mImage.setImageResource(array[Integer.parseInt(message)]);
        }
        else if(Integer.parseInt(message2) == 2){
            int[] array = {R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert};
            mImage.setImageResource(array[Integer.parseInt(message)]);
        }

        mPosition.setText("Procedure:\n1. Prepare ingredients.\n2. I don't know.");
    }
}