package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import java.util.TreeSet;

public class ServerConnectorReal implements IServerConnector {

    TreeSet<String> triset = new TreeSet<String>();



    public ServerConnectorReal() {

        triset.add("43");
        triset.add("9222");
        triset.add("85");

    }

    @Override
    public int login(String url, String user, String password) {
        System.out.println("Conexion por la web");
        return 0;
    }

    @Override
    public Integer getValor() {
        return Integer.parseInt( triset.first() );
    }


}
