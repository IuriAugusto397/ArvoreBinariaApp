package com.example.rpg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaFinal extends AppCompatActivity implements View.OnClickListener {

    public static TextView tvFerreiro;
    public Button restartButton;
    public ConstraintLayout tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);
        tela = findViewById(R.id.bg);
        switch (MainActivity.aSSert){
            case 1:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgferreiroecavaleiro));
                break;
            case 3:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgpaladino));
                break;
            case 5:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgranger));
                break;
            case 7:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgbardo));
                break;
            case 9:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgmonge));
                break;
            case 11:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgalquimista));
                break;
            case 13:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgmago));
                break;
            case 15:
                tela.setBackground(this.getResources().getDrawable(R.drawable.bgclerigo));
                break;
        }
        restartButton = findViewById(R.id.btnRestart);
        tvFerreiro = findViewById(R.id.tvFerreiro);
        tvFerreiro.setText(MainActivity.Folha);
        restartButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}
