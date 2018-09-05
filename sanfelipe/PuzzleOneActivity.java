package com.example.pabloram.sanfelipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.Toast;

public class PuzzleOneActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView[] imgPieza = new ImageView[12];
    Chronometer contador;

    int [] juego = new int[12];
    int piezaSeleccion1, piezaSeleccion2;
    int[] imagenes = {
            R.drawable.pieza1, R.drawable.pieza2, R.drawable.pieza3,
            R.drawable.pieza4, R.drawable.pieza5, R.drawable.pieza6,
            R.drawable.pieza7, R.drawable.pieza8, R.drawable.pieza9,
            R.drawable.pieza10, R.drawable.pieza11, R.drawable.pieza12
    };

    int seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_one);

        imgPieza[0] = (ImageView) findViewById(R.id.imgPieza1);
        imgPieza[1] = (ImageView) findViewById(R.id.imgPieza2);
        imgPieza[2] = (ImageView) findViewById(R.id.imgPieza3);
        imgPieza[3] = (ImageView) findViewById(R.id.imgPieza4);
        imgPieza[4] = (ImageView) findViewById(R.id.imgPieza5);
        imgPieza[5] = (ImageView) findViewById(R.id.imgPieza6);
        imgPieza[6] = (ImageView) findViewById(R.id.imgPieza7);
        imgPieza[7] = (ImageView) findViewById(R.id.imgPieza8);
        imgPieza[8] = (ImageView) findViewById(R.id.imgPieza9);
        imgPieza[9] = (ImageView) findViewById(R.id.imgPieza10);
        imgPieza[10] = (ImageView) findViewById(R.id.imgPieza11);
        imgPieza[11] = (ImageView) findViewById(R.id.imgPieza12);

        for(int i = 0 ; i < 12 ; i++){
            imgPieza[i].setOnClickListener(this);
            juego[i]=-1;
        }

        contador = (Chronometer) findViewById(R.id.contador);

        seleccion = 0;
        asignarImagenes();

    }

    private void asignarImagenes()
    {
        int imagen;
        boolean repetido;

        for (int i=0 ; i<12;)
        {

            repetido=false;
            imagen = (int)(Math.random()*12);

            for(int j = 0; j < juego.length ; j++){
                if(juego[j]==imagen){
                    repetido = true;
                    break;
                }
            }

            if(!repetido){
                juego[i] = imagen;
                Log.d("IMG", "" + imagen);
                try {
                    imgPieza[i].setImageResource(imagenes[imagen]);
                }catch (Exception e){
                    Log.e("ERROR", "" + e.getMessage());
                }
                i++;
            }
        }

        contador.start();

    }

    @Override
    public void onClick(View v) {

        int posicion=-1;

        switch (v.getId()){
            case R.id.imgPieza1:
                posicion = 0;
                break;
            case R.id.imgPieza2:
                posicion = 1;
                break;
            case R.id.imgPieza3:
                posicion = 2;
                break;
            case R.id.imgPieza4:
                posicion = 3;
                break;
            case R.id.imgPieza5:
                posicion = 4;
                break;
            case R.id.imgPieza6:
                posicion = 5;
                break;
            case R.id.imgPieza7:
                posicion = 6;
                break;
            case R.id.imgPieza8:
                posicion = 7;
                break;
            case R.id.imgPieza9:
                posicion = 8;
                break;
            case R.id.imgPieza10:
                posicion = 9;
                break;
            case R.id.imgPieza11:
                posicion = 10;
                break;
            case R.id.imgPieza12:
                posicion = 11;
                break;
        }

        if(seleccion ==0){

            piezaSeleccion1 = posicion;
            seleccion = 1;

        }else if(seleccion == 1){

            piezaSeleccion2 = posicion;
            seleccion = 0;
            cambiarPiezas();

        }

    }

    private void cambiarPiezas(){

        imgPieza[piezaSeleccion1].setImageResource(imagenes[juego[piezaSeleccion2]]);
        imgPieza[piezaSeleccion2].setImageResource(imagenes[juego[piezaSeleccion1]]);

        int imgTemp1, imgTemp2;

        imgTemp1 = juego[piezaSeleccion1];
        imgTemp2 = juego[piezaSeleccion2];

        juego[piezaSeleccion1] = imgTemp2;
        juego[piezaSeleccion2] = imgTemp1;

        boolean verificador = true;

        //Log.d("IMG", "" +  "----------");
        for(int i = 0; i < juego.length ; i++){
            if(juego[i]!=i){
                verificador = false;
                break;
            }
            //Log.d("IMG", "" + activity_puzzle_one[i]);
        }

        if (verificador){
            contador.stop();
            for(int i = 0 ; i < 12 ; i++){
                imgPieza[i].setEnabled(false);
            }
            Toast.makeText(this, "Felicidades has logrado armar el rompecabezas en " + contador.getText().toString(), Toast.LENGTH_SHORT).show();
        }

    }

}
