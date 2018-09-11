package com.utng.pabloram.sanfelipe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.Toast;
import com.utng.pabloram.sanfelipe.R;

public class PuzzleTwoActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView[] imgPieza = new ImageView[25];
    Chronometer contador;

    int [] juego = new int[25];
    int piezaSeleccion1, piezaSeleccion2;
    int[] imagenes = {
            R.drawable.p1, R.drawable.p2, R.drawable.p3,
            R.drawable.p4, R.drawable.p5, R.drawable.p6,
            R.drawable.p7, R.drawable.p8, R.drawable.p9,
            R.drawable.p10, R.drawable.p11, R.drawable.p12,
            R.drawable.p13, R.drawable.p14, R.drawable.p15,
            R.drawable.p16, R.drawable.p17, R.drawable.p18,
            R.drawable.p19, R.drawable.p20, R.drawable.p21,
            R.drawable.p22, R.drawable.p23, R.drawable.p24,
             R.drawable.p25
    };

    int seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_two);

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
        imgPieza[12] = (ImageView) findViewById(R.id.imgPieza13);
        imgPieza[13] = (ImageView) findViewById(R.id.imgPieza14);
        imgPieza[14] = (ImageView) findViewById(R.id.imgPieza15);
        imgPieza[15] = (ImageView) findViewById(R.id.imgPieza16);
        imgPieza[16] = (ImageView) findViewById(R.id.imgPieza17);
        imgPieza[17] = (ImageView) findViewById(R.id.imgPieza18);
        imgPieza[18] = (ImageView) findViewById(R.id.imgPieza19);
        imgPieza[19] = (ImageView) findViewById(R.id.imgPieza20);
        imgPieza[20] = (ImageView) findViewById(R.id.imgPieza21);
        imgPieza[21] = (ImageView) findViewById(R.id.imgPieza22);
        imgPieza[22] = (ImageView) findViewById(R.id.imgPieza23);
        imgPieza[23] = (ImageView) findViewById(R.id.imgPieza24);
        imgPieza[24] = (ImageView) findViewById(R.id.imgPieza25);


        for(int i = 0 ; i < 25 ; i++){
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

        for (int i=0 ; i<25;)
        {

            repetido=false;
            imagen = (int)(Math.random()*25);

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
            case R.id.imgPieza13:
                posicion = 12;
                break;
            case R.id.imgPieza14:
                posicion = 13;
                break;
            case R.id.imgPieza15:
                posicion = 14;
                break;
            case R.id.imgPieza16:
                posicion = 15;
                break;
            case R.id.imgPieza17:
                posicion = 16;
                break;
            case R.id.imgPieza18:
                posicion = 17;
                break;
            case R.id.imgPieza19:
                posicion = 18;
                break;
            case R.id.imgPieza20:
                posicion = 19;
                break;
            case R.id.imgPieza21:
                posicion = 20;
                break;
            case R.id.imgPieza22:
                posicion = 21;
                break;
            case R.id.imgPieza23:
                posicion = 22;
                break;
            case R.id.imgPieza24:
                posicion = 23;
                break;
            case R.id.imgPieza25:
                posicion = 24;
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
            //Log.d("IMG", "" + puzzleone[i]);
        }

        if (verificador){
            contador.stop();
            for(int i = 0 ; i < 25 ; i++){
                imgPieza[i].setEnabled(false);
            }
            Toast.makeText(this, "Felicidades has logrado armar el rompecabezas en " + contador.getText().toString(), Toast.LENGTH_SHORT).show();
        }

    }

}

