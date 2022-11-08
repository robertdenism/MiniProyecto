package com.example.miniproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;


public class LiberiIndex extends AppCompatActivity {

    RecyclerView reyclerViewUser;
    Button mas;
    Adapter adapter;

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
            reyclerViewUser.setHasFixedSize(true);

            // use a linear layout manager
            reyclerViewUser.setLayoutManager(new LiberiIndex(this));

            // specify an adapter with the list to show
            mAdapter = new UserAdapter(getData());
            reyclerViewUser.setAdapter(mAdapter);

        }

    }
}