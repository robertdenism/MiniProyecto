package com.example.miniproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.miniproyecto.R;

public class LogIn extends AppCompatActivity {

    Button botonEntrar;
    EditText usuario, contrasenia;

    String USU = "robertDenis";
    String CON = "Robert123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        botonEntrar = findViewById(R.id.botonEntrar);
        usuario = findViewById(R.id.usuario);
        contrasenia = findViewById(R.id.contrasenia);

        botonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u1 = String.valueOf(usuario.getText());
                String u2 = String.valueOf(contrasenia.getText());
                if((USU.equals(u1)) && (CON.equals(u2)) ){
                    mensaje();
                    entrada();
                }else{
                    mensaje2();
                }

            }
        });

    }
    public void mensaje(){
        Toast.makeText(this, "¡¡BIENVENIDO!!", Toast.LENGTH_LONG).show();
    }
    public void mensaje2(){
        Toast.makeText(this, "USUARIO O CONTRASEÑA NO VÁLIDO", Toast.LENGTH_LONG).show();
    }
    public void entrada(){
        Intent intento = new Intent(this, LiberiIndex.class);
        startActivity(intento);
    }
}