package com.example.pabloram.sanfelipe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //DIRIGE A HISTORIA
        Button btnHistory = (Button) findViewById(R.id.btn_history);
        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), HistoryActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        ///ABRE PAGINA WEB
        ImageButton btnWeb = (ImageButton) findViewById(R.id.btn_web);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://sanfelipegto.gob.mx/inicio.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ///ABRE FACEBOOK
        ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookId = "fb://page/216166135196452";
                String urlPage = "https://es-la.facebook.com/Turismo.San.Felipe.gto/";

                //VALIDA SI LA APLICACION ESTA INSTALADA LA ABRE CON LA APP DE FACEBOOK

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                } catch (Exception e) {

                    //Abre url de pagina.
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                }
            }
        });

        //DIRIGE A AcercaDe
        ImageButton btnAcerca = (ImageButton) findViewById(R.id.btn_about);
        btnAcerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AbautActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //DIRIGE A activity_juegos
        Button btnjuegos = (Button) findViewById(R.id.btn_games);
        btnjuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), JuegosActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //DIRIGE A activity_galeria
        Button btngaleria = (Button) findViewById(R.id.btn_gallery);
        btngaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GalleryActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //DIRIGE A BARES
        Button btnbares = (Button) findViewById(R.id.btn_bares);
        btnbares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BaresActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //DIRIGE A HOTELES
        Button btnhotels = (Button) findViewById(R.id.btn_hotels);
        btnhotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), HotelesActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //DIRIGE A Restaurant
        Button btnrestaurant = (Button) findViewById(R.id.btn_restaurant);
        btnrestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RestaurantActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
