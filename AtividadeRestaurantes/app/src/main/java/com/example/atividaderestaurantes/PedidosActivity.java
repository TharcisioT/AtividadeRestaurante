package com.example.atividaderestaurantes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PedidosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
    }

    // Método chamado pelo botão "Confirmar Endereço" no XML
    public void abrirNovaTela(View view) {
        Intent intent = new Intent(this, CadastroActivity.class); // Substitua NovaActivity pela sua nova atividade
        startActivity(intent);
    }
}
