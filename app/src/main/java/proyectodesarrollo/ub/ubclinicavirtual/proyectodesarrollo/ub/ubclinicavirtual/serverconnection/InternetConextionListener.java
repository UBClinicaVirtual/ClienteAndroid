package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

public class InternetConextionListener implements IInternetConectionListener {

    @Override
    public void noHayInternet() {
        System.out.println("NO HAY INTERNET");

    }

    @Override
    public void hayInternet() {
        System.out.println("HAY INTERNET");

    }

}
