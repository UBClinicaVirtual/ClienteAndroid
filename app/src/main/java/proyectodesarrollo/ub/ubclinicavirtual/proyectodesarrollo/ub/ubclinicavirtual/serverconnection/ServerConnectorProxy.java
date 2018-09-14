package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

public class ServerConnectorProxy implements IServerConnector {

    private IServerConnector connector;
    private IInternetConectionListener internetListener;


    public void addInternetListener(IInternetConectionListener l) {
        internetListener = l;
    }
    @Override
    public int login(String url, String user, String password) {
        checkInternet();
        return getConnector().login(url, user, password);
    }

    private void checkInternet() {

        if(false)
            internetListener.noHayInternet();
        else
            internetListener.hayInternet();
    }

    public IServerConnector getConnector() {
        return connector;
    }

    public void setConnector(IServerConnector connector) {
        this.connector = connector;
    }

    @Override
    public Integer getValor() {
        this.checkInternet();
        return getConnector().getValor();
    }

}
