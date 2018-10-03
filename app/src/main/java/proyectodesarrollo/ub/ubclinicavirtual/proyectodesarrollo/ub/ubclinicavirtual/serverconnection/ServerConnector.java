package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

public class ServerConnector {

    public static IServerConnector getInstance(){
        return new ServerConnectorDesarrollo();
    }
}
