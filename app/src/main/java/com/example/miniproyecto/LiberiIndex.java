package com.example.miniproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;


public class LiberiIndex extends AppCompatActivity {
    //pruebaPrivado

    RecyclerView reyclerViewUser;
    Button mas;
    Adapter adapter;

    static String [] listado = {"Teatro","Museos","Música","Deportes","Cine","+PLanes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

            reyclerViewUser = (RecyclerView) findViewById(R.id.recycledViewprincipal);

            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
            reyclerViewUser.setLayoutManager(layoutManager);

            // use a linear layout manager

            // specify an adapter with the list to show
            adapter = new Adapter(LiberiIndex.listado);
            reyclerViewUser.setAdapter(adapter);

        }
    }
