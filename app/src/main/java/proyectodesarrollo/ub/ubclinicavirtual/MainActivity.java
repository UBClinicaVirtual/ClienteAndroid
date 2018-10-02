package proyectodesarrollo.ub.ubclinicavirtual;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.HttpURLConnection;

import proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection.*;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn = (Button) findViewById(R.id.boton);
         btn.setOnClickListener( new btnRequestServer() );
    }

    @Override
    public void onStart(){
        super.onStart();
    }

    public class btnRequestServer implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            CHTTPRequest.getRequest("http://www.google.com/").execute();
            //testConection();

        }

        //PRUEBAS PARA CONEXION MOCK
        public void testConection(){
            TestGestionarJSON gjson = new TestGestionarJSON() ;
            IServerConnector mConnection = ServerConnection.createLocalConnection();
            int resultado = gjson.getJSON();
            //Toast.makeText(this, gjson.getJSON() , Toast.LENGTH_SHORT ).show();
        }
    }



}
