package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import android.content.Context;
import android.widget.Toast;

public class ServerConnectorProxy implements IServerConnector {

    private IServerConnector connector;
    private IInternetConectionListener internetListener;
    private Context mContext;

    public ServerConnectorProxy(Context mContext) {
        setmContext(mContext);
    }


    public void addInternetListener(IInternetConectionListener l) {
        internetListener = l;
    }
    @Override
    public int login(String url, String user, String password) {
        checkInternet();
        return getConnector().login(url, user, password);
    }

    public void checkInternet() {

        //Si hay internet que me notifique
        if(internetListener.InternetConnectivity()){
            Toast.makeText(getmContext(), "Hay internet", Toast.LENGTH_SHORT ).show();
        }else{
            Toast.makeText(getmContext(), "No Hay internet" , Toast.LENGTH_SHORT ).show();
        }

    }

    public IServerConnector getConnector() {
        return connector;
    }

    public void setConnector(IServerConnector connector) {
        this.connector = connector;
    }

    @Override
    public Integer getValor() {
        return getConnector().getValor();
    }

    @Override
    public String getMensaje() {
        return getConnector().getMensaje();
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    private Context getmContext(){
        return mContext;
    }
}
