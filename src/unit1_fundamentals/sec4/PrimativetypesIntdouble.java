package unit1_fundamentals.sec4;

public class PrimativetypesIntdouble {


    public static void main(String[] args) {

        int x = 17;
        System.out.println(x);
        x = 8;
        System.out.println(x);
        x = 26; // once the variable is declared, there is no need to write int again.
        System.out.println(x);

        //
        x = 17;
        int y = 8;
        x = x + y + x;
        System.out.println(x);

        //
        //a variable always needs to be initialized, meaning set it to a number. Example:
        //int x;
        // system.out.println(x);
        //x = 15; this will cause an error because we are trying to print without assigning a value

        //
        //A variable needs to be declared with the right primative type (double, int, ETC), Example:
        System.out.println(15/6); //this should give 2.5 but the system will treat it as two integers and truncate the rest of the numbers off and give 2 instead of 2.5
        System.out.println(15.0/6);// since 15.0 is a decimal it will not cut off and give 2.5

    }





}
