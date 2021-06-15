package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FullRecipe extends AppCompatActivity {
    private TextView mPosition;
    private ImageView mImage;
    private int category = 0;
    private int position = 0;
    private Resources res;
    public static String[] concatArrays(String[] src1, String[] src2) {
        if (src1 == null) {
            throw new IllegalArgumentException("src1 is required.");
        }
        if (src2 == null) {
            throw new IllegalArgumentException("src2 is required.");
        }

        String[] result = new String[src1.length + src2.length];

        System.arraycopy(src1, 0, result, 0, src1.length);
        System.arraycopy(src2, 0, result, src1.length, src2.length);

        return result;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_recipe);
        res = getResources();
        mPosition = findViewById(R.id.textView);
        mImage = findViewById(R.id.imageView);
        Intent intent = getIntent();
        String message = intent.getStringExtra(WordListAdapter.WordViewHolder.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(WordListAdapter.WordViewHolder.EXTRA_MESSAGE2);
        category = Integer.parseInt(message2);
        position = Integer.parseInt(message);
        if(Integer.parseInt(message2) == 0){ //allrecipe
            int[] array = {R.drawable.com_tam, R.drawable.nasi_lemak, R.drawable.hainan_rice, R.drawable.indon_rice, R.drawable.pineapple_rice, R.drawable.thai_basil_chicken, R.drawable.bun_bo_hue, R.drawable.bun_rieu, R.drawable.bun_thit_nuong, R.drawable.fried_noodle, R.drawable.laksa, R.drawable.pho, R.drawable.bak_kut_teh, R.drawable.canh_chua, R.drawable.tom_yum, R.drawable.canh_artiso, R.drawable.coffee, R.drawable.pulled_tea, R.drawable.milo};
            String[] text1 = this.concatArrays(res.getStringArray(R.array.rice_recipe), res.getStringArray(R.array.noodle_recipe));
            String[] text2 = this.concatArrays(res.getStringArray(R.array.soup_recipe), res.getStringArray(R.array.drink_recipe));
            String[] text = this.concatArrays(text1, text2);
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }
        else if(Integer.parseInt(message2) == 1){ //飯食
            //用來改圖片，第一項就是第一個料理的圖片
            int[] array = {R.drawable.com_tam, R.drawable.nasi_lemak, R.drawable.hainan_rice, R.drawable.indon_rice, R.drawable.pineapple_rice, R.drawable.thai_basil_chicken};
            String[] text = res.getStringArray(R.array.rice_recipe);
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }
        else if(Integer.parseInt(message2) == 2){ //麵食
            int[] array = {R.drawable.bun_bo_hue, R.drawable.bun_rieu, R.drawable.bun_thit_nuong, R.drawable.fried_noodle, R.drawable.laksa, R.drawable.pho};
            String[] text = res.getStringArray(R.array.noodle_recipe);
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }

        else if(Integer.parseInt(message2) == 3){ //湯品
            int[] array = {R.drawable.bak_kut_teh, R.drawable.canh_chua, R.drawable.tom_yum, R.drawable.canh_artiso};
            String[] text = res.getStringArray(R.array.soup_recipe);
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }

        else if(Integer.parseInt(message2) == 4){ //飲料
            int[] array = {R.drawable.coffee, R.drawable.pulled_tea, R.drawable.milo};
            String[] text = res.getStringArray(R.array.drink_recipe);
            mImage.setImageResource(array[Integer.parseInt(message)]);
            mPosition.setText(text[Integer.parseInt(message)]);
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Resources res = getResources();
        String[] _name = new String[0];
        String[] _calories = new String[0];
        String[] _fat = new String[0];
        String[] _sodium = new String[0];
        String[] _sugar = new String[0];
        String[] _carb = new String[0];
        String[] _protein = new String[0];
        //String[] cs = new String[];
        if(category == 0){
            String[] temp1, temp2;
            temp1 = concatArrays(res.getStringArray(R.array.rice_name), res.getStringArray(R.array.noodle_name));
            temp2 = concatArrays(res.getStringArray(R.array.soup_name), res.getStringArray(R.array.drink_name));
            _name = concatArrays(temp1, temp2);
            temp1 = concatArrays(res.getStringArray(R.array.rice_calories), res.getStringArray(R.array.noodle_calories));
            temp2 = concatArrays(res.getStringArray(R.array.soup_calories), res.getStringArray(R.array.drink_calories));
            _calories = concatArrays(temp1, temp2);
            temp1 = concatArrays(res.getStringArray(R.array.rice_fat), res.getStringArray(R.array.noodle_fat));
            temp2 = concatArrays(res.getStringArray(R.array.soup_fat), res.getStringArray(R.array.drink_fat));
            _fat = concatArrays(temp1, temp2);
            temp1 = concatArrays(res.getStringArray(R.array.rice_sodium), res.getStringArray(R.array.noodle_sodium));
            temp2 = concatArrays(res.getStringArray(R.array.soup_sodium), res.getStringArray(R.array.drink_sodium));
            _sodium = concatArrays(temp1, temp2);
            temp1 = concatArrays(res.getStringArray(R.array.rice_sugar), res.getStringArray(R.array.noodle_sugar));
            temp2 = concatArrays(res.getStringArray(R.array.soup_sugar), res.getStringArray(R.array.drink_sugar));
            _sugar = concatArrays(temp1, temp2);
            temp1 = concatArrays(res.getStringArray(R.array.rice_carb), res.getStringArray(R.array.noodle_carb));
            temp2 = concatArrays(res.getStringArray(R.array.soup_carb), res.getStringArray(R.array.drink_carb));
            _carb = concatArrays(temp1, temp2);
            temp1 = concatArrays(res.getStringArray(R.array.rice_protein), res.getStringArray(R.array.noodle_protein));
            temp2 = concatArrays(res.getStringArray(R.array.soup_protein), res.getStringArray(R.array.drink_protein));
            _protein = concatArrays(temp1, temp2);
        }
        else if(category == 1){
            _name = res.getStringArray(R.array.rice_name);
            _calories = res.getStringArray(R.array.rice_calories);
            _fat = res.getStringArray(R.array.rice_fat);
            _sodium = res.getStringArray(R.array.rice_sodium);
            _sugar = res.getStringArray(R.array.rice_sugar);
            _carb = res.getStringArray(R.array.rice_carb);
            _protein = res.getStringArray(R.array.rice_protein);
        }
        else if(category == 2){
            _name = res.getStringArray(R.array.noodle_name);
            _calories = res.getStringArray(R.array.noodle_calories);
            _fat = res.getStringArray(R.array.noodle_fat);
            _sodium = res.getStringArray(R.array.noodle_sodium);
            _sugar = res.getStringArray(R.array.noodle_sugar);
            _carb = res.getStringArray(R.array.noodle_carb);
            _protein = res.getStringArray(R.array.noodle_protein);
        }
        else if(category == 3){
            _name = res.getStringArray(R.array.soup_name);
            _calories = res.getStringArray(R.array.soup_calories);
            _fat = res.getStringArray(R.array.soup_fat);
            _sodium = res.getStringArray(R.array.soup_sodium);
            _sugar = res.getStringArray(R.array.soup_sugar);
            _carb = res.getStringArray(R.array.soup_carb);
            _protein = res.getStringArray(R.array.soup_protein);
        }
        else if(category == 4){
            _name = res.getStringArray(R.array.drink_name);
            _calories = res.getStringArray(R.array.drink_calories);
            _fat = res.getStringArray(R.array.drink_fat);
            _sodium = res.getStringArray(R.array.drink_sodium);
            _sugar = res.getStringArray(R.array.drink_sugar);
            _carb = res.getStringArray(R.array.drink_carb);
            _protein = res.getStringArray(R.array.drink_protein);
        }

        switch (item.getItemId()){
            case R.id.action_status:
                Intent intent = new Intent(this, nutrition_information.class);
                Bundle name = new Bundle();
                Bundle calories = new Bundle();
                Bundle fat = new Bundle();
                Bundle sodium = new Bundle();
                Bundle sugar = new Bundle();
                Bundle carb = new Bundle();
                Bundle protein = new Bundle();
                name.putString("nutrition", _name[position]);
                calories.putString("calories", _calories[position]);
                fat.putString("fat", _fat[position]);
                sodium.putString("sodium", _sodium[position]);
                sugar.putString("sugar", _sugar[position]);
                carb.putString("carb", _carb[position]);
                protein.putString("protein", _protein[position]);
                intent.putExtras(name);
                intent.putExtras(calories);
                intent.putExtras(fat);
                intent.putExtras(sodium);
                intent.putExtras(sugar);
                intent.putExtras(carb);
                intent.putExtras(protein);
                startActivity(intent);
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}