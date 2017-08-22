
import static java.lang.System.out;
import java.util.Scanner;

public class ThankYouMailMerge1{
    
    
    public static void main(String[]args)
    {
        
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        out.println("---Thank you Letters---");
        
       while(keepGoing==true)
        {
            out.println("What is the donator's name and last name?");
             String firstLastName= input.nextLine();
              if (firstLastName == "quit"){
               keepGoing==false;
            }
            out.println("How much "+ firstLastName + " will donate?");
             double amount= input.nextFloat();
              
               out.println(" Dear "+ firstLastName );
               out.println(" Thank you for your donation! We rely on donors like you to keep our "+ amount);
               out.println(" organization effective, and you came through for us. Your donation of" ); 
               out.println(" will help our efforts to make a difference in the world.");
               out.println(" As you may know, we are a registered non-profit organization, so your");
               out.println(" donation is tax deductible. You may use this letter as a receipt for tax");
               out.println(" purposes.");
               out.println(" Thank you again for your support!");
               out.println(" Sincerely,");
               out.println(" Paula Jones");
               out.println(" YourCharity.org");
     
        }
      }
    }
    
      