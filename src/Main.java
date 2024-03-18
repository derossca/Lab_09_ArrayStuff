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
        dataPoints = new int[101];

        //part b
        //for loop to display array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            //gives 100 integers at random from 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;
            System.out.println(dataPoints[row]);
        }

        //part c
        //for loop to display array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            //gives 100 integers at randomn from 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;
            //displays dataPoints on same line separated by an |
            System.out.print(dataPoints[row] + " | ");
        }

        //to print what's next on new line
        System.out.println();

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
        }
        //prints out the sum
        System.out.printf("The sum of all the data points is " + sumDataPoints);
        System.out.println(); // new line
        aveDataPoints = sumDataPoints / dataPoints.length; //gives the average of all the data points
        System.out.printf("The average of all the data points is " + aveDataPoints);

        //TASK 2
        //declaring variables
        Scanner in = new Scanner(System.in);
        //using static method for userNum to get input of an integer within range set
        int userNum = SafeInput.getRangedInt(in, "Choose a number between 1 - 100", 1, 100);

    }
}