package com.example.rpg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView textoPrincipal;
    public static Button botaoEsquerda;
    public static Button botaoDireita;
    public static String Folha;
    private static Context contexto;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoPrincipal = findViewById(R.id.tvPrincipal);
        botaoDireita = findViewById(R.id.btnDireita);
        botaoEsquerda = findViewById(R.id.btnEsquerda);
        Execucao.Dados();
        Iniciaprograma(No.raiz);
        MainActivity.contexto = getApplicationContext();

    }

    public void Iniciaprograma(final No node) {
        if (node.esquerda == null && node.direita == null) // teste se o nó é folha, sendo assim resposta final
        {
            MainActivity.Folha = node.conteudo;
            Intent intent = new Intent(MainActivity.getContexto(), TelaFerreiro.class);
            ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fede_in, R.anim.mover_direita);
            ActivityCompat.startActivity(MainActivity.this, intent, activityOptionsCompat.toBundle());

        } else {
            MainActivity.textoPrincipal.setText(node.conteudo);

            MainActivity.botaoDireita.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Iniciaprograma(node.direita);
                }
            });
            MainActivity.botaoEsquerda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Iniciaprograma(node.esquerda);
                }
            });
        }
    }


    public static Context getContexto() {
        return MainActivity.contexto;
    }


}
