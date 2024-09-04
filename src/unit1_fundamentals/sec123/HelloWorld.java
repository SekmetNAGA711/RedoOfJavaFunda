package unit1_fundamentals.sec123;

public class HelloWorld { //This is the name of the recipe---- reminder -everything must go inside a class. Class serve more than a container

    //Ingredients would go here



    public static void main(String[] args) { //This is the method, methods always have brackets (), the name 'main' method is required. It is a starting point
        //Instructions for the method goes here
        System.out.println("Chocolate Sauce!");// Using println
        System.out.print("Cat\n");//Escape sequence using \n
        System.out.print("Anubis\n");
        System.out.print("rabbit\n");
        System.out.println("Year of the Dragon");
        System.out.println("The dog said \"woof\", then rolled around.");// this is how to escape the " " with a sentence
        System.out.println("C:\\users\\bob");// showing how we find a file and the reason for using double backslash
        prosper();


    }

// \n -new line
// \t - tab
// \b -backspace


    public static void prosper() {
        System.out.println("Year number 8");
        System.out.println("Lucky number 7");


    }






}