package com.utng.pabloram.sanfelipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.utng.pabloram.sanfelipe.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {
    /** Duration of wait **/
    private  static  final  long SPLASE_SCREEN_DELAY= 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Aplicar orientacion del imagen
        //ocultar barra de titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        TimerTask task =new TimerTask() {
            @Override
            public void run() {
                //iniciar mainActivity
                finish();
                Intent mainIntent= new Intent().setClass(SplashActivity.this, MenuActivity.class);
                startActivity(mainIntent);
            }
        };
        //simula la carga de un proceso en la aplicacion
        Timer timer=new Timer();
        timer.schedule(task,SPLASE_SCREEN_DELAY);
    }
}
