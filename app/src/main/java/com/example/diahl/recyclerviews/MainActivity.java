package com.example.diahl.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models = new ArrayList<>();

        Model mod = new Model();
        mod = new Model();
        mod.setTitle("Instagram");
        mod.setDescription("launched on Oktober 6, 2010");
        mod.setImg(R.drawable.instagram);
        models.add(mod);

        mod = new Model();
        mod.setTitle("Line");
        mod.setDescription("launched on June 23, 2011");
        mod.setImg(R.drawable.line);
        models.add(mod);

        mod = new Model();
        mod.setTitle("Snapchat");
        mod.setDescription("launched on July 8, 2011");
        mod.setImg(R.drawable.snapchat);
        models.add(mod);

        mod = new Model();
        mod.setTitle("Twitter");
        mod.setDescription("launched on March 21, 2006");
        mod.setImg(R.drawable.twitter);
        models.add(mod);

        mod = new Model();
        mod.setTitle("Whatsapp");
        mod.setDescription("launched on May 3, 2009");
        mod.setImg(R.drawable.whatsapp);
        models.add(mod);

        mod = new Model();
        mod.setTitle("Yahoo");
        mod.setDescription("launched on January, 1994");
        mod.setImg(R.drawable.yahoo);
        models.add(mod);

        return models;
    }
}
