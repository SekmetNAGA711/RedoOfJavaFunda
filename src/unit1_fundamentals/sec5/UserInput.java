package unit1_fundamentals.sec5;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);// scanner needs to be declared just like variables
//
//     String input1 = scanner.next(); //now I can use the scanner
//
//        System.out.println("\n" + input1);
//
//        AskQuestion();
        formatSpec();


    }

    public static void AskQuestion(){
        Scanner scanner2 = new Scanner(System.in);//Create a new scanner, tell it to read from the keyboard (System.in)
        System.out.println("What is your name?");
        String UserName = scanner2.next(); //next.() is used to scan strings, store it in a variable called UserInput,
        // create a string variable for the next() method to pick it up
        System.out.println(UserName + " is a wonderful name ");

        System.out.println("\nHow old are you, " + UserName + "?");
        int UserAge = scanner2.nextInt();// asking the scanner to scan for an integer
        System.out.println("Your name is " + UserName + " and you are " + UserAge + " years old");

        System.out.println("\nHow tall are you in metres?");
        double UserHeight = scanner2.nextDouble();
        System.out.println("You are " + UserHeight + " metres tall.");

    }

    public static void formatSpec() {

        System.out.format("I have %d cats, %d birds and 1 %s", 7, 2, "panther");
        //the d is called a format specifier, this replaces an integer, while %s replaces a string and %f replaces a float and double
        // %f rounds up to 6 decimal places, we can remove the decimal places by putting a .1 in front of f, which means round by 1 decimal place,
        // if .2 then 2 decimal places and so on
        // We are calling the format and supplyig it with two arguments, the string and the number
        System.out.println("\n");
        System.out.println( 4.5 - 2.7);
        System.out.format("\nwhen formatted: %.1f", 4.5 - 2.7);
    }


}
