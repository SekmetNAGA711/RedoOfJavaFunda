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
if(height >130 || height < 220) { /* the || is the 'or' operator, only one expression has to be true for the block to run
    && logic operator, both have to be true for the statement to run*/

    System.out.println("Height accepted. Go ahead.");
}
/* else if(height > 220) {-----once an 'if' is apart add a () and {}
   System.out.println("Sorry, you ");
} */
else {
    System.out.println("Sorry, you do not meet the height requirements");
}
//else if blocks must go in between, if statements must come first.

        comparingStrings();
        lexicalScope();


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



    public static void lexicalScope() {
        /*Can not declare a variable in an if statement and use it outside the if statement. Variables declared
        inside the body of an if statement are called local variables, meaning can only be used inside the if
        statement. If a variable is declared within a method, it is localized within the that method and can be used only in
        that method and an if statement should there be an if statement in that method/* */

        int numPets = -1; /* if we declared it outside the if statement, it must be initialized with a value because should the if statement turn out to be false
                            then the value numPets in the if statement below will throw and error, because the then the numPet will never be initialized because
                            it is false, that means it can not be printed, Also sometimes it is better to give an invalid value like -1 because the user might enter
                            0 /**/
        if(true){
       Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number of pets you own: ");
         numPets= scanner.nextInt(); /*this variable would only be available within this if statement, if it was declared within this if statement, so we declared it outside the if statement,
                                     it would have been declared like this - int numPets = scanner.nextInt()/* */

     }
        System.out.println("You have " + numPets + " pets");


    }

    public static void switchStatement() { /*The switch statement is like a specialized 'if' statement.
                                          It can be useful when you want to compare a single variable against a number of values./**/

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
      if(num == 1) {
          System.out.println("you entered one.");
      } else if (num == 2) {
          System.out.println("you entered two");
      }
      else{
          System.out.println("Invalid number, please try again");
      }


    }








}
