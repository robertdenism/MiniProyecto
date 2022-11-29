package com.example.miniproyecto.categorias.teatros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Context;
import android.os.Bundle;

import com.example.miniproyecto.Adapter;
import com.example.miniproyecto.LiberiIndex;
import com.example.miniproyecto.R;

public class IndexTeatro extends AppCompatActivity {

    BaseDatosTeatros db;
    RecyclerView recyclerViewUser;
    AdapterTeatro adapter;
    LlamadasTablaTeatroDao teatroDao;

    static String [] listado = {"Teatro","Museos","Música","Deportes","Cine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_teatro);

            recyclerViewUser = (RecyclerView) findViewById(R.id.RecyclerPrincipalTeatro);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
            recyclerViewUser.setLayoutManager(layoutManager);

            adapter = new AdapterTeatro(IndexTeatro.listado);
            recyclerViewUser.setAdapter(adapter);

            db = Room.databaseBuilder(getApplicationContext(),
                BaseDatosTeatros.class, "database-name").allowMainThreadQueries().build();
            teatroDao = db.teatrosDao();


    }




}