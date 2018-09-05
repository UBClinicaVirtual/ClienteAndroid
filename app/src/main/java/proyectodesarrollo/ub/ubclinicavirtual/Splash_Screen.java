package proyectodesarrollo.ub.ubclinicavirtual;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

//public class Splash_Screen extends AppCompatActivity {
    public class Splash_Screen extends AppCompatActivity{


    //Duration Splash
        private final int Duration_Splash = 3000;  // 3 seconds

        @Override
        public void onCreate (Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash__screen);



            new Handler().postDelayed(new Runnable(){
                public void run(){
                    // pass 3 sec, go to log in activity.
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                };
            }, Duration_Splash);

        }
    }

