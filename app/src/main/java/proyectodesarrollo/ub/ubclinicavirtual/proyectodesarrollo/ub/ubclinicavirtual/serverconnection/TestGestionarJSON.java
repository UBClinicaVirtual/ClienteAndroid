package proyectodesarrollo.ub.ubclinicavirtual.proyectodesarrollo.ub.ubclinicavirtual.serverconnection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

//Esot es necesario si se utiliza https para hacer la peticion( hosting real )
import javax.net.ssl.HttpsURLConnection;

/*
 * Como enviar un requerimiento POST http/https para hacer el login
 * Source: https://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/
 */
public class TestGestionarJSON {

    public int getJSON(){
        try {

            ///////////////////////////////////////////////////////////////////
            //Preparo el requerimiento

            //hosting real en https
//			String url = "https://ubclinicavirtual.000webhostapp.com/api/v1/login";

            //hosting http
            String url = "http://www.google.com";
            URL obj = new URL(url);
//            URL obj = new URL("http", "www.ubclinicavirtual.tk", "api/v1/login");

            //Hosting en https
//			HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

            //Hosting redireccionado en http
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            ///////////////////////////////////////////////////////////////////
            //add reuqest header

            con.setRequestMethod("POST");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("Content-Type", "application/json");

            ///////////////////////////////////////////////////////////////////
            //Envio un access_token(el access token varia según el tiempo, deben generar uno propio en cada intento de login)
            //TODO buscar como refactorizar la generacion del json para enviar como parametro
            String urlParameters = "{\"access_token\": \"ya29.GlwkBnUjEebsQzRKx7um1tFc2IXXoViCbu5LM_oSjha4tPAinOL7fTIVOEPFAD4OUkg1jxzyi0QEi15cqLjj6c44sLsASBjtOH_0m1RzXmjTXLC4NWOlUtQSw3eP_A\"}";

            ///////////////////////////////////////////////////////////////////
            // Send post request

            con.setDoOutput(true);
            con.getOutputStream();//ESTO ESTA MAL
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();

            ///////////////////////////////////////////////////////////////////
            //Analizo la respuesta

            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            ///////////////////////////////////////////////////////////////////
            //print result

            System.out.println(response.toString());

            return responseCode;

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
