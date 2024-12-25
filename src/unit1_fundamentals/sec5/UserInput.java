package unit1_fundamentals.sec5;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);// scanner needs to be declared just like variables

     String input1 = scanner.next(); //now I can use the scanner

        System.out.println("\n" + input1);

        AskQuestion();


    }

    public static void AskQuestion(){
        System.out.println("What is your name?");
        Scanner scanner2 = new Scanner(System.in);//Create a new scanner, tell it to read from the keyboard (System.in)
        String UserName = scanner2.next(); //next.() is used to scan strings, store it in a variable called UserInput,
        // create a string variable for the next() method to pick it up
        System.out.println(UserName + " is a wonderful name ");

        System.out.println("\nHow old are you?");
        int UserAge = scanner2.nextInt();// asking the scanner to scan for an integer
        System.out.println("Your name is " + UserName + " and you are " + UserAge + " years old");


    }


}
