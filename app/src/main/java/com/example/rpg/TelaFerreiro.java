package com.example.rpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TelaFerreiro extends AppCompatActivity {

    public static TextView tvFerreiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ferreiro);
        tvFerreiro = findViewById(R.id.tvFerreiro);
        tvFerreiro.setText(MainActivity.Folha);
    }
}
