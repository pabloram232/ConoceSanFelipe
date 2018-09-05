package com.example.pabloram.sanfelipe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantDescriptionActivity extends AppCompatActivity {
    private ImageButton re;
    private ImageButton me;
    TextView txtView;
    ImageView imgView;
    String r1;
    String desc;
    int r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_bares);

        txtView=(TextView) findViewById(R.id.txt_name);
        imgView=(ImageView) findViewById(R.id.iv_logo);

        Bundle bundle = getIntent().getExtras();

        r1=bundle.getString("Lenguajes");
        r2=bundle.getInt("imgid");
        desc=bundle.getString("descripcion");

        imgView.setImageResource(r2);
        txtView.setText(r1);
        txtView.setText(desc);
        Log.d("imagen ","imgid "+r2);
        Log.d("imagen ","imgid "+r1);
        Log.d("imagen ","imgid "+desc);

        if (r2 == 2131099855) {
            ///ABRE FACEBOOK LA RAMONA
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/325660297449858";
                    String urlPage = "https://www.facebook.com/laramonacruderia/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }

        if (r2 == 2131099878) {
            ///ABRE FACEBOOK VIEJON
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/1377884388905040";
                    String urlPage = "https://www.facebook.com/Mariscos-El-Viej%C3%B3n-1377884388905040/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }

        if (r2 == 2131099743) {
            ///ABRE FACEBOOK CASONA
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/347648655420241";
                    String urlPage = "https://www.facebook.com/pages/La-Casona-Restaurant/347648655420241?fb_dtsg_ag=AdyDdoSH4tpHV1u5ilj_AOMoz2j0DgGqQYk20U7Z6zJ2hA%3AAdzXW2hbPf7OdeibKUDGMmxmuMn_HLYXxHdICk_iF0iRDw&rf=748127438633728";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }

        if (r2 == 2131099873) {
            ///ABRE FACEBOOK STOP
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/470094199718980";
                    String urlPage = "https://www.facebook.com/RestaurantPizzaStopSanFe/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }


        if (r2 == 2131099840) {
            ///ABRE FACEBOOK PATOS
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/678576878861285";
                    String urlPage = "https://www.facebook.com/patos.pizza.sanfelipe/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }
        if (r2 == 2131099877) {
            ///ABRE FACEBOOK TORTUGA
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/281551585609097";
                    String urlPage = "https://www.facebook.com/La-tortuga-281551585609097/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }
        if (r2 == 2131099765) {
            ///ABRE FACEBOOK DELFIN
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/1553099934971316";
                    String urlPage = "https://www.facebook.com/Restaurante-El-Delfin-1553099934971316/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }
        if (r2 == 2131099791) {
            ///ABRE FACEBOOK HENRYS
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/1375979029096278";
                    String urlPage = "https://www.facebook.com/Henrys-Pizza-Wings-1375979029096278/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }



    }
}
