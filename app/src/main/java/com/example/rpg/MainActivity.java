package com.example.rpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    public static TextView textoPrincipal;
    public static Button botaoEsquerda;
    public static Button botaoDireita;
    public static boolean ladoNo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoPrincipal = findViewById(R.id.tvPrincipal);
        botaoDireita = findViewById(R.id.btnDireita);
        botaoEsquerda = findViewById(R.id.btnEsquerda);
        Execucao.Dados();
        No.Iniciaprograma(No.raiz);
       // No.inserir(8, "(Você prefere: 1)Ataque Físico " + "ou (2) Ataque Mágico?");
       // No.inserir(4, "Você pefere luta (1) Corpo a Corpo ou " + "(2) à distância?");


    }


}
