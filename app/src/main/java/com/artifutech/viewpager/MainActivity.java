package com.artifutech.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);



        arrayList.add(R.drawable.spiderman_img1);
        arrayList.add(R.drawable.ironman_img6);
        arrayList.add(R.drawable.luffy_img3);
        arrayList.add(R.drawable.naruto_img5);
        arrayList.add(R.drawable.zoro_img4);
        arrayList.add(R.drawable.spi);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,arrayList);
        viewPager.setAdapter(myAdapter);

       // viewPager.setCurrentItem(6);




    }
}