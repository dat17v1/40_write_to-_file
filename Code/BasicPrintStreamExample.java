import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class BasicPrintStreamExample
{
    public static void main(String[] args)
    {
        try{
            // Læs fra text fil
            Scanner scan = new Scanner(new File("person.txt"));
            ArrayList<Person> persons = new ArrayList<Person>();
 
            while(scan.hasNextLine())
            {
                persons.add(new Person(scan.next(), scan.next(), scan.nextInt(), scan.next()));   
            }

            // Skriver til text filen
            PrintStream file = new PrintStream(new File("person.txt"));
            persons.add(new Person("Hans", "Olsen", 67, "221070-9977"));
            
            for(int i = 0; i < persons.size(); i++)
            {
                // file.println();   
                
                file.print(persons.get(i).getName() + " " + persons.get(i).getLastName() + " " + persons.get(i).getAge() + " " + persons.get(i).getCpr());
                
                if(i != persons.size() -1)
                {
                    file.println();
                }
            }

                
        
        
        } catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}
