import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;
    private HashSet<String> conjunto;//------------------------------------------------------------------------ 0094

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
        conjunto = new HashSet<>(); //------------------------------------------------------------------------ 0094
        
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        
        HashSet<String> palabras = new HashSet<>();//VL para guardar los String de la frase del cliente.  0094
        String[] arrayString = inputLine.split(" ");//guardo las palabras de la frase del cliente en un Arrays.
        for(int i = 0; i < arrayString.length; i ++){//recorro el Arrays con un bucle for.
            palabras.add(arrayString[i]);          //guardo los elementos de Arrays en el HashSet
        }
        return palabras; // devuelvo la VL del HashSet. y cambio el tipo Del metodo Strig por HashSet
    }
}