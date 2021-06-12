package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class DessertRecipe extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_recipe);
        LinkedList<String> mWordList = new LinkedList<String>();
        LinkedList<String> mDetailList = new LinkedList<String>();
        LinkedList<Integer> mPictureList = new LinkedList<>();
        mWordList.add("Chocolate Mint Bars");
        mWordList.add("Blueberry Cupcakes");
        mWordList.add("Fudge Walnut Brownies");
        mWordList.add("Lemon Cake");
        mWordList.add("Blueberry Peach Cobbler");
        mWordList.add("Texas Sheet Cake");
        mWordList.add("Espresso Crinkles");
        mWordList.add("Chocolate Cherry Cookies");
        mWordList.add("Vanilla Cheesecake");
        mWordList.add("Tiramisu");
        mWordList.add("Carrot Cake");
        mWordList.add("Blueberry Ice Cream");
        mDetailList.add("You'll love these if you're a big fan of thin chocolate mint Girl Scout cookies. The dense base layer is a rich fudgy brownie.");
        mDetailList.add("Lemon and blueberry flavors give these cupcakes a great taste. Blueberries or fresh, edible flowers make an easy, pretty decoration.");
        mDetailList.add("These brownies are rich in cocoa, melted chocolate and chocolate chunks.");
        mDetailList.add("This lemon cake recipe trims the fat and calories while still retaining the moist lemony quality.");
        mDetailList.add("Use fresh blueberries and peaches that aren't super ripe for this cobbler recipe so they'll hold their shape when cooked.");
        mDetailList.add("This class Texas sheet cake recipe features a homemade chocolate cake layer topped with chocolate frosting and chopped toasted pecans.  Its rectangular shape makes this cake perfect for serving to a crowd.");
        mDetailList.add("These cookies are flavored with espresso.");
        mDetailList.add("Chocolate and cherry flavours mixed together. Using bittersweet chocolate, the sugar is reduced and the cookies get a deeper flavor.");
        mDetailList.add("This cheesecake comes with cherry toppings.");
        mDetailList.add("Easy and delicious recipe to make real tiramisu.");
        mDetailList.add("Moist, light, fluffy, and low calorie carrot cake recipe.");
        mDetailList.add("Cool off on a hot day with a big bowl of creamy homemade ice cream. Perfect for entertaining, this five-star recipe makes enough for a crowd.");
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        mPictureList.add(R.drawable.dessert);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList, mDetailList, mPictureList, 2);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}