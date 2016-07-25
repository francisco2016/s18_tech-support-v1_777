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

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();

        return inputLine.split(" ")[0];

//               System.out.print("> ");         // print prompt
//              String inputLine = reader.nextLine();
//              String[] sol = inputLine.split(" "); 
//              for(int i = 1; i <= 1; i ++){
//                 inputLine = sol[0];
//              }
//          return inputLine;

    }
}







