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
    }

    @Override
    public void onStart(){
        super.onStart();

        testConection();

    }

    //Pruebas para la conexion al server mock
    public void testConection(){

        //CONEXIÓN LOCAL
        IServerConnector conexion = ServerConection.createLocalConnection(this);
        conexion.login(null, null, null);
        Toast.makeText(this, conexion.getMensaje(), Toast.LENGTH_SHORT ).show();



    }
}
