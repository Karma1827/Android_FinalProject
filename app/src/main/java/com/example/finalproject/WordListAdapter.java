package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;

//這個class是用來產生料理的列表，我多了傳入mMode來控制要顯示哪種類別的列表。
//mMode = 0 -> 飯食
//mMode = 1 -> 麵食
//mMode = 2 -> 甜點
//如果按了列表中的其中一個，就會進入到FullRecipe裡。
//mMode會一起傳入FullRecipe裡，用來控制要顯示哪一類中第幾個的完整食譜。
public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private final LinkedList<String> mWordList;
    private final LinkedList<String> mDetailList;
    private final LinkedList<Integer> mPictureList;
    private int mMode = 0;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> wordList, LinkedList<String> detailList, LinkedList<Integer> pictureList, int mode) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
        this.mDetailList = detailList;
        this.mPictureList = pictureList;
        this.mMode = mode;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
        mCurrent = mDetailList.get(position);
        holder.detailItemView.setText(mCurrent);
        Integer mPicture = mPictureList.get(position);
        holder.pictureItemView.setImageResource(mPicture);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView wordItemView;
        public final TextView detailItemView;
        public final ImageView pictureItemView;
        final WordListAdapter mAdapter;
        public static final String EXTRA_MESSAGE = "com.example.android.activity_full_recipe.extra.MESSAGE";
        public static final String EXTRA_MESSAGE2 = "com.example.android.activity_full_recipe.extra.MESSAGE";
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            detailItemView = itemView.findViewById(R.id.detail);
            pictureItemView = itemView.findViewById(R.id.picture);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            Intent intent = new Intent(v.getContext(), FullRecipe.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(EXTRA_MESSAGE, Integer.toString(mPosition));
            intent.putExtra(EXTRA_MESSAGE2, Integer.toString(mMode));
            v.getContext().startActivity(intent);
        }
    }
}