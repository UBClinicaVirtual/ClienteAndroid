package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

public interface IServerConnector {

    //REGISTRARSE
    public int signIn  (String url, String user, String password);

    //INICIAR SESION
    public int login   (String url, String user, String password);

    //CERRAR SESION
    public int logOut  ();



}
