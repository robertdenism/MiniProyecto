package com.example.miniproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.miniproyecto.categorias.teatros.IndexTeatro;


public class LiberiIndex extends AppCompatActivity {
    //

    RecyclerView reyclerViewUser;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            reyclerViewUser = (RecyclerView) findViewById(R.id.recycledViewprincipal);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
            reyclerViewUser.setLayoutManager(layoutManager);

            // specify an adapter with the list to show
            adapter = new Adapter(ListadoOcios.generador().toArray(new ListadoOcios[0]), new Adapter.OnItemClickListener() {
                @Override
                public void onItemClick(ListadoOcios item) {
                    abrirNueva(item);
                }
            });
            reyclerViewUser.setAdapter(adapter);

        }
        public void abrirNueva(ListadoOcios item){
            Intent intento = new Intent(this, IndexTeatro.class);
            startActivity(intento);
        }

    }
