package proyectodesarrollo.ub.ubclinicavirtual;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "HOLA", Toast.LENGTH_SHORT).show();

        //testConection();
    }

    @Override
    public void onStart(){
        super.onStart();

        Toast.makeText(this, "HOLA", Toast.LENGTH_SHORT).show();
    }

    //Pruebas para la conexion al server mock
   /* public void testConection(){

        IServerConnector conexion = ServerConection();

        conexion.login(null, null, null);

        //mostrar mensaje en el cel que pudo conectarse

    }*/
}
