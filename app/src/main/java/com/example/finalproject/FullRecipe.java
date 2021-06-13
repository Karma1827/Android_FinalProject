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
        if(Integer.parseInt(message2) == 0){ //飯食
            //用來改圖片，第一項就是第一個料理的圖片
            int[] array = {R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice, R.drawable.rice};
            String[] text = {"HelloWorld87test", //飯食第一個料理的食譜
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.", //飯食第二個料理的食譜
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.", //飯食第三個料理的食譜
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.", //以此類推
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know."
            };
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }
        else if(Integer.parseInt(message2) == 1){ //麵食
            int[] array = {R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle, R.drawable.noodle};
            String[] text = {"Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know."
            };
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }
        else if(Integer.parseInt(message2) == 2){ //甜點
            int[] array = {R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert, R.drawable.dessert};
            String[] text = {"Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know.",
                    "Procedure:\n1. Prepare ingredients.\n2. I don't know."
            };
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }

    }
}