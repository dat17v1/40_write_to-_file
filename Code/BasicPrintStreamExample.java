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
            Scanner input = new Scanner(System.in);
            // System.out.println("Hvad skal file hedde");
            // String navn = input.next();
            // Læs fra text fil
            File f = new File("Text.txt");
            // Opretter ny fil hvis den ikke er der i forvejen
            f.createNewFile();
            //PrintStream file = new PrintStream(new File("person.txt"));
            Scanner scan = new Scanner(f);
            ArrayList<Person> persons = new ArrayList<Person>();
 
            while(scan.hasNextLine())
            {
                persons.add(new Person(scan.next(), scan.next(), scan.nextInt(), scan.next()));   
            }


            // ArrayListe af personer

            for(int i = 0; i < persons.size(); i++)
            {
                System.out.println(i + " " + persons.get(i));
            }
             
            System.out.print ("Hvilken person vil du redigere ");
            int number = input.nextInt();

            System.out.print("Hvad skal navnet være? ");
            String navn = input.next();
            persons.get(number).setName(navn);




            // Skriver til text filen
            PrintStream file = new PrintStream(f);
            persons.add(new Person("Hans", "Olsen", 67, "221070-9977"));
            
            for(int i = 0; i < persons.size(); i++)
            {
                // file.println();   
                
                file.print(persons.get(i).getName() + " " + persons.get(i).getLastName() + " " + persons.get(i).getAge() + " " + persons.get(i).getCpr());
                
                // ingen linieskift til den sidste person i arraylisten
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
