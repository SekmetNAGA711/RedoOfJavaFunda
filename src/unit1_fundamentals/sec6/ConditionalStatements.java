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
        System.out.print("Please enter your heigh in centimetres: ");
        int height = scanner.nextInt();

//when the condition in the brackets is true the program in the curly brackets ie the body will run if not it will not
if(height<130) {

    System.out.println("Sorry, you are too short.");
}
else if(height > 220){//once an 'if' is apart add a () and {}//
    System.out.println("Sorry, you are too tall");
}
else {
    System.out.println("Height accepted. Go ahead.");
}
//else if blocks must go in between, if statements must come first.








    }



}
