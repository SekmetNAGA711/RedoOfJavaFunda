package unit1_fundamentals.Sec8;

import java.util.Scanner;

public class SizeTypesFortune {

    public static void main(String[] args) {
        double[] bar = new double[8];
        /* This is how we create an array to store numbers, so this array stores 8  double variables, all the variables will have a O
        value, we will have to assign it a value for each, see below */
        bar[0] = 8.8;
        bar[1] = 8.0;

        System.out.println(bar[1]);

        Fortune();

    }


    public static void Fortune() {

        Scanner scanner = new Scanner(System.in);

        String[] predictions = new String[4];
        predictions[0] = "a pioneer";
        predictions[1] = "a scientist";
        predictions[2] = "a astrologer";
        predictions[3] = "a programmer";

        System.out.println("I will predict your future. Choose 1, 2, 3, or 4:  ");

        int choice = scanner.nextInt(); // Storing the user answer

        System.out.println("In your Future you will be " + predictions[choice -1] );
        /* the number the user gives will tell the system which index to select. now we can put [choice-1] because the chooses 1, 2, 3 or 4 are 1 less than the actual index,
        * this is a chose we can make because, if the user enters 1, it grabs "a pioneer"  and if the user enters 2, it grabs "a scientist" and so on */





    }








}
