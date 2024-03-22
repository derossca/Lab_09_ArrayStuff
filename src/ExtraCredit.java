//importing random and scanner
import java.util.Random;
import java.util.Scanner;

public class ExtraCredit {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        //declaring and initializing array

        int[] dataPoints = new int[100];

        //calling static method for min
        System.out.println("The min of dataPoints is: " + min(dataPoints));
        System.out.println("\n");
        //calling static method for max
        System.out.println("The max of dataPoints is: " + max(dataPoints));
    }

    //static method for min
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

    //static method for max
    public static int max(int values[])
    {
        //declaring and initializing random
        Random rnd = new Random();
        //declare and initialize array
        int [] dataPoints = new int[100];
        //declaring variables
        int max = 0;

        for(int row = 0; row < dataPoints.length; row ++)
        {
            //gives 100 integers at random from 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;

            //if condition to find min value
            if(max < dataPoints[row])
            {
                max = dataPoints[row];
            }
            //printing table to see the random numbers generated for min/max
            System.out.printf("%5d",dataPoints[row]);
            if (row % 20 == 0)
            {
                System.out.println("");
            }
        }

        System.out.println();
        return max;
    }

    //static method for number of times user number is found in the array
    public static int occuranceScan(int values[], int target)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int [] dataPoints = new int[100];

        //using static method for userNum to get input of an integer within range set
        int userNum = SafeInput.getRangedInt(in, "Choose a number between ", 1, 100);

        System.out.println();

        //declaring variable to use to count number of times user number occurs in the array
        int count = 0;
        //for loop that iterates thru dataPoints array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            dataPoints[row] = rnd.nextInt(100) + 1; //makes random integers between 1 - 100
            if(dataPoints[row] == userNum)
            {
                count++;
            }
        }
        //returns the number of times the userNum is found in array
        return count;
    }
}
