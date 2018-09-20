package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import android.content.Context;
import android.widget.Toast;

public class ServerConnectorProxy implements IServerConnector {

    private IServerConnector mConnector;
    private IInternetConectionListener mInternetListener;
    private Context mContext;

    public ServerConnectorProxy(Context mContext) {
        setmContext(mContext);
    }


    public void addInternetListener(IInternetConectionListener l) {
        mInternetListener = l;
    }

    @Override
    public int signIn(String url, String user, String password) {
        return getmConnector().signIn(url,user,password);
    }

    @Override
    public int login(String url, String user, String password) {
        checkInternet();
        return getmConnector().login(url, user, password);
    }

    @Override
    public int logOut() {
        return getmConnector().logOut();
    }

    public void checkInternet() {

        //NOTIFICA SI HAY O NO INTERNET
        if(mInternetListener.InternetConnectivity()){
            Toast.makeText(getmContext(), "Hay internet", Toast.LENGTH_SHORT ).show();
        }else{
            Toast.makeText(getmContext(), "No Hay internet" , Toast.LENGTH_SHORT ).show();
        }

    }

    public IServerConnector getmConnector() {
        return mConnector;
    }

    public void setmConnector(IServerConnector mConnector) {
        this.mConnector = mConnector;
    }


    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    private Context getmContext(){
        return mContext;
    }
}
