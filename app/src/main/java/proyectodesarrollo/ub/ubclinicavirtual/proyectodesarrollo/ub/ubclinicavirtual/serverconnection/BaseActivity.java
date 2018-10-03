package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import android.app.Activity;


// all activitys hasve to  extends this class
public class BaseActivity extends Activity {

    IServerConnector getConector(){
        return ServerConnector.getInstance();
    }
}
