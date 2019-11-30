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

public class MainActivity extends AppCompatActivity  {

    public static TextView textoPrincipal;
    public static Button botaoEsquerda;
    public static Button botaoDireita;
    public static String Folha;
    private static Context contexto;



    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoPrincipal = findViewById(R.id.tvPrincipal);
        botaoDireita = findViewById(R.id.btnDireita);
        botaoEsquerda = findViewById(R.id.btnEsquerda);
        Execucao.Dados();
        No.Iniciaprograma(No.raiz);
       // No.inserir(8, "(Você prefere: 1)Ataque Físico " + "ou (2) Ataque Mágico?");
       // No.inserir(4, "Você pefere luta (1) Corpo a Corpo ou " + "(2) à distância?");
        MainActivity.contexto = getApplicationContext();

        do{
            if(Dados.trocaTela == true){
                Intent intent = new Intent(MainActivity.getContexto(), TelaFerreiro.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fede_in ,R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this , intent ,activityOptionsCompat.toBundle() );
            }

        }while (Dados.trocaTela != true);



//        MainActivity.botaoEsquerda.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////
////                Intent intent = new Intent(MainActivity.getContexto(), TelaFerreiro.class);
////                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fede_in ,R.anim.mover_direita);
////                ActivityCompat.startActivity(MainActivity.this , intent ,activityOptionsCompat.toBundle() );
////
////            }
////        });



        //startActivity(intent);


    }

    public static Context getContexto(){
        return MainActivity.contexto;
    }



    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void chamaTela (){
        Intent intent = new Intent(MainActivity.getContexto(), TelaFerreiro.class);
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fede_in ,R.anim.mover_direita);
        ActivityCompat.startActivity(MainActivity.this , intent ,activityOptionsCompat.toBundle() );
    }

}
