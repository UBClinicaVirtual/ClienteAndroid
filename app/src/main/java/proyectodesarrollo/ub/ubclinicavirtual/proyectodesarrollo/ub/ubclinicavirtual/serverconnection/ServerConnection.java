package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;
import android.content.Context;

//CLASE QUE PERMITE ELEGIR QUE TIPO DE CONEXION SE REALIZARÁ
//CONTIENE DOS METODOS, UNO PARA CONEXION LOCAL Y OTRO PARA CONEXION REAL
public class ServerConnection {

    //Conexion real al servidor
    public static IServerConnector createRealConection() {

        ServerConnectorProxy proxy = initProxy();
        proxy.setmConnector(new ServerConnectorReal() );
        return proxy;

    }

    //Conexion local al servidor mock
    public static IServerConnector createLocalConnection() {

        ServerConnectorProxy proxy = initProxy();
        proxy.setmConnector(new ServerConnectorLocal() );
        return proxy;

    }


    //Inicializa el proxy que actuara como puente
    private static ServerConnectorProxy initProxy(  ){
        ServerConnectorProxy proxy = new ServerConnectorProxy();
        proxy.addInternetListener(new InternetConextionListener());
        proxy.checkInternet();
        return proxy;
    }

}
