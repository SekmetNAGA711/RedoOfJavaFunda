package unit1_fundamentals.sec5;

import java.util.Scanner;

public class Excercise {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + age*2 + " years old");
        System.out.println("You have " + firstName.length() + " Characters in your name");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);







    }



}
