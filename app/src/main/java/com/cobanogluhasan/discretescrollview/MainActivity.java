package com.cobanogluhasan.discretescrollview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DiscreteScrollView picker;
    private Words words;

    private List<Item> data;
    private InfiniteScrollAdapter infiniteAdapter;
    TextView word;
    TextView synonym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        word = (TextView) findViewById(R.id.word);
        synonym = (TextView) findViewById(R.id.synonym);


        words = Words.get();
        data = words.getData();
        picker  = (DiscreteScrollView) findViewById(R.id.picker);
     //   picker.setOverScrollEnabled(true);

     /*   picker.addOnItemChangedListener(new DiscreteScrollView.OnItemChangedListener<RecyclerView.ViewHolder>() {
            @Override
            public void onCurrentItemChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
           

            }
        });*/
        infiniteAdapter = InfiniteScrollAdapter.wrap(new ItemAdapter((Context) data));
        picker.setAdapter(infiniteAdapter);


       ItemAdapter itemAdapter = new ItemAdapter(this);










    }








}