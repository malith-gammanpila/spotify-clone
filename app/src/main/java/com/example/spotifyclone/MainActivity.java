package com.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewRecentlyPlayed;
    Adapter adapter;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("You are the angle");
        items.add("Sample song");
        items.add("Jumala song feat Rex");
        items.add("Bla bla blaaaaa 12");

        recyclerViewRecentlyPlayed = findViewById(R.id.recyclerViewRecentlyPlayed);
        recyclerViewRecentlyPlayed.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Item decoration
        recyclerViewRecentlyPlayed.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));

        adapter = new Adapter(this, items);
        recyclerViewRecentlyPlayed.setAdapter(adapter);
    }
}