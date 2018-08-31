package com.example.fromero.hospitaldeclinicas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by fromero on 12/07/2017.
 */

public class SplashActivity extends Activity{


    //Duracion en milisegundos que se mostrara el splash
    private final int Duracion_Splash = 3000;  // 3 segundos

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        // En la plantilla splash.xml esta la informacion que se quiera mostrar, en este caso el logo
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Pasado los 3 segundos, se pasa a la actividad principal.
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, Duracion_Splash);
    }
}
