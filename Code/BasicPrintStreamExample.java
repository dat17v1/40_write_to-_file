import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;


public class BasicPrintStreamExample
{
    public static void main(String[] args)
    {
        try{
            
            // Scanner scan = new Scanner(new File("person.txt"));

            PrintStream file = new PrintStream(new File("person.txt"));
        
        
        
        } catch(FileNotFoundException e)
        {

        }
       
    }
}
