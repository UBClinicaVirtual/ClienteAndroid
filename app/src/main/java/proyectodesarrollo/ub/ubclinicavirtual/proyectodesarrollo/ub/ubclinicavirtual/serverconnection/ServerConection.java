package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

public class ServerConection {

    public static IServerConnector createRealConection() {

        ServerConnectorProxy proxy = new ServerConnectorProxy();
        proxy.addInternetListener(new InternetConextionListener());
        proxy.setConnector(new ServerConnectorReal() );
        return proxy;

    }

    public static IServerConnector createLocalConection() {

        ServerConnectorProxy proxy = new ServerConnectorProxy();
        proxy.addInternetListener(new InternetConextionListener());
        proxy.setConnector(new ServerConnectorLocal() );
        return proxy;

    }

}
