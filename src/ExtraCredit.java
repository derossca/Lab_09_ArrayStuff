//importing random and scanner
import java.util.Random;
import java.util.Scanner;

public class ExtraCredit {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        //declaring and initializing array

        int[] dataPoints = new int[100];

        //
        System.out.println("The min of dataPoints is: " + min(dataPoints));
    }

    public static int min(int values[])
    {
        //declaring and initializing random
        Random rnd = new Random();
        //declare and initialize array
        int [] dataPoints = new int[100];
        //declaring variables
        int min = 0;

        for(int row = 0; row < dataPoints.length; row ++)
        {
            //gives 100 integers at random from 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;

            //if condition to find min value
            if(min > dataPoints[row])
            {
                min = dataPoints[row];
            }
            //printing table to see the random numbers generated for min/max
            System.out.printf("%5d",dataPoints[row]);
            if (row % 20 == 0)
            {
                System.out.println("");
            }
        }

        System.out.println();
        return min;
    }
}
