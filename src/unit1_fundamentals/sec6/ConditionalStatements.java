package unit1_fundamentals.sec6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

        /*operators (number left bigger than number on the right - false*Test
        > greater than
        >= greater than or equal to
        <less than
        <= less than or equal to

        Equality operators
        == equal to
        != not equal to
        */


Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SuperFast roller coaster");
        System.out.print("Please enter your height in centimetres: ");
        int height = scanner.nextInt();

//when the condition in the brackets is true the program in the curly brackets ie the body will run if not it will not
if(height >130 || height < 220) { // the || is the 'or' operator, only one expression has to be true for the block to run
    //&& logic operator, both have to be true for the statement to run

    System.out.println("Height accepted. Go ahead.");
}
//else if(height > 220){//once an 'if' is apart add a () and {}//
//    System.out.println("Sorry, you ");
//}
else {
    System.out.println("Sorry, you do not meet the height requirements");
}
//else if blocks must go in between, if statements must come first.

        comparingStrings();


    }

    public static void comparingStrings() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the VIP lounge");
        System.out.println("Age: ");
        int Age = scanner.nextInt();
        System.out.println("Do you have a VIP pass? Enter yes or no:  ");
        String vipPassReply = scanner.next();

        if(Age >= 18 && vipPassReply.equals("yes")  || Age >= 70 ) {
            System.out.println("Welcome to the club, go on in");
        }
        else {
            System.out.println("Sorry, no can do");
        }


    }





}
