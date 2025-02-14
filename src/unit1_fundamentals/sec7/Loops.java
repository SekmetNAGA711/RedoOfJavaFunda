package unit1_fundamentals.sec7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {

    public static void main(String[] args) {
        //While loop.
        /* With an if statement when the end of the body is reached, the program will simply continue. However, when the
        end of the body is reached on a while loop, the program will go back up to the top and check the condition again.
        If it's true, it will run the body again and it will keep repeating this until the condition is false. At which point
         it will stop looping and simply skip the body and continue. So whereas an if statement will only run once a while,
          loop can run many times.
          The condition is true at first, but then turns false at some point in the future. A common way is to create a variable
          which acts like a counter. note: the variable can be used anywhere else
         */

        int i = 0;
        while(i < 10 ){
            System.out.println("test1");
            i = i +1; //this can be written like this i++, i +=1 for increase or i --

        }

        forLoop();



    }


    public static void forLoop(){
        /* The ForLoop is the compact version of achieving the while loop of increasing and decreasing
         * In the for loop the parentheses () hold the variable, the condition and the incrementation.
         * note: the variable is only available to the  for look  */

        for (int i = 0;  i <10; i++) {
            System.out.println("Test4");

        }

        //

        for(int i = 22;  i > 10; i--){
            System.out.println(i);
        }

        /*Using Break and continue.let's say we want to stop the loop before it has fully completed.
        Before this condition turns false, essentially. One thing we can do is write an if statement inside the loop. */
        for(int i = 1; i<= 8; i++) {
            if(i == 4){
                break;
            }
            System.out.println(i);

        }

        for(int i = 1; i<= 5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i);

        }





    }

    public static void doWhileLoop() {
        /* The Do while loop is the same as the while loop, except the condition is checked last rather than first. So all that happens is when
         the program reaches the loop, it will run any code in the body. Then check the condition. If it is true, the program will go back up to
         the top of the body and run it again. And it will keep repeating this process until the condition is false, at which point the program will continue.
          Therefore, a 'do while' loop will always run at least once.*/

//        int i = 0;
//
//        do {
//            i++;
//        } while (i< 5);
//
//


        Scanner scanner = new Scanner(System.in);
        String again = scanner.next();
        do {
            int num = ThreadLocalRandom.current().nextInt(1, 8);
            System.out.println("you rolled " + num + ".");
            System.out.println("Roll again? y/n: ");
            again = scanner.next();

        } while (again.equals("y"));

    }

    /*the modulo operator, which in Java is the percent sign. What this does is give you the remainder of a division.
    For instance, take nine divided by two, which is 4.5. Or if we're working in remainders, it's four remainder one.So what nine modulo
    two would give you is just the remainder -the one. Another example 23 modulo five? five can go into 20 4 times, the reminder is 3. So the answer
    is 4 with a reminder of 3*/
    public static void moduloOperator() {

        System.out.println(23 % 4 == 3); //this would be false, checking true or false
        System.out.println(15 % 2 == 0);//checking even or odd, evens will be true because evens gives 0 when dividing by 2






    }



}
