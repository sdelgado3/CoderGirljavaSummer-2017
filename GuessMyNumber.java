import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static boolean gameKeepGoing(String yn)
    {
        if (yn.equals("yes")){            
            return true;
        }else{
            return false;}
    }

    public static void isGuessRight( int r, int g )
    {

        if(100<g || g<1){
            out.print("Oops! That number isn't between 1 and 100. Try again.");

        }else if (g > r){
            out.println("My number is lower.");

        }else if (g < r){
            out.println("My number is higher.");

        }else if (r == g){
            out.println("You got it!");
            out.println("My number was " + r);

        }

    }

    public static boolean playerkeepGoing (int r, int g ){
        if(100<g || g<1){
            return true;
        }else if (g > r){
            return true;
        }else if (g < r){
            return true;
        }else if (r == g){
            return false;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        Random number = new Random(System.currentTimeMillis());
        int random = number.nextInt(100);
        int tries = 0;
        int guessNum;
        String wantToStop="yes";
        String p1="";
        String p2="";
        int p1tries=0;
        int p2tries=0;

        out.println("I am thinking of a number between 1 and 100. What is it?");

        while (gameKeepGoing(wantToStop))
        {
            tries=0;
            while (tries <4){
                boolean x = true;
                p1tries=0;
                p2tries=0;
                    out.println("Player 1, Enter your name ");
                    p1 = input.nextLine();
                while(p1tries <3 && x==true){
                    out.println(p1 + "  guess a number:");
                    guessNum= input.nextInt();
                    input.nextLine();
                    p1tries++;
                    isGuessRight(random,guessNum);
                    x = playerkeepGoing(random,guessNum);
                }
                tries++;
            
                    out.println(" Player 2, Enter your name");
                    p2 = input.nextLine();
                while(p2tries <3 && x==true){
                    out.println(p2 +"  guess a number:");
                    guessNum= input.nextInt();
                    input.nextLine();
                    p2tries++; 
                    isGuessRight(random,guessNum);
                    x = playerkeepGoing(random,guessNum);
                }
                tries++;
               
            }
            out.print("Play again?");
            wantToStop = input.nextLine();
        }
        out.println("The random number was "+random);
        out.println("End of game");
    }
}






            
         

         


           
    
       
