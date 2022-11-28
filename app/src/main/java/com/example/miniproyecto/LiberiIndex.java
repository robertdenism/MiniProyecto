package com.example.miniproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class LiberiIndex extends AppCompatActivity {
    //

    RecyclerView reyclerViewUser;
    Adapter adapter;

    Button mas, boton1;

    static String [] listado = {"Teatro","Museos","Música","Deportes","Cine"};
    //static List<String> listado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            reyclerViewUser = (RecyclerView) findViewById(R.id.recycledViewprincipal);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
            reyclerViewUser.setLayoutManager(layoutManager);

            // specify an adapter with the list to show
            adapter = new Adapter(LiberiIndex.listado);
            reyclerViewUser.setAdapter(adapter);

        }
    }
