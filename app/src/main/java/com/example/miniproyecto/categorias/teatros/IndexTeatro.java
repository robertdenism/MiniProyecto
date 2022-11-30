package com.example.miniproyecto.categorias.teatros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.miniproyecto.Adapter;
import com.example.miniproyecto.LiberiIndex;
import com.example.miniproyecto.R;

public class IndexTeatro extends AppCompatActivity {

    BaseDatosTeatros db;
    RecyclerView recyclerViewUser;
    AdapterTeatro adapter;
    LlamadasTablaTeatroDao teatroDao;
    Button bAniadir, bVolver;

    static String [] listado = {"Teatro","Museos","Música","Deportes","Cine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_teatro);

        // en esta parte implemento el recyclerView en el Main el adapter y la db
            recyclerViewUser = (RecyclerView) findViewById(R.id.RecyclerPrincipalTeatro);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
            recyclerViewUser.setLayoutManager(layoutManager);

            adapter = new AdapterTeatro(IndexTeatro.listado);
            recyclerViewUser.setAdapter(adapter);

            db = Room.databaseBuilder(getApplicationContext(),
                BaseDatosTeatros.class, "database-name").allowMainThreadQueries().build();
            teatroDao = db.teatrosDao();

         //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

            Intent intento = getIntent();

            bAniadir = findViewById(R.id.bAniadir);
            bVolver = findViewById(R.id.bVolver);

            bVolver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            bAniadir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    lanzarAniadir();
                }
            });



    }

    public void lanzarAniadir(){
        Intent b = new Intent(this, AniadirMasTeatros.class);
        startActivity(b);
    }


}