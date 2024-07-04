package com.example.atividaderestaurantes;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class NovaGuiaRest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_nova_guia_rest);

        ConstraintLayout mainLayout = findViewById(R.id.main);

        // Verificar a versão do Android e aplicar o ajuste de margens conforme necessário
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
            mainLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    v.setPadding(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(),
                            insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
                    return insets;
                }
            });
        }
    }

    // Método para habilitar o edge-to-edge display
    private void enableEdgeToEdge() {
        // Implementar funcionalidade edge-to-edge aqui se necessário
        // Exemplo: getWindow().setDecorFitsSystemWindows(false);
    }

    // Método para abrir a nova guia quando o botão for clicado
    public void abrirGuiaUm(View view) {
        // Abrir uma nova atividade (ou tela)
        Intent intent = new Intent(this, BotaoRobertinho.class);
        startActivity(intent);
    }
    public void abrirGuiaDois(View view) {
        // Abrir uma nova atividade (ou tela)
        Intent intent = new Intent(this, BotaoKalifas.class);
        startActivity(intent);
    }
    public void abrirGuiaTres(View view) {
        // Abrir uma nova atividade (ou tela)
        Intent intent = new Intent(this, BotaoArapongas.class);
        startActivity(intent);
    }
}
