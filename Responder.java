import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> cadena;
    private HashMap<String, String> cadena2;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        cadena = new ArrayList<>();
        cadena.add("1 Debe de comprobar la conexi�n a la red.");
        cadena.add("2 Tiene la bater�a descargada.");
        cadena.add("3 La capacidad de la menoria hace que su ordenador vaya lento.");
        cadena.add("4 Descargue la aplicaci�n de googleHeart, para verlo.");
        cadena.add("5 Los ordenadores HP  son una buena opci�n de compra para estos casos.");

        cadena2 = new HashMap<>();
        cadena2.put("precio", "La aver�a le costar� 50 euros.");
        cadena2.put("appel", "Son los m�s caros porque tienen dise�o personalizado.");
        cadena2.put("puertos", "Tiene 6 puertos por defecto, o m�s si le acopla un adaptador.");
        cadena2.put("multitarea", "Le recomendamos que instale Linux, ya que windows en multitarea falla.");

    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String respuesta)
    {//para poder realizar la actividad 0092 hemos creado el HashMap cadena2, y a�adido el par�metro "respuesta" que ser� la
        //palabra que se�ale el cliente.
        //despu�s creo una VL donde guardo la respuesta del cliente, inicianizandola a null.
        String solucion = null;
        solucion = cadena2.get(respuesta);//luego doy a la VL el valor que se asocie al par�metro coincidente con la clave.
                                     //si el valor del par�metro no est� como clave, devolver� null.
        if(solucion == null){         //y si la soluci�n == null le doy el valor del ArrayList.
            solucion = cadena.get(aleatorio.nextInt(cadena.size()));
        }
        return solucion ;
    }
}




