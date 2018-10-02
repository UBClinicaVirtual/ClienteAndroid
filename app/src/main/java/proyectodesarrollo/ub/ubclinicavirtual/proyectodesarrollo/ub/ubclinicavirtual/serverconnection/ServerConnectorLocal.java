package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import android.widget.Toast;

import java.util.ArrayList;

public class ServerConnectorLocal implements IServerConnector {


    ArrayList<Integer>listaL = new ArrayList<Integer>();



    public ServerConnectorLocal() {

        listaL.add(1);
        listaL.add(2);
        listaL.add(3);
        listaL.add(4);

    }

    @Override
    public int signIn(String url, String user, String password) {
        return 0;
    }

    @Override
    public int login(String url, String user, String password) {
        return 1;
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
        return 0;
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

}
