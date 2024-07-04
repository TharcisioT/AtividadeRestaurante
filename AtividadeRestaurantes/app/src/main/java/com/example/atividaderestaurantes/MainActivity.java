package com.example.atividaderestaurantes;

import static com.example.atividaderestaurantes.R.id.BotaoRestaurantes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRestaurantes = findViewById(R.id.BotaoRestaurantes);

        btnRestaurantes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir uma nova atividade (ou tela)
                Intent intent = new Intent(MainActivity.this, NovaGuiaRest.class);
                startActivity(intent);

            }
        });
        Button botaoPedidos = findViewById(R.id.BotaoPedidos);
        botaoPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PedidosActivity.class);
                startActivity(intent);
            }
        });

    }

    }






