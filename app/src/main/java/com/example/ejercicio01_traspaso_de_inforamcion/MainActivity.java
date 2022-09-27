package com.example.ejercicio01_traspaso_de_inforamcion;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnPalabras;
    private Button btnCaracteres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                Intent intent = new Intent(MainActivity.this, ConteoPalabras.class);
                Bundle bundle = new Bundle();
                bundle.putString("Frase1",frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                Intent intent = new Intent(MainActivity.this,ConteoCaracteres.class);
                Bundle bundle = new Bundle();
                bundle.putString("Frase2",frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void inicializarVistas() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
    }


}