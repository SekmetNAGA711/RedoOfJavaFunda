package unit1_fundamentals.sec4;

public class Typecasting {

    public static void main(String[] args) {
       int food = 5;

        int bar = food; // both variables will not contain 5
        System.out.println(bar);
        double cat = food; //this will be converted to a double, 5.0, this is known as an implicit conversion, if I started with
        //a double and tried to convert to an int it would result in an error
        System.out.println(cat);

        // because of this error we typecast, example:
        double iceCream = 8.00;
        int cone = (int)iceCream;
        System.out.println(cone);

        // another example
        int cup = 17;
        int ball = 4;
        System.out.println((double) cup / ball);// we know that diving 17 by 4 will be a decimal, so we typecast, we can typecast of either cup or
        //ball. There are several ways to do this but always remember to keep the typecast in it own brackets and typecast what you want first,
        //example:
        int soccer = 8;
        int football = 3;
        System.out.println(((double) soccer)/football);

        // if not we get different results.
        //Example:
        System.out.println((double)(cup/ball));// this results in 4.0, which is not what we want


    }


}
