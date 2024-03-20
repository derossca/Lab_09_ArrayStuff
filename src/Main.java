//importing random
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();

        //TASK 1
        //part a
        //declare
        int [] dataPoints;
        //size
        dataPoints = new int[100];

        //part b
        //for loop to display array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            //gives 100 integers at random from 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;
            System.out.println(dataPoints[row]);
        }

        System.out.println();

        //part c
        //for loop to display array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            //gives 100 integers at random from 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;
            //displays dataPoints on same line separated by an |
            System.out.print(dataPoints[row] + " | ");
        }

        //to give space between parts
        System.out.println("\n");

        //part d
        //declaring and initializing variable for sum of dataPoints
        int sumDataPoints = 0;
        double aveDataPoints = 0;
        //for loop to display array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            //creates 100 random integers between 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;
            //gives the sum of all the data points added up
            sumDataPoints = sumDataPoints + dataPoints[row];
            //printing out table to see what is being added up and averaged
            System.out.printf("%5d", dataPoints[row]);
            if(row % 20 == 0)
            {
                System.out.println("");
            }
        }
        System.out.println();
        //prints out the sum
        System.out.printf("The sum of all the data points is " + sumDataPoints);
        System.out.println(); // new line
        aveDataPoints = sumDataPoints / dataPoints.length; //gives the average of all the data points
        System.out.printf("The average of all the data points is " + aveDataPoints);

        System.out.println(); //making space between tasks

        //TASK 2
        //declaring variables
        Scanner in = new Scanner(System.in);

        //part a
        //using static method for userNum to get input of an integer within range set
        int userNum = SafeInput.getRangedInt(in, "Choose a number between ", 1, 100);

        System.out.println();
        //part b


        //part c
        //calling method for user input
        userNum = SafeInput.getRangedInt(in, "Choose a value between ", 1, 100);
        //for loop to run through array to search for user input
        for(int row = 0; row < dataPoints.length; row ++)
        {
            if(dataPoints[row] == userNum)
            {
                System.out.println("The value " + userNum + " was found at array index " + row);
            }
        }

        System.out.println(); //creating space between parts

        //part d
        //declaring and initializing variables
        int min = dataPoints[0];
        int max = dataPoints[0];

        //for loop to generate random numbers from array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            //creates 100 random integers between 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;

            //if condition that finds the minimum integer
            if (min > dataPoints[row])
            {
                min = dataPoints[row];
            }

            //if condition to find the max integer
            if (max < dataPoints[row])
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

        //displaying output for min/max
        System.out.println(); // making min be on new line
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);

        //part e
    }
}