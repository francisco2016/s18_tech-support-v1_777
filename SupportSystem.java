/**
 * This class implements a technical support system. It is the top
 * level class in this project. The support system communicates via
 * text input/output in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from
 * the user, and an object of class Responder to generate responses.
 * It contains a loop that repeatedly reads input and generates output
 * until the users wants to leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput(); //la respuesta que d� el cliente se guarda en la VL input. 0094
            input = input.trim().toLowerCase();
            if(input.startsWith("bye") && input.endsWith("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);//0094 en esta actividad el mt recibe un par�metro
                System.out.println(response);
            }
        }
        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
