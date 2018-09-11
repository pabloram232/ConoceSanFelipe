package com.utng.pabloram.sanfelipe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.utng.pabloram.sanfelipe.R;

public class HotelsDescriptionActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_description_hotels);

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


        if (r2 == 2131099849) {
            ///ABRE FACEBOOK hotel roma
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/300478093420467";
                    String urlPage = "https://www.facebook.com/pages/Hotel-Roma-En-San-Felipe-Guanajuato/300478093420467";

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
            ///ABRE FACEBOOK hotel la luz
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/279658802795619";
                    String urlPage = "https://www.facebook.com/Hotel-La-Luz-279658802795619/";

                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                    } catch (Exception e) {

                        //Abre url de pagina.
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                    }
                }
            });
        }

        if (r2 == 2131099861) {
            ///ABRE FACEBOOK vista jardin
            ImageButton btnFace = (ImageButton) findViewById(R.id.btn_face);
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String facebookId = "fb://page/227445427657051";
                    String urlPage = "https://www.facebook.com/Hotel-Vista-Jardin-227445427657051/";

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
