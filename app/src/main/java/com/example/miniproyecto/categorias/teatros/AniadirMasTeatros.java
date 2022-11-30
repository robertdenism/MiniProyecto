package com.example.miniproyecto.categorias.teatros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.miniproyecto.R;

import java.util.List;

public class AniadirMasTeatros extends AppCompatActivity {

    Button bAniadirTeatro , bBorrarTeatro, bRefrescarTeatro, bVolverTeatros;
    EditText addNombreTeatro, addCategoiaTeatro, addDescripcionTeatro, addDireccionTeatro;
    TextView datosTeatros;
    BaseDatosTeatros db;
    LlamadasTablaTeatroDao teatrosDAO;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniadir_mas_teatros);

        bAniadirTeatro = findViewById(R.id.bAniadirTeatro);
        bBorrarTeatro = findViewById(R.id.bBorrarTeatro);
        bRefrescarTeatro = findViewById(R.id.bRefrescarTeatro);
        bVolverTeatros = findViewById(R.id.bVolverTeatros);

        addNombreTeatro = findViewById(R.id.addTituloTeatro);
        addCategoiaTeatro = findViewById(R.id.addCategoriaTeatro);
        addDescripcionTeatro = findViewById(R.id.addDescripcionTeatro);
        addDireccionTeatro = findViewById(R.id.addDireccionTeatro);

        Intent b = getIntent();




        bVolverTeatros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bAniadirTeatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TablasTeatro t = new TablasTeatro();
                t.tituloTeatro = addNombreTeatro.getText().toString();
                t.categoriaTeatro = addCategoiaTeatro.getText().toString();
                t.descripciopnTeatro = addDescripcionTeatro.getText().toString();
                t.direccionaTeatro = addDescripcionTeatro.getText().toString();
                teatrosDAO.insertAll(t);
            }
        });

        bRefrescarTeatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<TablasTeatro> teatros = teatrosDAO.getAll();
                String tDatos ="";
                for(TablasTeatro a : teatros){
                    tDatos += a.tituloTeatro + " - " + a.categoriaTeatro + " - " + a.descripciopnTeatro + " - " + a.direccionaTeatro + "\n";
                }
                datosTeatros.setText(tDatos);
            }
        });

        bBorrarTeatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<TablasTeatro> teatros = teatrosDAO.getAll();
                for (TablasTeatro a : teatros){

                }
                //teatrosDAO.delete(TablasTeatro, addNombreTeatro.getText().toString());
            }
        });



    }



}