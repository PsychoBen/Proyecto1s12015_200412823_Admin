/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package Principal;

import static Principal.Principal.webClient;
import java.net.URL;
import javax.swing.JTextField;
import java.io.IOException;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import org.json.*;

/**
 *
 * @author Ben
 */
public class ConectarWebService {

    public ConectarWebService() {
    }    
    
    public static void crearAeropuerto(String nombr, String Passwordd,String ppais) throws IOException{
        URL url = new URL("http://localhost:5000/aeropuerto/insertar");

	RequestBody formBody = new FormEncodingBuilder()
                .add("NombreAeropuerto", nombr)
                .add("Contrasenia", Passwordd)
                .add("Pais", ppais)            
                .build();

	Request request = new Request.Builder().url(url).post(formBody).build();
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println(request);
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        System.out.println("********************* Este se ingreso ************************+");
	System.out.println(response_string);
        
    }
    
    public static void holaMundo(JTextField textoArea) throws IOException{
        URL url = new URL("http://localhost:5000/bienvenido");
	Request request = new Request.Builder().url(url).build();
	Response response = webClient.newCall(request).execute();
	String response_string = response.body().string();
        textoArea.setText(response_string);
    }
    
    
}
