
import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args)
    {
        for(; ;){
            Scanner keyboard = new Scanner(System.in);
            int goalForVeggies = 50;
            int goalForBurgers = 250;
            int goalForSubs = 180;
            int goalForSoup = 70;

            out.println("Checking sales goals."+'\n');
            out.println(" The sales goal for veggie sandwiches is 50");
            out.println("How many veggie sandwiches were sold today?");
            int goalVeggies  = keyboard.nextInt();
            if (goalVeggies >= 50){
                out.println("Made goal for veggies."+'\n');
            }else{
                out.println("Goal for veggies fell short."+'\n');

            }

            out.println(" The sales goal for burgers is 250");
            out.println("How many burgers were sold today?");
            int goalBurgers = keyboard.nextInt();
            if (goalBurgers >= 250){
                out.println("Made goal for burgers."+'\n');
            }else{
                out.println("Goal for burgers fell short."+'\n');

            }

            out.println(" The sales goal for subs is 180");
            out.println("How many subs were sold today?"); 
            int goalSubs = keyboard.nextInt();
            if (goalSubs >= 180){
                out.println("Made goal for subs."+'\n');
            }else{
                out.println("Goal for subs fell short."+'\n');

            }

            out.println(" The sales goal for soup is 70");
            out.println("How many soups were sold today?");
            int goalSoup = keyboard.nextInt();
            if (goalSoup >= 70){
                out.println("Made goal for soup."+'\n');
            }else{
                out.println("Goal for soup fell short."+'\n');
            }if (goalVeggies>=50 && goalBurgers>=250 && goalSubs>=180 &&
            goalSoup>=70){
                out.println("Made goal for everything!");
            }
        }
    }
}