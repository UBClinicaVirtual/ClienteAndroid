package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

public interface IServerConnector {

    int signIn(String url, String user, String password);

    int login(String url, String user, String password);

    //Register with gmail
    public int signIn  (String user, String password);

    //Login with gmail
    public int login   (String user, String password);

    //Logout with an api_token
    public int logOut  ();

    //Get the general user information based in the api_token
    public int getUserInformation( String idUser);

    //Deactivate a user's account with an api_token
    public int deactivateUserAccount(String idUser);

    //Add the clinic profile to the user's account with an api_token
    public int addClinicProfileToUserAccount(String idUser, String idClinic);

    //Search a clinic by likely business_name
    public int searchClinicByName(String clinicName);

    //Add the HCP profile to the user's account with an api_token
    public int addHCPProfileToUserAccount(String idUser, String idHCP);

    //Search a HCP
    public int searchHCP(String idHCP);

    //Add the patient profile to the user's account with an api_token
    public int addPatientProfileToUserAccount(String idUser, String idPatient);

    //Search a patient
    public int searchPatient(String idPatient);

    //Create a new Speciality
    public int createNewSpeciality(String specialityInfo);

    //Get a Speciality by id
    public int getSpecialityById(String idSpeciality);

    //Update a Speciality by id
    public int updateSpecialityById(String specialityInfo);

    //Search Specialities
    public int searchSpeciality(String specialityInfo);




}
