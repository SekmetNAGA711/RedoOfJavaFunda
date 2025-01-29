package unit1_fundamentals.sec7;

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
            System.out.println("Test");

        }

        //

        for(int i = 22;  i > 10; i--){
            System.out.println(i);
        }





    }








}
