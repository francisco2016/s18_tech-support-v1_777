import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> cadena;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        cadena = new ArrayList<>();
        cadena.add("1 Debe de comprobar la conexión a la red.");
        cadena.add("2 Tiene la batería descargada.");
        cadena.add("3 La capacidad de la menoria hace que su ordenador vaya lento.");
        cadena.add("4 Descargue la aplicación de googleHeart, para verlo.");
        cadena.add("5 Los ordenadores HP  son una buena opción de compra para estos casos.");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int sol = aleatorio.nextInt(cadena.size());
        return cadena.get(sol);
    }
}








