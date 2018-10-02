package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import android.content.Context;
import android.widget.Toast;

public class ServerConnectorProxy implements IServerConnector {

    private IServerConnector mConnector;
    private IInternetConectionListener mInternetListener;

    public ServerConnectorProxy() {
    }


    public void addInternetListener(IInternetConectionListener l) {
        mInternetListener = l;
    }

    @Override
    public int signIn(String url, String user, String password) {
        return getmConnector().signIn(url,user);
    }

    @Override
    public int login(String url, String user, String password) {
        checkInternet();
        return getmConnector().login(url, user);
    }

    @Override
    public int signIn(String user, String password) {
        return 0;
    }

    @Override
    public int login(String user, String password) {
        return 0;
    }

    @Override
    public int logOut() {
        return getmConnector().logOut();
    }

    @Override
    public int getUserInformation(String idUser) {
        return 0;
    }

    @Override
    public int deactivateUserAccount(String idUser) {
        return 0;
    }

    @Override
    public int addClinicProfileToUserAccount(String idUser, String idClinic) {
        return 0;
    }

    @Override
    public int searchClinicByName(String clinicName) {
        return 0;
    }

    @Override
    public int addHCPProfileToUserAccount(String idUser, String idHCP) {
        return 0;
    }

    @Override
    public int searchHCP(String idHCP) {
        return 0;
    }

    @Override
    public int addPatientProfileToUserAccount(String idUser, String idPatient) {
        return 0;
    }

    @Override
    public int searchPatient(String idPatient) {
        return 0;
    }

    @Override
    public int createNewSpeciality(String specialityInfo) {
        return 0;
    }

    @Override
    public int getSpecialityById(String idSpeciality) {
        return 0;
    }

    @Override
    public int updateSpecialityById(String specialityInfo) {
        return 0;
    }

    @Override
    public int searchSpeciality(String specialityInfo) {
        return 0;
    }

    public String checkInternet() {

        //NOTIFICA SI HAY O NO INTERNET
        if(mInternetListener.InternetConnectivity()){
            return "Hay Internet";
        }else{
            return "No hay internet";
        }

    }

    public IServerConnector getmConnector() {
        return mConnector;
    }

    public void setmConnector(IServerConnector mConnector) {
        this.mConnector = mConnector;
    }


}
