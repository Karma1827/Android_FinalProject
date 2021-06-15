package com.example.finalproject;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

public class Rice_tab extends Fragment {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private Activity mActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_rice_tab, container, false);
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
        mWordList.add("Vietnamese Broken Rice (越式碎米飯)");
        mWordList.add("Malay Coconut Milk Rice (椰醬飯)");
        mWordList.add("Hainanese Chicken Rice (海南雞飯)");
        mWordList.add("Indonesian Fried Rice (印尼炒飯)");
        mWordList.add("Vietnamese Pineapple Fried Rice (越式鳳梨炒飯)");
        mWordList.add("Thai Basil Chicken Rice (泰式打拋雞飯)");

        //更改料理的縮圖
        mPictureList.add(R.drawable.com_tam);
        mPictureList.add(R.drawable.nasi_lemak);
        mPictureList.add(R.drawable.hainan_rice);
        mPictureList.add(R.drawable.indon_rice);
        mPictureList.add(R.drawable.pineapple_rice);
        mPictureList.add(R.drawable.thai_basil_chicken);

        if(getActivity() == null){
            Log.d("Activity", "Activity is null.");
        }
        // Get a handle to the RecyclerView.
        mRecyclerView = v.findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(getActivity(), mWordList, mPictureList, 1);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

}