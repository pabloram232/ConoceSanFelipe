package com.utng.pabloram.sanfelipe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.utng.pabloram.sanfelipe.R;

public class AbautActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        this.setTitle(R.string.abaout);
    }

}
