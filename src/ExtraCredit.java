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
        System.out.println("\n");
        //calling static method for ouccuranceScan
        System.out.println("The number of times 33 occurs in the array is: ");
        System.out.println(occuranceScan(dataPoints, 33));
        System.out.println("\n");
        //calling static method for sum of dataPoints
        System.out.println("The sum of dataPoints is: " + sum(dataPoints));
        System.out.println();
        //calling static method for boolean contains which will return true if array contains target number
        System.out.println("Was the target found? " + contains(dataPoints, 33));
    }

    //static method for min
    public static int min(int values[])
    {
        //declaring and initializing random
        Random rnd = new Random();
        //declaring variables
        int min = 0;

        for(int row = 0; row < values.length; row ++)
        {
            //gives 100 integers at random from 1 - 100
            values[row] = rnd.nextInt(100) + 1;

            //if condition to find min value
            if(min > values[row])
            {
                min = values[row];
            }
            //printing table to see the random numbers generated for min
            System.out.printf("%5d",values[row]);
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
        //declaring variables
        int max = 0;

        for(int row = 0; row < values.length; row ++)
        {
            //gives 100 integers at random from 1 - 100
            values[row] = rnd.nextInt(100) + 1;

            //if condition to find max value
            if(max < values[row])
            {
                max = values[row];
            }
            //printing table to see the random numbers generated for max
            System.out.printf("%5d",values[row]);
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


        //declaring variable to use to count number of times user number occurs in the array
        int count = 0;
        //for loop that iterates thru dataPoints array
        for(int row = 0; row < values.length; row ++)
        {
            values[row] = rnd.nextInt(100) + 1; //makes random integers between 1 - 100
            if(values[row] == target)
            {
                count++;
            }
        }
        //returns the number of times the target is found in array
        return count;
    }

    //static method for sum
    public static int sum(int values[])
    {
        //declaring and initializing random
        Random rnd = new Random();
        //declaring variables
        int sumDataPoints = 0;

        for(int row = 0; row < values.length; row ++)
        {
            //creates 100 random integers between 1 - 100
            values[row] = rnd.nextInt(100) + 1;
            //gives the sum of all the data points added up
            sumDataPoints = sumDataPoints + values[row];
            //printing out table to see what is being added up
            System.out.printf("%5d", values[row]);
            if(row % 20 == 0)
            {
                System.out.println("");
            }
        }
        System.out.println();
        return sumDataPoints;
    }

    //static method for boolean contains, returns true if target value is found in array
    public static boolean contains(int values[], int target)
    {
        //declaring and initializing random
        Random rnd = new Random();
        //declaring variables
        boolean foundTarget = false;

        for(int row = 0; row < values.length; row ++)
        {
            values[row] = rnd.nextInt(100) + 1; //makes random integers between 1 - 100
            if(values[row] == target)
            {
                foundTarget = true;
                System.out.println("The value " + target + " was found at array index " + row);
                break; // if the target is found in array, boolean is true, outputs target and location, and breaks out of loop
            }
        }
        //if condition to output if the target is not found in the for loop
        if(!foundTarget)
        {
            System.out.println("Value " + target + " not found!");
        }
        //returns true or false whether target is found
        return foundTarget;
    }
}
