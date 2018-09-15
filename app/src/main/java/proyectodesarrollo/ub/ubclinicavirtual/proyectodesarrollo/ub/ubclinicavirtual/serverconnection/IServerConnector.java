package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

public interface IServerConnector {

    public int login(String url, String user, String password);

    public Integer getValor();

    public String getMensaje();

}
