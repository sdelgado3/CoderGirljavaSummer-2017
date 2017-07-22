
import static java.lang.System.out;
import java.util.Scanner;

public class groceryList
{
public static void main(String[]args){
 Scanner input = new Scanner(System.in);

 String item= "Apple";
 out.println("Please list tree items on your grocery shopping list");
 out.println("Item 1?");
 String word1 = input.nextLine();
 out.println("Item 2?");
 String word2 = input.nextLine();
 out.println("Item 3?");
 String word3 = input.nextLine();
 
 int qt= 3;
 out.println("Now, please enter the quantity of each item");
 out.println("How many "+ word1+" ?");
 int qt1 = input.nextInt();
 out.println("How many "  + word2 +  " ?");
 int qt2 = input.nextInt();
 out.println("How many "  + word3 +  " ?");
 int qt3 = input.nextInt();
 
 float cost = 2.5f;
 out.println("Now, please enter the price of each item?");
 out.println("How much does one "  + word1 +  " cost?");
 float cost1 = input.nextFloat();
 out.println("How much does one "  + word2 +  " cost?");
 float cost2 = input.nextFloat();
 out.println("How much does one "  + word3 +  " cost?");
 float cost3 = input.nextFloat();
 

 float total = (qt1 * cost1) + (qt2 * cost2) + (qt1 * cost1);
 out.println("Your total cost is  $" + total);

   
 }
}