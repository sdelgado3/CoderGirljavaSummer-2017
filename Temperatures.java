import static java.lang.System.out;
import java.util.Scanner;

public class Temperatures{

    public static void main(String[]args){

        out.println("Temperature Calculator");
        out.println("The data provider are:"+"\n");

        String [][]Days = {{"Sun"},{"Mon"},{"Tue"},{"Wed"},{"Thu"},{"Fri"},{"Sat"},};
        String [][]time = {{"7:00AM"},{"3:00PM"},{"7:00PM"},{"3:00AM"},};
        int[][] temps ={{68,70,76,70,68,71,75},
                {76,76,87,84,82,75,83},
                {73,72,81,78,76,73,77},
                {64,65,69,68,70,74,72},};

        for(int row=0; row<Days.length;row++){
            out.print(Days[row][0]+" ");
        }
        out.println("");

        for(int row=0;row<4;row++){
            for(int column=0; column<1; column++){
                out.print(" "+time[row][column]);
            }
            for(int j =0; j<7; j++){
                out.print(" "+temps[row][j]+" ");
            }
            out.println(""+"\n");
        }

        int sum = 0;

        out.println("  Based on that data, the following are the average temperatures for the week."+"\n");
        for(int row=0;row<4;row++){
            for (int column =0; column<7; column++){
                sum+= temps[row][column];
            }
            int ravg= sum/(int)7;
            out.print(" "+time[row][0]+": Average "+ ravg +"\n\n");
            sum=0;
        }

        for (int column =0; column<7; column++){
            for(int row=0;row<4;row++){
                sum+= temps[row][column];
            }
            int cavg= sum/(int)4;
            out.print(" "+Days [column][0]+": Average "+ cavg +"\n\n");
            sum=0;
        }
        out.print("  The final average temperature for the week was:"+"\n");

        for (int row = 0; row <4; row++) {
            for (int column= 0;column <7; column++) {
                sum+= temps[row][column];
            }
        }
        int tavg= sum/(int)28;
        out.println("\n Overall: "+ tavg);
        sum=0;

    }
}

