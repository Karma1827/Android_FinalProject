package com.example.finalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class Noodle_tab extends Fragment {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_noodle_tab, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //super.onCreate(savedInstanceState);
        View v = getView();
        LinkedList<String> mWordList = new LinkedList<String>();
        LinkedList<Integer> mPictureList = new LinkedList<>();
        //這個activity會列出所有飯食的料理
        //更改料理的名字
        mWordList.add("Vietnamese Spicy Beef Noodle (越南順化米線)");
        mWordList.add("Vietnamese Tomato Noodle (越式紅燒番茄米線)");
        mWordList.add("Vietnamese Pork Vermicelli (越式烤肉米線)");
        mWordList.add("PENANG FRIED FLAT NOODLES (炒粿條)");
        mWordList.add("Laksa (叻沙)");
        mWordList.add("Vietnamese Beef Noodle (越南牛肉河粉)");

        //改料理的縮圖
        mPictureList.add(R.drawable.bun_bo_hue);
        mPictureList.add(R.drawable.bun_rieu);
        mPictureList.add(R.drawable.bun_thit_nuong);
        mPictureList.add(R.drawable.fried_noodle);
        mPictureList.add(R.drawable.laksa);
        mPictureList.add(R.drawable.pho);

        // Get a handle to the RecyclerView.
        mRecyclerView = v.findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(getActivity(), mWordList, mPictureList, 2);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
