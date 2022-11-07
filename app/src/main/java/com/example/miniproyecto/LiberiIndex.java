package com.example.miniproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LiberiIndex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }
}