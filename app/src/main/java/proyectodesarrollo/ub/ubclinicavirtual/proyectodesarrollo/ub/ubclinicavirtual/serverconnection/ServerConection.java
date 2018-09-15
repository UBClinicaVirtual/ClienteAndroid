package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;
import android.content.Context;
import android.widget.Toast;

public class ServerConection {

    public static IServerConnector createRealConection(Context mContext) {

        ServerConnectorProxy proxy = initProxy(mContext);
        proxy.setConnector(new ServerConnectorReal() );
        return proxy;

    }

    public static IServerConnector createLocalConnection( Context mContext ) {

        ServerConnectorProxy proxy = initProxy(mContext);
        proxy.setConnector(new ServerConnectorLocal() );
        return proxy;

    }

    private static ServerConnectorProxy initProxy( Context mContext  ){
        ServerConnectorProxy proxy = new ServerConnectorProxy(mContext);
        proxy.addInternetListener(new InternetConextionListener());
        proxy.checkInternet();
        return proxy;
    }

}
