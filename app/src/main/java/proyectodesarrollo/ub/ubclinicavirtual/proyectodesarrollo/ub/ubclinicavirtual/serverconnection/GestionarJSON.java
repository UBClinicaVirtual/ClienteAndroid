package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import proyectodesarrollo.ub.ubclinicavirtual.MainActivity;

public class GestionarJSON {

   private static final String USER_AGENT = "Mozila/5.0";



    public GestionarJSON (MainActivity mainActivity){

    }


    private void showJSON(String json) {
    }


    public String getJSON() {
        StringBuffer response = null;
        String urlString = "https://www.google.com.ar/";
        URL url = null ;

        try{

            url = new URL(urlString.toString()); // ACA SE ROMPE EL CODIGO
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent",USER_AGENT);
            con.setDoOutput(true);
            con.getResponseCode();
            BufferedReader in = new BufferedReader( new InputStreamReader( con.getInputStream() ));
            String inputLine;

            response = new StringBuffer();
            while((inputLine = in.readLine())!= null){

                response.append(inputLine);

            }

            return response.toString();
        } catch (MalformedURLException e) {
            //e.printStackTrace();
            return "URL INVALIDO";
        } catch (IOException e) {
            e.printStackTrace();
            return "RETURN INVALIDO 2";
        }

    }

}
