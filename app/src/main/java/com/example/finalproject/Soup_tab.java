package com.example.finalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class Soup_tab extends Fragment {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        return inflater.inflate(R.layout.activity_soup_tab, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //super.onCreate(savedInstanceState);
        View v = getView();
        LinkedList<String> mWordList = new LinkedList<String>();
        LinkedList<String> mDetailList = new LinkedList<String>();
        LinkedList<Integer> mPictureList = new LinkedList<>();
        //這個activity會列出所有飯食的料理
        //更改料理的名字
        mWordList.add("Bak Kut Teh (肉骨茶)");
        mWordList.add("Vietnamese Sweet and Sour Soup (越式酸辣湯)");
        mWordList.add("Tom Yum Soup (泰式冬陰湯)");
        mWordList.add("Artiso Soup (越式百合花湯)");

        //加每個料理的縮圖
        mPictureList.add(R.drawable.bak_kut_teh);
        mPictureList.add(R.drawable.canh_chua);
        mPictureList.add(R.drawable.tom_yum);
        mPictureList.add(R.drawable.canh_artiso);

        // Get a handle to the RecyclerView.
        mRecyclerView = v.findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(getActivity(), mWordList, mPictureList, 3);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
