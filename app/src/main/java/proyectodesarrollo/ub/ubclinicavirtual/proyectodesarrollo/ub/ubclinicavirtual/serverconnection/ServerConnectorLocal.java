package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import android.widget.Toast;

import java.util.ArrayList;

public class ServerConnectorLocal implements IServerConnector {


    ArrayList<Integer>listaL = new ArrayList<Integer>();



    public ServerConnectorLocal() {

        listaL.add(1);
        listaL.add(2);
        listaL.add(3);
        listaL.add(4);

    }

    @Override
    public int signIn(String url, String user, String password) {
        return 0;
    }

    @Override
    public int login(String url, String user, String password) {
        return 1;
    }

    @Override
    public int logOut() {
        return 0;
    }

}
