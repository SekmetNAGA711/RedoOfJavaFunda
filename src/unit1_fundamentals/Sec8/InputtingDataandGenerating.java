package unit1_fundamentals.Sec8;

import java.util.Scanner;

public class InputtingDataandGenerating {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of laps: ");
        int numberOfLaps = scanner.nextInt();



        double[] lapTimes = new double[numberOfLaps];

      for(int i = 0; i<numberOfLaps; i++)
      {

          System.out.println("Lap time: ");
          lapTimes[i] = scanner.nextDouble();



      }



    }


}
