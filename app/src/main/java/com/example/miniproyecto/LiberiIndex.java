package com.example.miniproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class LiberiIndex extends AppCompatActivity {
    //

    RecyclerView reyclerViewUser;
    Button mas;
    Adapter adapter;
    TextView click, tituloLiberi;

    static String [] listado = {"Teatro","Museos","Música","Deportes","Cine","+PLanes","Plan2","Plan3","Plan4","Plan5","Plan6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            click = findViewById(R.id.nombreOcio);
            tituloLiberi = findViewById(R.id.tituloLiberi);



            reyclerViewUser = (RecyclerView) findViewById(R.id.recycledViewprincipal);

            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
            reyclerViewUser.setLayoutManager(layoutManager);

            // use a linear layout manager

            // specify an adapter with the list to show
            adapter = new Adapter(LiberiIndex.listado);
            reyclerViewUser.setAdapter(adapter);

            //Al pulsar en liberi salta un mensaje
            //no se puede hacer con el textView principal
            tituloLiberi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mensaje();
                }
            });
        }


    public void mensaje(){

        Toast.makeText(this, "¡¡BIENVENIDO!!", Toast.LENGTH_LONG).show();
    }

    }
