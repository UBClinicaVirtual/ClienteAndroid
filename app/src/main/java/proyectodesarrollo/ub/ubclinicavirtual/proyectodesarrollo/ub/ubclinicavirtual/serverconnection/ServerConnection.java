package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;
import android.content.Context;

//CLASE QUE PERMITE ELEGIR QUE TIPO DE CONEXION SE REALIZARÁ
//CONTIENE DOS METODOS, UNO PARA CONEXION LOCAL Y OTRO PARA CONEXION REAL
public class ServerConnection {

    //ESTE METODO CREA UNA CONEXION REAL CON EL SERVIDOR
    public static IServerConnector createRealConection(Context mContext) {

        ServerConnectorProxy proxy = initProxy(mContext);
        proxy.setmConnector(new ServerConnectorReal() );
        return proxy;

    }

    //ESTE METODO CREA UNA CONEXION LOCAL AL SERVIDOR MOCK
    public static IServerConnector createLocalConnection( Context mContext ) {

        ServerConnectorProxy proxy = initProxy(mContext);
        proxy.setmConnector(new ServerConnectorLocal() );
        return proxy;

    }


    //ESTE METODO INICIALIZA EL PROXY QUE ACTUARÁ COMO PUENTE DE LA CONEXION
    private static ServerConnectorProxy initProxy( Context mContext  ){
        ServerConnectorProxy proxy = new ServerConnectorProxy(mContext);
        proxy.addInternetListener(new InternetConextionListener());
        proxy.checkInternet();
        return proxy;
    }

}
