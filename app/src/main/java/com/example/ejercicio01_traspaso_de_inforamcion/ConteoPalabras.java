package com.example.ejercicio01_traspaso_de_inforamcion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ConteoPalabras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo_palabras);


        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            String frase = bundle.getString("Frase1");
            String[] palabras = frase.split(" ");
            Toast.makeText(this, frase, Toast.LENGTH_SHORT).show();
        }
    }

}