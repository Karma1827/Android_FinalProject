package com.example.finalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class All_tab extends Fragment {
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
        //super.onCreate(savedInstanceState);
        View v = getView();
        LinkedList<String> mWordList = new LinkedList<String>();
        LinkedList<Integer> mPictureList = new LinkedList<>();

        //更改料理的名字
        mWordList.add("Vietnamese Broken Rice (越式碎米飯)");
        mWordList.add("Malay Coconut Milk Rice (椰醬飯)");
        mWordList.add("Hainanese Chicken Rice (海南雞飯)");
        mWordList.add("Indonesian Fried Rice (印尼炒飯)");
        mWordList.add("Vietnamese Pineapple Fried Rice (越式鳳梨炒飯)");
        mWordList.add("Thai Basil Chicken Rice (泰式打拋雞飯)");
        mWordList.add("Vietnamese Spicy Beef Noodle (越南順化米線)");
        mWordList.add("Vietnamese Tomato Noodle (越式紅燒番茄米線)");
        mWordList.add("Vietnamese Pork Vermicelli (越式烤肉米線)");
        mWordList.add("PENANG FRIED FLAT NOODLES (炒粿條)");
        mWordList.add("Laksa (叻沙)");
        mWordList.add("Vietnamese Beef Noodle (越南牛肉河粉)");
        mWordList.add("Bak Kut Teh (肉骨茶)");
        mWordList.add("Vietnamese Sweet and Sour Soup (越式酸辣湯)");
        mWordList.add("Tom Yum Soup (泰式冬陰湯)");
        mWordList.add("Artiso Soup (越式百合花湯)");
        mWordList.add("Vietnamese Coffee (越南咖啡)");
        mWordList.add("Pulled Tea (印度拉茶)");
        mWordList.add("Milo (冰美祿)");

        //更改料理的縮圖
        mPictureList.add(R.drawable.com_tam);
        mPictureList.add(R.drawable.nasi_lemak);
        mPictureList.add(R.drawable.hainan_rice);
        mPictureList.add(R.drawable.indon_rice);
        mPictureList.add(R.drawable.pineapple_rice);
        mPictureList.add(R.drawable.thai_basil_chicken);
        mPictureList.add(R.drawable.bun_bo_hue);
        mPictureList.add(R.drawable.bun_rieu);
        mPictureList.add(R.drawable.bun_thit_nuong);
        mPictureList.add(R.drawable.fried_noodle);
        mPictureList.add(R.drawable.laksa);
        mPictureList.add(R.drawable.pho);
        mPictureList.add(R.drawable.bak_kut_teh);
        mPictureList.add(R.drawable.canh_chua);
        mPictureList.add(R.drawable.tom_yum);
        mPictureList.add(R.drawable.canh_artiso);
        mPictureList.add(R.drawable.coffee);
        mPictureList.add(R.drawable.pulled_tea);
        mPictureList.add(R.drawable.milo);

        // Get a handle to the RecyclerView.
        mRecyclerView = v.findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(getActivity(), mWordList, mPictureList, 0);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
