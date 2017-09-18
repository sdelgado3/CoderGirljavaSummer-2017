import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class guessMyNumber {

    public static void isGuessRight( int r, int g ){
        if(100<g || g<0){
            out.println("Oops! That number isn't between 1 and 100. Try again.");

        }if (g > r){
            out.println("My number is lower.");

        }if (g < r){
            out.println("My number is higher.");

        }if (r == g){
            out.println("You got it!");
            out.println("My number was " + r);
        }
    }

    public static void main(String[] args) {
        boolean playAgain;

        do {
            Scanner input= new Scanner (System.in);
            Random number = new Random(System.currentTimeMillis());
            int random = number.nextInt(100);
            int tries = 0;
            int guessNum=0;
            playAgain = false;

            String nm="";
            out.println("I am thinking of a number between 1 and 100. What is it?");
            out.println(" Enter 1st player name: ");
            String name = input.nextLine();
            out.println(" Enter 2nd player name: ");
            String name2 = input.nextLine();

            while (tries <10 && guessNum != random){
                int p1tries=0;
                int p2tries=0;

                while(p1tries <1 && guessNum != random){

                    nm=name;
                    out.println(nm + " please guess your number:");
                    guessNum= input.nextInt();
                    input.nextLine();
                    p1tries++;
                    isGuessRight(random,guessNum);
                    tries++;

                    while(p2tries <1 && guessNum != random){   

                        nm = name2;
                        out.println(nm +" please guess your number:");
                        guessNum= input.nextInt();
                        input.nextLine();
                        p2tries++; 
                        isGuessRight(random,guessNum);
                        tries++;
                    }
                }
                if(tries == 10){
                    out.println("You both suck at this game");
                    out.println("The random number was "+random);
                    out.println("End of game");
                    out.println("Play again?");
                    
                    switch (input.next()){
                        case "yes":
                        playAgain = true;
                        break;
                        default:
                        break;
                    }
                }

            }
            if(guessNum == random){
                tries = 0;
                out.println("\nPerfect "+ nm + "!! You guessed correctly!! "); 
                out.println("Play again?");
                
                switch (input.next()){
                    case "yes":
                    playAgain = true;
                    break;
                    default:
                    break;
                }
            }
        }while (playAgain);
        out.println("good bye");

    }

}
