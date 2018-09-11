package com.utng.pabloram.sanfelipe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import com.utng.pabloram.sanfelipe.R;

public class BaresDescriptionActivity extends AppCompatActivity {
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

            txtView = (TextView) findViewById(R.id.txt_name);
            imgView = (ImageView) findViewById(R.id.iv_logo);

            Bundle bundle = getIntent().getExtras();

            r1 = bundle.getString("Lenguajes");
            r2 = bundle.getInt("imgid");
            desc = bundle.getString("descripcion");

            imgView.setImageResource(r2);
            txtView.setText(r1);
            txtView.setText(desc);
            Log.d("imagen ", "imgid " + r2);
            Log.d("imagen ", "imgid " + r1);
            Log.d("imagen ", "imgid " + desc);


            if (r2 == 2131099846) {
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


            if (r2 == 2131099742) {
                ///ABRE FACEBOOK CHECOS
                ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
                btnFace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String facebookId = "fb://page/943373602417250";
                        String urlPage = "https://www.facebook.com/conchecorestobar/";

                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                        } catch (Exception e) {

                            //Abre url de pagina.
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                        }
                    }
                });
            }

            if (r2 == 2131099741) {
                ///ABRE FACEBOOK CHARANGA
                ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
                btnFace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String facebookId = "fb://page/1880618975550606";
                        String urlPage = "https://www.facebook.com/LaCharangaSF/";

                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                        } catch (Exception e) {

                            //Abre url de pagina.
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                        }
                    }
                });
            }

            if (r2 == 2131099737) {
                ///ABRE FACEBOOK BARHAUSE
                ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
                btnFace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String facebookId = "fb://page/728687297332235";
                        String urlPage = "https://www.facebook.com/HOUSE-BAR-728687297332235/";

                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                        } catch (Exception e) {

                            //Abre url de pagina.
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                        }
                    }
                });
            }


            if (r2 == 2131099739) {
                ///ABRE FACEBOOK BRIYETT
                ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
                btnFace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String facebookId = "fb://page/1417595431691647";
                        String urlPage = "https://www.facebook.com/Briyett/";

                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                        } catch (Exception e) {

                            //Abre url de pagina.
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                        }
                    }
                });
            }
            if (r2 == 2131099862) {
                ///ABRE FACEBOOK ZONA
                ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
                btnFace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String facebookId = "fb://page/585100221669839";
                        String urlPage = "https://www.facebook.com/ZONA-ANTRO-HOUSE-585100221669839/";

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
