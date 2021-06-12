package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void GotoRice(View view){
        Intent intent = new Intent(this, RiceRecipe.class);
        startActivity(intent);
    }
    public void GotoNoodle(View view){
        Intent intent = new Intent(this, NoodleRecipe.class);
        startActivity(intent);
    }
    public void GotoDessert(View view){
        Intent intent = new Intent(this, DessertRecipe.class);
        startActivity(intent);
    }
}