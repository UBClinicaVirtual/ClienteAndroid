package proyectodesarrollo.ub.ubclinicavirtual;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        //METODO PARA PROBAR LA CONEXION AUNQUE SEA LOCAL
        testConection();

    }

    //PRUEBAS PARA CONEXION MOCK
    public void testConection(){

        //CREAMOS UNA CONEXIÓN LOCAL AL SERVIDOR MOCK
        IServerConnector mConnection = ServerConnection.createLocalConnection(this);
        mConnection.login(null, null, null);
    }
}
