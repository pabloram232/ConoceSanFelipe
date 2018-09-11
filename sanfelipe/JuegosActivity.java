package com.utng.pabloram.sanfelipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.utng.pabloram.sanfelipe.R;

public class JuegosActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);

        this.setTitle(R.string.games);


        //DIRIGE A ROMPECABEZASUNO
        Button btnjuego = (Button) findViewById(R.id.btn_rompecabezas_uno);
        btnjuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), PuzzleOneActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        //DIRIGE A ROMPECABEZASUNO
        Button btnjuego2 = (Button) findViewById(R.id.btn_rompecabezas_dos);
        btnjuego2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), PuzzleTwoActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //DIRIGE A MEMORAMA
        Button btnmemorama = (Button) findViewById(R.id.btn_memorama);
        btnmemorama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MemoramaActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }



}