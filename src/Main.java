//importing random
import java.util.Random;
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
            System.out.printf(dataPoints[row] + " | ");
        }

        //to print what's next on new line
        System.out.println();

        //part d
        //for loop to display array
        for(int row = 0; row < dataPoints.length; row ++)
        {
            //gives 100 random integers from 1 - 100
            dataPoints[row] = rnd.nextInt(100) + 1;
            System.out.println(dataPoints[row]);
        }
    }
}