package com.example.finalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class Drink_tab extends Fragment {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        return inflater.inflate(R.layout.activity_drink_tab, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View v = getView();
        LinkedList<String> mWordList = new LinkedList<String>();
        LinkedList<Integer> mPictureList = new LinkedList<>();

        //更改料理的名字
        mWordList.add("Vietnamese Coffee (越南咖啡)");
        mWordList.add("Pulled Tea (印度拉茶)");
        mWordList.add("Milo (冰美祿)");

        //加每個料理的縮圖
        mPictureList.add(R.drawable.coffee);
        mPictureList.add(R.drawable.pulled_tea);
        mPictureList.add(R.drawable.milo);

        mRecyclerView = v.findViewById(R.id.recyclerView);
        mAdapter = new WordListAdapter(getActivity(), mWordList, mPictureList, 4);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
